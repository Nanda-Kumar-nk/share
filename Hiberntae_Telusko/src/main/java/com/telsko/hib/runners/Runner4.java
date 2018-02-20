package com.telsko.hib.runners;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.telusko.hib.dao.AlienDao;
import com.telusko.hib.model.AlienComputersModel;
import com.telusko.hib.model.Computer;

public class Runner4 {
	
	// Two Entities are involved in a OneToMany Relation
	
	
	public static void main(String[] args) {
		
		AlienDao dao=new AlienDao();
		AlienComputersModel alien=new AlienComputersModel();
		List<Computer> computerlist=new ArrayList<Computer>();
		Computer comp1=new Computer();
		Computer comp2=new Computer();
		Computer comp3=new Computer();
		
		
		comp1.setCid(1);
		comp1.setCbrand("Apple");
		comp2.setCid(2);
		comp2.setCbrand("HP");
		comp3.setCid(3);
		comp3.setCbrand("Azus");
		comp1.setAlien(alien);
		comp2.setAlien(alien);
		comp3.setAlien(alien);
		computerlist=new ArrayList<>(Arrays.asList(comp1,comp2,comp3));
		
		
		alien.setAid(1);
		alien.setAname("anoop singh");
		alien.setTech("artist");
		alien.setComputer(computerlist);
		
		dao.saveAlienComputers(alien);
		
		
		
	}
	

}
