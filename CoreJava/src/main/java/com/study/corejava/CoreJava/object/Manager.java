package com.study.corejava.CoreJava.object;

/**
 * �����Ա
 * @author Liuyajie 2013-04-17 09:12
 * @version 1.0
 *
 */
public class Manager extends Employee {
	/**
	 * Ĭ�Ϲ�����
	 * @param name ��Ա����
	 * @param address ��Ա��ַ
	 * @param bouns ��Ա����
	 */
	public Manager(String name, String address, double bouns) {
		super(name, address, bouns);
	}

	private double reward;
	
	public double getReward() {
		return this.getBouns() * 1.1;
	}
}
