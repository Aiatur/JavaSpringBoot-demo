package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component//that creates a spring beans
@Scope(value = "singleton")//Two Types of scope singleton and prototype
@Component("systemObject")//that creates a bean with name systemObject
public class SystemModel {
	
	public SystemModel() {
		super();
		System.out.println("SystemModel obj was created");
	}
	
	private int sId;
	private String sName;
	
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	
	public void operation() {
		System.out.println("SystemModel is in operation");
	}
	

}
