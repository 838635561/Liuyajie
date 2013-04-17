package com.study.corejava.CoreJava.date;

import org.junit.Test;

/**
 * DateUtils工具类测试类
 * @author Liuyajie 2013-04-17 11:45
 * @version 1.0
 *
 */
public class DateUtilsTest {
	private DateUtils du = new DateUtils();
	
	/**
	 * 测试new Date方法
	 */
	@Test
	public void testNewDate() {
		System.out.println("New Date:" + du.newDate());
	}
	
	/**
	 * 测试Date toString方法
	 */
	@Test
	public void testDateToString() {
		System.out.println("Date toString:" + du.dateToString());
	}
	
}
