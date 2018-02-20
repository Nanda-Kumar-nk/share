package com.telsko.hib.runners;

import java.util.Arrays;
import java.util.List;

import com.telusko.hib.dao.AlienDao;
import com.telusko.hib.model.AlienSharedDesktopModel;
import com.telusko.hib.model.SharedDesktops;

public class Runner5 {


	public static void main(String[] args) {

		AlienDao dao=new AlienDao();

		SharedDesktops desktop1=new SharedDesktops();
		SharedDesktops desktop2=new SharedDesktops();
		SharedDesktops desktop3=new SharedDesktops();

		desktop1.setDesktopid(1);
		desktop1.setDesktopname("desktop1");
		desktop2.setDesktopid(2);
		desktop2.setDesktopname("desktop2");
		desktop3.setDesktopid(3);
		desktop3.setDesktopname("desktop3");

		AlienSharedDesktopModel alien1=new AlienSharedDesktopModel();
		AlienSharedDesktopModel alien2=new AlienSharedDesktopModel();
		AlienSharedDesktopModel alien3=new AlienSharedDesktopModel();

		alien1.setAid(1);
		alien1.setName("alien1");
		alien2.setAid(2);
		alien2.setName("alien2");
		alien3.setAid(3);
		alien3.setName("alien3");



		List<SharedDesktops> desktops1=Arrays.asList(desktop1,desktop2);
		List<AlienSharedDesktopModel> aliens1=Arrays.asList(alien1,alien2);

		List<SharedDesktops> desktops2=Arrays.asList(desktop2,desktop3);
		List<AlienSharedDesktopModel> aliens2=Arrays.asList(alien2,alien3);

		List<SharedDesktops> desktops3=Arrays.asList(desktop3,desktop2);
		List<AlienSharedDesktopModel> aliens3=Arrays.asList(alien3,alien2);


		desktop1.setAliens(aliens1);
		desktop2.setAliens(aliens2);
		desktop3.setAliens(aliens3);

		alien1.setDesktops(desktops1);
		alien2.setDesktops(desktops2);
		alien3.setDesktops(desktops3);

	
	dao.saveALienSharedDesktops(alien1);
	
	
	
	
	
	
	/*dao.saveALienSharedDesktops(alien2);
	dao.saveALienSharedDesktops(alien3);
	*/
	
	
	}

}
