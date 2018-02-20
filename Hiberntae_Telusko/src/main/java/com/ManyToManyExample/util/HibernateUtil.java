package com.ManyToManyExample.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ManyToManyExample.main.Course;
import com.ManyToManyExample.main.Student;
import com.telusko.hib.model.Alien;
import com.telusko.hib.model.NewTable;


public class HibernateUtil {
	private static final SessionFactory sessionFactory;
	static {
		try {
			Configuration config=new Configuration();
		
			sessionFactory=config.configure().addAnnotatedClass(Student.class).addAnnotatedClass(Course.class).buildSessionFactory();
			
			
		
		
		
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}