package com.study.corejava.CoreJava.calendar;

import java.util.GregorianCalendar;

/**
 * ũ������
 * @author Liuyajie 2013-04-17 12:18
 * @version 1.0
 *
 */
public class GregorianCalendarUtils {
	
	/**
	 * ������ũ������
	 * @return
	 */
	public GregorianCalendar newGregorianCalendar() {
		return new GregorianCalendar();
	}
	/**
	 * ��ӡ����ũ����Ϣ
	 */
	public String getGergorianCalendar() {
		GregorianCalendar gc = new GregorianCalendar();
		return gc.toString();
	}
}
