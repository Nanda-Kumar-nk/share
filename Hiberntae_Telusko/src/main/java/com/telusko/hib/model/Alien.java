package com.telusko.hib.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author 310252554
 *
 */
@Entity
@Table(name="Alien_Info")
public class Alien {

	@Id
	private int aid;
	private String aname;
	@Column(name="atech")
	private String tech;
	
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	
	@Override
	public String toString() {
		return "Alien [id=" + aid + ", aname=" + aname + ", tech=" + tech + "]";
	}
	
	
	
	
	
	
}
