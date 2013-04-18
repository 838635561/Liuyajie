package com.study.corejava.CoreJava.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

/**
 * 测试序列化
 * @author Liuyajie 2013-04-18 13:17
 * @version 1.0
 *
 */
public class ATest {
	
	@Test
	public void testSerail() throws FileNotFoundException, IOException, ClassNotFoundException {
		A a = new A("张三",18,"北京海淀区") ;
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("aa.txt"));
		oos.writeObject(a);
		oos.flush();
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("aa.txt"));
		A b = (A)ois.readObject();
		ois.close();
		System.out.println(b.getAddress() + b.getName() + b.getAge());
	}
}
