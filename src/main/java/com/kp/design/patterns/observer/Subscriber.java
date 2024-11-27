package com.kp.design.patterns.observer;

public class Subscriber implements Observer {
	String subName;

	public Subscriber(String subName) {
		super();
		this.subName = subName;
	}

	public void notified(String title) {
		System.out.println("New video uploaded! " + subName + " - notified" + " -- " + " Video title: " + title);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((subName == null) ? 0 : subName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Subscriber other = (Subscriber) obj;
		if (subName == null) {
			if (other.subName != null)
				return false;
		} else if (!subName.equals(other.subName))
			return false;
		return true;
	}

	
}
