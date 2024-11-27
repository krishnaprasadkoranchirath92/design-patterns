package com.kp.design.patterns.abstractFactory;

public class WorkersFactory {

	public static Worker getWorker(WorkerAbstractFactory wf) {
		return wf.createWorker();
	}
}
