package com.kp.design.patterns.singleton;

public class DriverClass {

	public static void main(String[] args) {
		SingletonClass s1 = SingletonClass.getSingletonObject();
		SingletonClass s2 = SingletonClass.getSingletonObject();
		System.out.println("s1 ="+s1.hashCode());
		System.out.println("s2 ="+s2.hashCode());
		
	}
}
