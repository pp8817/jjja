package com.i28minutes.oops.concurrency;

public class Counter {
	int i=0;
	
	synchronized public void increment() {
		i++;
		//get i
		//increment
		//set i
	}
	
	public int getI() {
		return i;
	}
	
}
