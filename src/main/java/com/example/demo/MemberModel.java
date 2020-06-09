package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component//that creates a spring beans
@Scope(value = "singleton")//Two Types of scope singleton and prototype
public class MemberModel {
	
	public MemberModel() {
		super();
		System.out.println("MemberModel Obj Created");
	}
	
	private int memId;
	private String memName;
	@Autowired//that systemObj is dependent upon the MemberModel object
	@Qualifier("systemObject")
	private SystemModel systemObj;
	
	public int getMemId() {
		return memId;
	}
	public void setMemId(int memId) {
		this.memId = memId;
	}
	public String getMemName() {
		return memName;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}
	public SystemModel getSystemObj() {
		return systemObj;
	}
	public void setSystemObj(SystemModel systemObj) {
		this.systemObj = systemObj;
	}
	
	public void show() {
		System.out.println("Hi I'm in MemberModel");
		systemObj.operation();
	}
	
	

}
