package com.kp.design.patterns.observer;

public interface Subject {

	void subscribe(Observer ob);

	void unSubscribe(Observer ob);

	void notifyChanges(String title);
}
