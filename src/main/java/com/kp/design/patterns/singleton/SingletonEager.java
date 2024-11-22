package com.kp.design.patterns.singleton;

public class SingletonEager {
	// not recommended since objects get created on initial class load itseld
	private static SingletonEager eager = new SingletonEager();

	private SingletonEager() {

	}

	public static SingletonEager getSingletonEager() {
		return eager;
	}
}
