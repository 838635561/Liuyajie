package com.study.corejava.CoreJava.calendar;

import java.util.GregorianCalendar;
import org.junit.Test;

/**
 * ũ������������
 * @author Liuyajie 2013-04-17 12:19
 * @version 1.0
 *
 */
public class GregorianCalendarTest {
	private GregorianCalendarUtils gc = new GregorianCalendarUtils();
	
	/**
	 * ���Դ�ӡ��ǰũ������
	 */
	@Test
	public void testGetGergorianCalendar() {
		System.err.println("----------------GergorianCalendarTest------------");
		GregorianCalendar c = gc.newGregorianCalendar();
		System.out.println("Year:"+c.get(GregorianCalendar.YEAR) + " Month:" + c.get(GregorianCalendar.MONTH) + " Day:" + c.get(GregorianCalendar.DATE));
	}
	
	/**
	 * �й�����
	 */
	@Test
	public void testChineseCalendar() {
	}
}
