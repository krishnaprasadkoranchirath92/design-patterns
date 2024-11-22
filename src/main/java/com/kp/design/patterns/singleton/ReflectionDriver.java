package com.kp.design.patterns.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionDriver {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		SingletonClass s1 = SingletonClass.getSingletonObject();
		Constructor<SingletonClass> constructor = SingletonClass.class.getDeclaredConstructor();
		constructor.setAccessible(true);
//		SingletonClass s2 = constructor.newInstance();
		System.out.println("s1 = "+s1.hashCode());
//		System.out.println("s2 = "+s2.hashCode());
		SingletonEnumClass en = SingletonEnumClass.INST;
		Constructor<SingletonEnumClass> enConst = SingletonEnumClass.class.getDeclaredConstructor();
		enConst.setAccessible(true);
		SingletonEnumClass en2 = enConst.newInstance();
	}
}
