package com.Service;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.Model.parcours;
import com.ProjetAnnuel.HibernateUtil;

public class parcoursService implements Serializable {
	
	public boolean create(parcours c,Session s) 
	{
		s.save(c); 

		return true;
	}
	
	public void delete(Session s,int id) 
	{
		
		parcours c = s.get(parcours.class, id);
		
		s.delete(c);

	}
	
	public void update(Session s,int id) 
	{
		
		parcours c = s.get(parcours.class, id);
		s.update(c); // UPDATE parcours SET nom = c.getNom(), prenom= c.getPrenom() where id =id;

	}
	
	public parcours findById(Session s,int id) 
	{
		
		parcours c = s.get(parcours.class, id); //SELECT * FROM parcours where id = id;
		return c;
	}
	
	public List<parcours> findAll(Session s) 
	{
		Query q = s.createQuery("from parcours");
		List<parcours> listeCom  = q.list(); //SELECT * FROM parcours where id = id;
		return listeCom;
	}

}
