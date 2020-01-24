package com.mitocode.java8mito.defaultmethod;

public interface PersonA {

	public void walk();
	
	default public void talk() {
		System.out.println("I'm talking from PersonA!!!");
	}
	
}
