package com.study.corejava.CoreJava.object;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 雇员经理测试类
 * @author Liuyajie 2013-04-17 09:26
 * @version 1.0
 */
public class ManagerTest {
	private Employee m = new Manager("李四", "北京科技" , 4000); //实例经理雇员
	
	/**
	 * 测试经理名称
	 */
	@Test
	public void testManagerName() {
		System.out.println("Manager Name :" + m.getName());
		assertEquals("李四", m.getName());
	}
	
	/**
	 * 测试经理地址
	 */
	@Test
	public void testManagerAddress() {
		System.out.println("Manager Address:" + m.getAddress());
		assertEquals("北京科技", m.getAddress());
	}
	
	/**
	 * 测试经理工资
	 */
	@Test
	public void testManagerBouns() {
		System.out.println("Manager bouns :" + m.getBouns());
		assertEquals(4000.0, m.getBouns(),0);
	}
	
	/**
	 * 测试经理奖金
	 */
	@Test
	public void testManagerReward() {
		Manager manager = (Manager)m;
		System.err.println("Manager Reward :" + manager.getReward());
		
		assertEquals(m.getBouns()*1.1, manager.getReward(),0.1);
	}
}
