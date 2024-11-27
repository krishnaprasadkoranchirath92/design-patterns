package com.kp.design.patterns.abstractFactory                                                                                                                                   ;

public class Driver {

	public static void main(String[] args) {
		Employee e1 = EmployeeFactory.getEmployee(new DeveloperFactory());
		System.out.println(e1.getName());
		Employee e2 = EmployeeFactory.getEmployee(new TesterFactory());
		System.out.println(e2.getName());
		Employee e3 = EmployeeFactory.getEmployee(new ManagerFactory());
		System.out.println(e3.getName());
		Worker w = WorkersFactory.getWorker(new SweeperAbstractFactory());
		System.out.println(w.getName());
		Resource r = ResourceFactory.createResource(new WaterAbsFactory());
		System.out.println(r.getName());
	}
}
