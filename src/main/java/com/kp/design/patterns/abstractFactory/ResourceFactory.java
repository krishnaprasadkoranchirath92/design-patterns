package com.kp.design.patterns.abstractFactory;

public class ResourceFactory {

	static Resource createResource(ResourceAbsFactory rf) {
		return rf.createResource();
	}
}
