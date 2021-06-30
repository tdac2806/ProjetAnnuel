package com.Service;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.Model.personnel;
import com.ProjetAnnuel.HibernateUtil;

public class personnelService implements Serializable {
	
	public boolean create(personnel c,Session s) 
	{
		s.save(c); 

		return true;
	}
	
	public void delete(Session s,int id) 
	{
		
		personnel c = s.get(personnel.class, id);
		
		s.delete(c);

	}
	
	public void update(Session s,int id) 
	{
		
		personnel c = s.get(personnel.class, id);
		s.update(c); // UPDATE personnel SET nom = c.getNom(), prenom= c.getPrenom() where id =id;

	}
	
	public personnel findById(Session s,int id) 
	{
		
		personnel c = s.get(personnel.class, id); //SELECT * FROM personnel where id = id;
		return c;
	}
	
	public List<personnel> findAll(Session s) 
	{
		Query q = s.createQuery("from personnel");
		List<personnel> listeCom  = q.list(); //SELECT * FROM personnel where id = id;
		return listeCom;
	}

}
