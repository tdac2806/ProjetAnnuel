package com.Service;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.Model.candidat;
import com.ProjetAnnuel.HibernateUtil;

public class candidatServiceTest {
	
	Session session = HibernateUtil.getSessionFactory().openSession();
	

     
	@Test
	public void testCreate() {
		System.out.println("Test de create() en cours...");
		session.beginTransaction();
	  
	    candidat c1 = new candidat("Test","Test","Test","Test","20210701");
	    Integer id = (Integer) session.save(c1);
	     
	    session.getTransaction().commit();
	     
	    assertTrue(id > 0);
	} 

	@Test
	public void testDelete() {
		
		System.out.println("Test de delete() en cours ..");
     
	    Integer id = 4;
	    candidatService cs = new candidatService();
	     
	    session.beginTransaction();
	    cs.delete(session,id);
	    session.getTransaction().commit();
	     
	    candidat deletedProduct = cs.findById(session, id);
	     
	    assertNull(deletedProduct);
		
		
	}

	@Test
	public void testUpdate() {
		System.out.println("Test de update() en cours...");
		session.beginTransaction();
      candidatService cs = new candidatService(); 
	    Integer id = 9;
	    candidat c1= new candidat("Albert", "test","test","test","20210702");
	    c1.setParcoursid(1);
	    
       cs.update(session, id, c1);

       candidat updatedProduct = cs.findById(session, id);
	    session.getTransaction().commit();
	    assertEquals("Albert", updatedProduct.getnom());

      
		
	}

	@Test
	public void testFindById() {
		
		System.out.println("Test de findbyId() en cours...");
		session.beginTransaction();
	     
	    Integer id = 1;
	     
	    candidat c1 = session.find(candidat.class, id);
	     
	    assertEquals("TestNom", c1.getnom()); 
		
	}

	@Test
	public void testFindAll() {
		
		System.out.println("Test de findAll() en cours ..");
		session.beginTransaction();
	     
	    Query<candidat> query = session.createQuery("from candidat", candidat.class);
	    List<candidat> resultList = query.getResultList();
	     
	    assertFalse(resultList.isEmpty());
		
	}

}
