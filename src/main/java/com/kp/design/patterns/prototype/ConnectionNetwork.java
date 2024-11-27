package com.kp.design.patterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class ConnectionNetwork implements Cloneable {

	private String ip;
	private String importantData;
	private List<String> domains = new ArrayList<String>();

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getImportantData() {
		return importantData;
	}

	public void setImportantData(String importantData) {
		this.importantData = importantData;
	}

	public List<String> getDomains() {
		return domains;
	}

	public void setDomains(List<String> domains) {
		this.domains = domains;
	}

	public void loadImportantData() throws InterruptedException {
		Thread.sleep(1000);
		domains.add("www.d1.com");
		domains.add("www.d2.com");
		domains.add("www.d3.com");
		this.importantData = "Loaded important data";

	}

	@Override
	public String toString() {
		return "ConnectionNetwork [ip=" + ip + ", importantData=" + importantData + ", domains=" + domains + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
//		return super.clone();
		ConnectionNetwork cn = new ConnectionNetwork();
		cn.setIp(this.ip);
		cn.setImportantData(this.getImportantData());
//		cn.setDomains(this.getDomains());
		for (String d : this.getDomains()) {
			cn.getDomains().add(d);
		}
		return cn;
	}

}
