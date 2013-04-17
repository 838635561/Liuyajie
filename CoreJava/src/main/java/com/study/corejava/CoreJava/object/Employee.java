package com.study.corejava.CoreJava.object;


/**
 * ¹ÍÔ±¶ÔÏó
 * @author Liuyajie 2013-04-17 09:07
 * @version 1.0
 *
 */
public class Employee {
	private String name;
	private String address;
	private double bouns;
	
	public Employee(String name, String address, double bouns) {
		this.name = name;
		this.address = address;
		this.bouns = bouns;
	}
	
	public double getBouns() {
		return bouns;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
