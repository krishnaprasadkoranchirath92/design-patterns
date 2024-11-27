package com.kp.design.patterns.iterator;

import java.util.List;

public class MyIteratorImpl implements MyIterator {

	private List<User> list;
	private int length;
	private int position = 0;

	public MyIteratorImpl(List<User> list) {
		super();
		this.list = list;
		this.length = list.size();
	}

	public boolean hasNext() {
		if (position >= length) {
			return false;
		}
		return true;
	}

	public Object next() {
		User user = list.get(position);
		position++;
		return user;
	}

}
