package com.kp.design.patterns.abstractFactory;

public class WaterAbsFactory extends ResourceAbsFactory {

	@Override
	Resource createResource() {
		return new Water();
	}


}
