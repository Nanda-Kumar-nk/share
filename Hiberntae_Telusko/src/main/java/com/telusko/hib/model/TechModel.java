package com.telusko.hib.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Embeddable
public class TechModel {
	
	
	private String topic;
	private int level;
	private int exp;
	
	
	
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	
	
	
	

}
