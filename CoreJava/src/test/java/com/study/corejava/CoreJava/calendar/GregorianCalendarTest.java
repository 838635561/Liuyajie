package com.study.corejava.CoreJava.calendar;

import java.util.GregorianCalendar;
import org.junit.Test;

/**
 * 农历日历测试类
 * @author Liuyajie 2013-04-17 12:19
 * @version 1.0
 *
 */
public class GregorianCalendarTest {
	private GregorianCalendarUtils gc = new GregorianCalendarUtils();
	
	/**
	 * 测试打印当前农历日期
	 */
	@Test
	public void testGetGergorianCalendar() {
		System.err.println("----------------GergorianCalendarTest------------");
		GregorianCalendar c = gc.newGregorianCalendar();
		System.out.println("Year:"+c.get(GregorianCalendar.YEAR) + " Month:" + c.get(GregorianCalendar.MONTH) + " Day:" + c.get(GregorianCalendar.DATE));
	}
	
	/**
	 * 中国日历
	 */
	@Test
	public void testChineseCalendar() {
	}
}
