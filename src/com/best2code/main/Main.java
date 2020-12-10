package com.best2code.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.best2code.entity.Produit;

public class Main {

	public static void main(String[] args) {
		
		SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Produit.class).buildSessionFactory();
		
		Session session= factory.getCurrentSession();
		
		try {
			Produit p= new Produit("test");
			
			session.beginTransaction();
			session.save(p);
			session.getTransaction().commit();
			
		} finally {
			factory.close();
		}
	}

}
