package com.telusko.hib.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="shareddesktops")
public class SharedDesktops {


	@Id
	private int desktopid;
	private String desktopname;
	@ManyToMany
	private List<AlienSharedDesktopModel> aliens;





	public int getDesktopid() {
		return desktopid;
	}
	public void setDesktopid(int desktopid) {
		this.desktopid = desktopid;
	}
	public String getDesktopname() {
		return desktopname;
	}
	public void setDesktopname(String desktopname) {
		this.desktopname = desktopname;
	}
	public List<AlienSharedDesktopModel> getAliens() {
		return aliens;
	}
	public void setAliens(List<AlienSharedDesktopModel> aliens) {
		this.aliens = aliens;
	}






}
