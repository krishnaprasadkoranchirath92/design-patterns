package com.kp.design.patterns.factory;

public class DevClient {

	public static void main(String[] args) {
		Employee e = EmployeeFacory.getEmployee("web");
		System.out.println("Web dev salary = "+e.getSalary());
		Employee e2 = EmployeeFacory.getEmployee("android");
		System.out.println("android dev salary = "+e2.getSalary());
	}
}
