package com.kp.design.patterns.factory;

public class EmployeeFacory {

	public static Employee getEmployee(String emp) {
		if("web".equals(emp)) {
			return new WebDeveloper();
		} else if("android".equals(emp)) {
			return new AndroidDeveloper();
		} else {
			return null;
		}
	}
}
