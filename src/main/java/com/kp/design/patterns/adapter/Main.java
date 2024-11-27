package com.kp.design.patterns.adapter;

public class Main {

	public static void main(String[] args) {
		AppleCharger ac = new IphoneCharger();
		Iphone ip = new Iphone(ac);
		ip.charger.charging();
		AndroidCharger ach = new SamsungCharger();
		AppleCharger ch = new AdapterCharger(ach);
		new Iphone(ch).charger.charging();
	}

}
