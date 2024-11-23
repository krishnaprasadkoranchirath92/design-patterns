package com.kp.design.patterns.builder;

public class Driver {

	public static void main(String[] args) {
		User usr1 = new User.UserBuilder().setUserId("un123").setUserName("unm123").setEmailId("email123").build();
		System.out.println(usr1);
		User usr2 = User.UserBuilder.builder().setEmailId("em8").build();
		System.out.println(usr2);
	}
}
