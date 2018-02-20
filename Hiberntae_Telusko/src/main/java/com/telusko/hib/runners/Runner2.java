package com.telusko.hib.runners;

import javax.persistence.Embeddable;

import com.telusko.hib.dao.AlienDao;
import com.telusko.hib.model.AlienTechEmbeddableModel;
import com.telusko.hib.model.TechModel;

public class Runner2 {
	
	// this runner will have two classes alien and tech in the call in @Embeddable mode
	
	
	public static void main(String[] args) {
		
		
		AlienDao dao=new AlienDao();
		AlienTechEmbeddableModel alientech=new AlienTechEmbeddableModel(); 
		
	    TechModel tech=new TechModel();
	    tech.setTopic("php");
	    tech.setLevel(8);
	    tech.setExp(3);
		
	//	alientech.setAid(1);
		alientech.setAname("sreeraj");
		alientech.setTech(tech);
		alientech.setAge(20);
		
		dao.saveAlienwithTech(alientech);
		
	}
	
	

}
