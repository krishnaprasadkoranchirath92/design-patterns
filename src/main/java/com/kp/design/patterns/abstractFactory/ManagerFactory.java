package com.kp.design.patterns.abstractFactory;

public class ManagerFactory extends EmployeeAbstractFactory {

	@Override
	protected Employee createEmployee() {
		return new Manager();
	}

}
