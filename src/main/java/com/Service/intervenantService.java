package com.Service;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.Model.intervenant;
import com.ProjetAnnuel.HibernateUtil;

public class intervenantService implements Serializable {
	
	public boolean create(intervenant c,Session s) 
	{
		s.save(c); 

		return true;
	}
	
	public void delete(Session s,int id) 
	{
		
		intervenant c = s.get(intervenant.class, id);
		
		s.delete(c);

	}
	
	public void update(Session s,int id) 
	{
		
		intervenant c = s.get(intervenant.class, id);
		s.update(c); // UPDATE intervenant SET nom = c.getNom(), prenom= c.getPrenom() where id =id;

	}
	
	public intervenant findById(Session s,int id) 
	{
		
		intervenant c = s.get(intervenant.class, id); //SELECT * FROM intervenant where id = id;
		return c;
	}
	
	public List<intervenant> findAll(Session s) 
	{
		Query q = s.createQuery("from intervenant");
		List<intervenant> listeCom  = q.list(); //SELECT * FROM intervenant where id = id;
		return listeCom;
	}

}
