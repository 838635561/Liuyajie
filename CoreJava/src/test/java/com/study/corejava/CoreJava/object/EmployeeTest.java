package com.study.corejava.CoreJava.object;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * ��Ա������
 * @author Liuyajie 2013-04-17 09:13
 * @version 1.0
 *
 */
public class EmployeeTest {
	private Employee e = new Employee("����", "��������", 3000); //Ĭ��ʵ��������
	
	/**
	 * ���Թ�Ա����
	 */
	@Test
	public void testGetName() {
		System.out.println("Employee Name:" + e.getName());
		assertEquals("����", e.getName());
	}
	
	/**
	 * ���Թ�Ա��ַ
	 */
	@Test
	public void testGetAddress() {
		System.out.println("Employee Address:" + e.getAddress());
		assertEquals("��������", e.getAddress());
	}
	
	/**
	 * ���Թ�Ա����
	 */
	@Test
	public void testGetBouns() {
		System.out.println("Employee bouns:" + e.getBouns());
		assertEquals(3000, e.getBouns(),0);
	}
}
