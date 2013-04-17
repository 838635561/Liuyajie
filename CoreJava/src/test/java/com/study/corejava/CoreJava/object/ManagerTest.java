package com.study.corejava.CoreJava.object;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * ��Ա���������
 * @author Liuyajie 2013-04-17 09:26
 * @version 1.0
 */
public class ManagerTest {
	private Employee m = new Manager("����", "�����Ƽ�" , 4000); //ʵ�������Ա
	
	/**
	 * ���Ծ�������
	 */
	@Test
	public void testManagerName() {
		System.out.println("Manager Name :" + m.getName());
		assertEquals("����", m.getName());
	}
	
	/**
	 * ���Ծ����ַ
	 */
	@Test
	public void testManagerAddress() {
		System.out.println("Manager Address:" + m.getAddress());
		assertEquals("�����Ƽ�", m.getAddress());
	}
	
	/**
	 * ���Ծ�����
	 */
	@Test
	public void testManagerBouns() {
		System.out.println("Manager bouns :" + m.getBouns());
		assertEquals(4000.0, m.getBouns(),0);
	}
	
	/**
	 * ���Ծ�����
	 */
	@Test
	public void testManagerReward() {
		Manager manager = (Manager)m;
		System.err.println("Manager Reward :" + manager.getReward());
		
		assertEquals(m.getBouns()*1.1, manager.getReward(),0.1);
	}
}
