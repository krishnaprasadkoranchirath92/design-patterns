package com.kp.design.patterns.abstractFactory;

public class SweeperAbstractFactory extends WorkerAbstractFactory {

	Worker createWorker() {
		return new Sweeper();
	}

}
