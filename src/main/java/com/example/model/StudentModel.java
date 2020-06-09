package com.example.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "singleton")
public class StudentModel {
	private int sid;
	private String name;
	private int cls;
	/**
	 * @return the sid
	 */
	public int getSid() {
		return sid;
	}
	/**
	 * @param sid the sid to set
	 */
	public void setSid(int sid) {
		this.sid = sid;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the cls
	 */
	public int getCls() {
		return cls;
	}
	/**
	 * @param cls the cls to set
	 */
	public void setCls(int cls) {
		this.cls = cls;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StudentModel [sid=");
		builder.append(sid);
		builder.append(", name=");
		builder.append(name);
		builder.append(", cls=");
		builder.append(cls);
		builder.append("]");
		return builder.toString();
	}
	
	public void show() {
		System.out.println("Hi It's StudentModel");
	}
	public StudentModel() {
		super();
		System.out.println("Student Model Obj Created");
	}
	

}
