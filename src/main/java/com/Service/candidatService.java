package com.Service;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.Model.candidat;
import com.ProjetAnnuel.HibernateUtil;

public class candidatService implements Serializable {
	
	public boolean create(candidat c,Session s) 
	{
		s.save(c); 

		return true;
	}
	
	public void delete(Session s,int id) 
	{
		
		candidat c = s.get(candidat.class, id);
		
		s.delete(c);

	}
	
	public void update(Session s,int id) 
	{
		
		candidat c = s.get(candidat.class, id);
		s.update(c); // UPDATE candidat SET nom = c.getNom(), prenom= c.getPrenom() where id =id;

	}
	
	public candidat findById(Session s,int id) 
	{
		
		candidat c = s.get(candidat.class, id); //SELECT * FROM candidat where id = id;
		return c;
	}
	
	public List<candidat> findAll(Session s) 
	{
		Query q = s.createQuery("from candidat");
		List<candidat> listeCom  = q.list(); //SELECT * FROM candidat where id = id;
		return listeCom;
	}

}