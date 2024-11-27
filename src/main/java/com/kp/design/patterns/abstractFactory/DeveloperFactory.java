package com.kp.design.patterns.abstractFactory;

public class DeveloperFactory extends EmployeeAbstractFactory {

	@Override
	protected Employee createEmployee() {
		return new Developer();
	}

}
