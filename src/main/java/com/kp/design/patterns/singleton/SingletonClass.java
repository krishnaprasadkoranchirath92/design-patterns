package com.kp.design.patterns.singleton;

import java.io.Serializable;

public class SingletonClass implements Serializable, Cloneable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static SingletonClass singletonClass;

	private SingletonClass() {
//		if (singletonClass != null) {
//			throw new RuntimeException("You are trying to break singleton pattern");
//		}
	}

	public static SingletonClass getSingletonObject() {
		if (singletonClass == null) {
			synchronized (SingletonClass.class) {
				if (singletonClass == null) {
					singletonClass = new SingletonClass();
				}
			}
		}
		return singletonClass;
	}
	
	public Object readResolve() {
		return singletonClass;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return singletonClass;
	}

}
