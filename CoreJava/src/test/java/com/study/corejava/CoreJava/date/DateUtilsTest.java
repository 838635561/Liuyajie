package com.study.corejava.CoreJava.date;

import org.junit.Test;

/**
 * DateUtils�����������
 * @author Liuyajie 2013-04-17 11:45
 * @version 1.0
 *
 */
public class DateUtilsTest {
	private DateUtils du = new DateUtils();
	
	/**
	 * ����new Date����
	 */
	@Test
	public void testNewDate() {
		System.out.println("New Date:" + du.newDate());
	}
	
	/**
	 * ����Date toString����
	 */
	@Test
	public void testDateToString() {
		System.out.println("Date toString:" + du.dateToString());
	}
	
}
