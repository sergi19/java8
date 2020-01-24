package com.mitocode.java8mito.defaultmethod;

public interface PersonB {

	default public void talk() {
		System.out.println("I'm talking from PersonB!!!");
	}
	
}
