package com.study.corejava.CoreJava.object;

/**
 * 经理雇员
 * @author Liuyajie 2013-04-17 09:12
 * @version 1.0
 *
 */
public class Manager extends Employee {
	/**
	 * 默认构造器
	 * @param name 雇员名字
	 * @param address 雇员地址
	 * @param bouns 雇员工资
	 */
	public Manager(String name, String address, double bouns) {
		super(name, address, bouns);
	}

	private double reward;
	
	public double getReward() {
		return this.getBouns() * 1.1;
	}
}
