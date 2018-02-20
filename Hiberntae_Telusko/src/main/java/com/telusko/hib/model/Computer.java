package com.telusko.hib.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Computer {
	
	@Id
	private int cid;
	private String cbrand;
	@ManyToOne
	private AlienComputersModel alien;
	
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCbrand() {
		return cbrand;
	}
	public void setCbrand(String cbrand) {
		this.cbrand = cbrand;
	}
	public AlienComputersModel getAlien() {
		return alien;
	}
	public void setAlien(AlienComputersModel alien) {
		this.alien = alien;
	}
	
	
	
	

}
