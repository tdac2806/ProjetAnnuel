package com.Service;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.Model.candidat;
import com.ProjetAnnuel.HibernateUtil;

public class candidatService implements Serializable {
	
	public int create(candidat c,Session s) 
	{
		Serializable test = s.save(c); 
      
		return Integer.parseInt(test.toString());
	}
	
	public void delete(Session s,int id) 
	{
      Query query = s.createQuery("DELETE FROM candidat WHERE id = :candidat_id");
      query.setParameter("candidat_id", id);
      query.executeUpdate();;
	}
	
	public void update(Session s,int id, candidat candidat) 
	{
		candidat c = s.get(candidat.class, id);
      c.setnom(candidat.getnom());
      c.setprenom(candidat.getprenom());
      c.setParcoursid(candidat.getParcoursid());
      c.setemail(candidat.getemail());
      c.settel(candidat.gettel());
      c.setDateDispo(candidat.getDateDispo());
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
