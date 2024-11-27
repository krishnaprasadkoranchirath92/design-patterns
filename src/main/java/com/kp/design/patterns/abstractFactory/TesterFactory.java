package com.kp.design.patterns.abstractFactory;

public class TesterFactory extends EmployeeAbstractFactory {

	@Override
	protected Employee createEmployee() {
		return new Tester();
	}

}
