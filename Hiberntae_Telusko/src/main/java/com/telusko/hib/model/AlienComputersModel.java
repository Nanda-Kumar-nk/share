package com.telusko.hib.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="AlienComputer_Info")
public class AlienComputersModel {
	
	@GeneratedValue
	@Id
	private int aid;
	private String aname;
	private String tech;
	
	/*
	 This is to make the AlienComputersModel understand that the mapping is done 
	 by the Computer table i.e computer will contain a column named as alien_aid
	 which will provide the mapping between the both tables.
	 alien is the field name specified in the computer table
	
	*/ 
	@OneToMany(mappedBy="alien")
	private List<Computer> computer;
	
	
	
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
	public List<Computer> getComputer() {
		return computer;
	}
	public void setComputer(List<Computer> computer) {
		this.computer = computer;
	}
	
	
	
	
	

}
