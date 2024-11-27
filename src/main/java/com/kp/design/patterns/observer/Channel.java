package com.kp.design.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {

	List<Observer> subscribers = new ArrayList<Observer>();

	public void subscribe(Observer ob) {
		subscribers.add(ob);

	}

	public void unSubscribe(Observer ob) {
		subscribers.remove(ob);

	}

	public void notifyChanges(String title) {
		for (Observer ob : subscribers) {
			ob.notified(title);
		}

	}

}
