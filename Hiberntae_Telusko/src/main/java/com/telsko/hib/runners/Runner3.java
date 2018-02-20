package com.telsko.hib.runners;

import com.telusko.hib.dao.AlienDao;
import com.telusko.hib.model.AlienLaptopModel;
import com.telusko.hib.model.Laptop;

public class Runner3 {
	
	// This Runner deals with the two entity aliens and laptop. Here both the entities are different tables
	
	public static void main(String[] args) {
		
		AlienDao dao=new AlienDao();
		
		AlienLaptopModel alienlaptop=new AlienLaptopModel();
		Laptop laptop=new Laptop();
		
		laptop.setLapid(1);
		laptop.setBrand("Apple");
		laptop.setPrice(1000);
		laptop.setRam(7);
		
		alienlaptop.setAid(1);
		alienlaptop.setAname("midhun");
		alienlaptop.setTech("hadoop");
		alienlaptop.setLaptop(laptop);
		
		
		dao.saveAlienLaptop(alienlaptop);
		
		
		
	}
	
	

}
