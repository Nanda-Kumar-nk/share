package com.telusko.hib.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.transform.Transformers;

import com.telusko.hib.model.Alien;
import com.telusko.hib.model.AlienComputersModel;
import com.telusko.hib.model.AlienLaptopModel;
import com.telusko.hib.model.AlienSharedDesktopModel;
import com.telusko.hib.model.AlienTechEmbeddableModel;
import com.telusko.hib.model.Computer;
import com.telusko.hib.model.Laptop;
import com.telusko.hib.model.NewTable;
import com.telusko.hib.model.SharedDesktops;

public class AlienDao {

	Configuration config;
	SessionFactory sf;
	Session session;
	Transaction trans;

	public AlienDao() {
		config=new Configuration();
		sf=config.configure().addAnnotatedClass(Alien.class).addAnnotatedClass(NewTable.class).buildSessionFactory();
	}

	public Alien getAlien(int i) {

		Alien a =new Alien();	
		session=sf.openSession();

		a=session.get(Alien.class,i);

		session.clear();
		session.close();
		return a;
	}



	public void addAlien(Alien a) {

		session=sf.openSession();
		trans=session.getTransaction();

		trans.begin();
		session.save(a);
		trans.commit();



	}

	public void deleteAlien(int i) {

	}

	public void updateAlien(Alien a) {

	}

	public List<Alien> getAliensusingNativeQuery01(){

		List<Alien> alienlist=new ArrayList<Alien>();
		session=sf.openSession();

		Query query = session.createNativeQuery("SELECT * FROM Alien;");
		query.setResultTransformer(Transformers.aliasToBean(Alien.class));
		alienlist = (ArrayList<Alien>) query.getResultList();

		session.close();
		return alienlist;
	}

	public List<Alien> getAliensusingNativeQuery02(){

		List<Alien> alienlist=new ArrayList<Alien>();
		session=sf.openSession();

		// NOT DEPRECIATED USE OF NATIVE QUERY

		session.close();
		return alienlist;
	}





	public List<Alien> getAliensusingcreateQuery01(){

		List<Alien> alienlist=new ArrayList<Alien>();
		session=sf.openSession();


		TypedQuery<Alien> query = session.createQuery("from Alien where aname='nandu'");
		alienlist= (ArrayList<Alien>)query.getResultList();
		session.close();



		return alienlist;
	}

	public void createTable(NewTable newtable) {

		Configuration config=new Configuration();
		SessionFactory sf=config.configure().addAnnotatedClass(NewTable.class).buildSessionFactory();
		session=sf.openSession();
		trans=session.getTransaction();
		trans.begin();
		session.save(newtable);
		trans.commit();
		session.close();
	}

	public void saveAlienwithTech(AlienTechEmbeddableModel alientech) {

		// No Seperate table in database
		Configuration config=new Configuration();
		SessionFactory sf=config.configure().addAnnotatedClass(AlienTechEmbeddableModel.class).buildSessionFactory();
		session=sf.openSession();
		trans=session.getTransaction();
		trans.begin();
		session.save(alientech);
		trans.commit();
		session.close();



	}

	public void saveAlienLaptop(AlienLaptopModel alienlaptop) {

		Configuration config=new Configuration();
		SessionFactory sf=config.configure().addAnnotatedClass(AlienLaptopModel.class).addAnnotatedClass(Laptop.class).buildSessionFactory();
		session=sf.openSession();
		trans=session.getTransaction();
		trans.begin();
		session.save(alienlaptop.getLaptop());
		session.save(alienlaptop);
		trans.commit();
		session.close();


	}

	public void saveAlienComputers(AlienComputersModel alien) {

		Configuration config=new Configuration();
		SessionFactory sf=config.configure().addAnnotatedClass(AlienComputersModel.class).addAnnotatedClass(Computer.class).buildSessionFactory();
		session=sf.openSession();
		trans=session.getTransaction();
		trans.begin();
		for(Computer comp:alien.getComputer()) {
			session.save(comp);
		}
		session.save(alien);
		trans.commit();
		session.close();



	}

	public void saveALienSharedDesktops(AlienSharedDesktopModel alien) {

		Configuration config=new Configuration();
		SessionFactory sf=config.configure().addAnnotatedClass(AlienSharedDesktopModel.class).addAnnotatedClass(SharedDesktops.class).buildSessionFactory();
		session=sf.openSession();
		
		trans=session.getTransaction();
		trans.begin();

		for(SharedDesktops s:alien.getDesktops()) {
			session.saveOrUpdate(s);
			
		}
		session.save(alien);
			



		trans.commit();
		session.close();







	}



}
