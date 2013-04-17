package com.study.corejava.testSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.study.corejava.CoreJava.calendar.GregorianCalendarTest;
import com.study.corejava.CoreJava.date.DateUtilsTest;
import com.study.corejava.CoreJava.object.EmployeeTest;
import com.study.corejava.CoreJava.object.ManagerTest;

/**
 * ²âÊÔÌ×¼şÀà
 * @author Liuyajie 2013-04-17 09:19
 * @version 1.0
 *
 */
@RunWith(Suite.class)
@SuiteClasses({
	EmployeeTest.class,
	ManagerTest.class,
	DateUtilsTest.class,
	GregorianCalendarTest.class
	})
public class TestSuite {

}
