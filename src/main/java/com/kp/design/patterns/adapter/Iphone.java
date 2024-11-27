package com.kp.design.patterns.adapter;

public class Iphone {
	AppleCharger charger = new IphoneCharger();

	public Iphone(AppleCharger charger) {
		super();
		this.charger = charger;
	}
	

}
