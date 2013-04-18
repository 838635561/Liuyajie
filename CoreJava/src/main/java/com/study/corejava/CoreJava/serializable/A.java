package com.study.corejava.CoreJava.serializable;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream.GetField;
import java.io.ObjectOutputStream.PutField;
import java.io.Serializable;

/**
 * 序列化对象A
 * @author Liu
 *
 */
public class A implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String name ;
	private int age;
	private String address;
	
	public A (String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	private void writeObject(ObjectOutputStream out) {
		try {
			PutField putFields = out.putFields();
			putFields.put("name", name);
			putFields.put("age", age);
			putFields.put("address", address);
			out.writeFields();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private A readObject(ObjectInputStream in) throws ClassNotFoundException {
		A a = new A("",0,"");
		try {
			GetField getFields = in.readFields();
			System.out.println("名称：" + name);
			a.name = (String)getFields.get("name","");
			a.age = (Integer)getFields.get("age","");
			a.address = (String)getFields.get("address","");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return a;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
