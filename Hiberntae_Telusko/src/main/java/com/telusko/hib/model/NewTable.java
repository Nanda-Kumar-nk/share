package com.telusko.hib.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class NewTable {
	
	@Id
	private int id;
	private String descr;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesc() {
		return descr;
	}
	public void setDesc(String desc) {
		this.descr = desc;
	}
	
	
	
	

}
