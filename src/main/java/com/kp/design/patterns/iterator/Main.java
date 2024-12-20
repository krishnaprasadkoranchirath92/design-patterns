package com.kp.design.patterns.iterator;

public class Main {

	public static void main(String[] args) {
		UserManagement um = new UserManagement();
		um.addUser(new User("usr1", "un1"));
		um.addUser(new User("usr2", "un2"));
		MyIterator iterator = um.getIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}
}
