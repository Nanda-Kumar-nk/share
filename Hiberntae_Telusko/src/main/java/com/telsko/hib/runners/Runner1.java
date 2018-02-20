package com.telsko.hib.runners;

import java.util.List;

import com.telusko.hib.dao.AlienDao;
import com.telusko.hib.dao.AlienDaoJDBC;
import com.telusko.hib.model.Alien;
import com.telusko.hib.model.NewTable;

public class Runner1 {
	
	
	
    public static void main(String[] args) {
		
    	AlienDao dao=new AlienDao();
    	
/*    	

 //                                  CREATE A NEW TABLE
    	NewTable newtable=new NewTable();
    	newtable.setId(1);
    	newtable.setDesc("test table row 2");
    	dao.createTable(newtable);
 */   	

/*    	 	
    	
//                                    GET AN ALIEN
 
    	Alien a=dao.getAlien(1);
    	System.out.println(a.toString());

*/	
    	
/*	
//                                     ADD AN ALIEN
 
    	Alien a_new =new Alien();
    	a_new.setAid(1);
    	a_new.setAname("nandu");
    	a_new.setTech("architect");
    	dao.addAlien(a_new);
*/
    	
    	
    	
/*  
 //                                  USING NATIVE QUERY DEPRECIATED	
    	List<Alien> aliens=dao.getAliensusingNativeQuery01();
    	System.out.println(aliens);
    	
*/
    	
    	
    	
    	
/*  
    	 //                                  USING CREATE QUERY -- NOT DEPRECIATED 	
    	    	List<Alien> aliens=dao.getAliensusingcreateQuery01();
    	    	System.out.println(aliens);
    	    	
*/
    	
    	
    	/*  
    	 //                                  USING NATIVE QUERY NOT DEPRECIATED	
    	    	List<Alien> aliens=dao.getAliensusingNativeQuery02();
    	    	System.out.println(aliens);
    	    	
    	*/
    	
	}
	
	

}
