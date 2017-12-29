package org.com.client;

import java.lang.reflect.Method;

import org.com.infotech.annotation.MyAnnoatation2;
import org.com.infotech.annotation.MyAnnotation;

public class Test {
	@MyAnnotation(developerName = "John", expirydate = "10-10-2018")
	public void myMethod1() {
		System.out.println("myMethod1....");
	}

	@MyAnnotation(developerName = "Joya", expirydate = "10-10-2019")
	@MyAnnoatation2
	public void myMethod2() {
		System.out.println("myMethod2....");
	}

	public static void main(String args[]) throws NoSuchMethodException, SecurityException {
		System.out.println("Welcome to annoatation world!!!");
		
		Method method = new Test().getClass().getMethod("myMethod1");
		MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
		System.out.println(annotation.developerName()+"\t"+annotation.expirydate());
	}
}