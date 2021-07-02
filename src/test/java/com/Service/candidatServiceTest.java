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
	  
	    candidat c1 = new candidat("Test","Test","Test","Test","Test");
	    Integer id = (Integer) session.save(c1);
	     
	    session.getTransaction().commit();
	     
	    assertTrue(id > 0);
	} 

	@Test
	public void testDelete() {
		
		System.out.println("Test de delete() en cours ..");
		session.beginTransaction();
	     
	    Integer id = 1;
	    candidat c1 = session.find(candidat.class, id);
	     
	    session.beginTransaction();
	    session.delete(c1);
	    session.getTransaction().commit();
	     
	    candidat deletedProduct = session.find(candidat.class, id);
	     
	    assertNull(deletedProduct);
		
		
	}

	@Test
	public void testUpdate() {
		System.out.println("Test de update() en cours...");
		session.beginTransaction();
	     
	    Integer id = 1;
	    candidat c1= new candidat("Albert", "test","test","test","test");
	     
	    session.beginTransaction();
	    session.update(c1);
	    session.getTransaction().commit();
	     
	    candidat updatedProduct = session.find(candidat.class, id);
	     
	    assertEquals("Albert", updatedProduct.getnom());
		
	}

	@Test
	public void testFindById() {
		
		System.out.println("Test de findbyId() en cours...");
		session.beginTransaction();
	     
	    Integer id = 1;
	     
	    candidat c1 = session.find(candidat.class, id);
	     
	    assertEquals("Albert", c1.getnom()); 
		
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
