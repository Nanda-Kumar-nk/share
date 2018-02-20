package com.telusko.hib.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="AlienTech_Info")
public class AlienTechEmbeddableModel {

	@GeneratedValue
	@Id
	private int aid;
	@Column(name="alien_name")
	private String aname;
	private TechModel tech;
	@Transient
	private int age;
	
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
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
	public TechModel getTech() {
		return tech;
	}
	public void setTech(TechModel tech) {
		this.tech = tech;
	}
	
	
	@Override
	public String toString() {
		return "AlienTechModel [aid=" + aid + ", aname=" + aname + ", tech=" + tech + "]";
	}
	
	
	
	
	
	
}
