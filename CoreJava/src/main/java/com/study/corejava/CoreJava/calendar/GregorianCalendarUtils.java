package com.study.corejava.CoreJava.calendar;

import java.util.GregorianCalendar;

/**
 * 农历日期
 * @author Liuyajie 2013-04-17 12:18
 * @version 1.0
 *
 */
public class GregorianCalendarUtils {
	
	/**
	 * 事例化农历日期
	 * @return
	 */
	public GregorianCalendar newGregorianCalendar() {
		return new GregorianCalendar();
	}
	/**
	 * 打印当期农历信息
	 */
	public String getGergorianCalendar() {
		GregorianCalendar gc = new GregorianCalendar();
		return gc.toString();
	}
}
