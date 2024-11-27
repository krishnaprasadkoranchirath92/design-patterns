package com.kp.design.patterns.adapter;

public class AdapterCharger implements AppleCharger {

	AndroidCharger ac;

	public AdapterCharger(AndroidCharger ac) {
		super();
		this.ac = ac;
	}

	public void charging() {
		System.out.println("Charging using Adapter!");
		ac.charging();
	}

}
