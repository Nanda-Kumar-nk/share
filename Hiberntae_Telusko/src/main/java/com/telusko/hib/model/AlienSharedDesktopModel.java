package com.telusko.hib.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Alien_SharedDesktop")
public class AlienSharedDesktopModel {

	@Id
	private int aid;
	private String name;
	private String tech;
	@ManyToMany(mappedBy="aliens")
	private List<SharedDesktops> desktops;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public List<SharedDesktops> getDesktops() {
		return desktops;
	}
	public void setDesktops(List<SharedDesktops> desktops) {
		this.desktops = desktops;
	}
	
	
	
	
	
}
