package com.i28minutes.oops.level2;

public abstract class AbstractRecipe {
	
	public void excute() {
		getReady();
		doTheDish();
		cleanup();
	}
	
	
	abstract void getReady();
	abstract void doTheDish();
	abstract void cleanup();
	//prepare
	//recipe
	//cleanup
	
}
