package com.kp.design.patterns.adapter;

public class SamsungCharger implements AndroidCharger {

	public void charging() {
		System.out.println("Charging using samsung charger!");
	}

}
