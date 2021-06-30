package com.ProjetAnnuel;

import org.hibernate.Session;

import com.Model.candidat;
import com.ProjetAnnuel.HibernateUtil;
import com.Service.candidatService;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		
        System.out.println( "Hello World! Test" );
        candidatService cs =new candidatService();
        candidat c1 = new candidat("Bench","Mark","test@test.com",0667);
        cs.create(c1, session);
        
        session.getTransaction().commit();
		HibernateUtil.shutdown();
    }
}
