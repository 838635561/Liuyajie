package com.study.corejava.CoreJava.object;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * 雇员测试类
 * @author Liuyajie 2013-04-17 09:13
 * @version 1.0
 *
 */
public class EmployeeTest {
	private Employee e = new Employee("张三", "北京海淀", 3000); //默认实例化对象
	
	/**
	 * 测试雇员名称
	 */
	@Test
	public void testGetName() {
		System.out.println("Employee Name:" + e.getName());
		assertEquals("张三", e.getName());
	}
	
	/**
	 * 测试雇员地址
	 */
	@Test
	public void testGetAddress() {
		System.out.println("Employee Address:" + e.getAddress());
		assertEquals("北京海淀", e.getAddress());
	}
	
	/**
	 * 测试雇员工资
	 */
	@Test
	public void testGetBouns() {
		System.out.println("Employee bouns:" + e.getBouns());
		assertEquals(3000, e.getBouns(),0);
	}
}
