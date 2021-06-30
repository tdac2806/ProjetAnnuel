package com.Service;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.Model.entretien;
import com.ProjetAnnuel.HibernateUtil;

public class entretienService implements Serializable {
	
	public boolean create(entretien c,Session s) 
	{
		s.save(c); 

		return true;
	}
	
	public void delete(Session s,int id) 
	{
		
		entretien c = s.get(entretien.class, id);
		
		s.delete(c);

	}
	
	public void update(Session s,int id) 
	{
		
		entretien c = s.get(entretien.class, id);
		s.update(c); // UPDATE entretien SET nom = c.getNom(), prenom= c.getPrenom() where id =id;

	}
	
	public entretien findById(Session s,int id) 
	{
		
		entretien c = s.get(entretien.class, id); //SELECT * FROM entretien where id = id;
		return c;
	}
	
	public List<entretien> findAll(Session s) 
	{
		Query q = s.createQuery("from entretien");
		List<entretien> listeCom  = q.list(); //SELECT * FROM entretien where id = id;
		return listeCom;
	}

}

