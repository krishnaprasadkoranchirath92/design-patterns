package com.kp.design.patterns.prototype;

public class MainClass {

	public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
		ConnectionNetwork connectionNetwork = new ConnectionNetwork();
		connectionNetwork.setIp("192.28.77.4");
		connectionNetwork.setImportantData("imp data");
		connectionNetwork.loadImportantData();
		System.out.println(connectionNetwork);
		Object cl = connectionNetwork.clone();
		Object c2 = connectionNetwork.clone();
		connectionNetwork.getDomains().remove(0);
		System.out.println(cl);
		System.out.println(c2);
		System.out.println(connectionNetwork);
	}
}
