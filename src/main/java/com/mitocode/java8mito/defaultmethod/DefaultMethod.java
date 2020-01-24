package com.mitocode.java8mito.defaultmethod;

public class DefaultMethod implements PersonA, PersonB {

	@Override
	public void walk() {
		System.err.println("I'm walking!!!");
	}
	
	@Override
	public void talk() {
		//PersonA.super.talk();
		System.out.println("Anything!!!");
	}
	
	/*@Override
	public void talk() {
		PersonB.super.talk();
	}*/

	public static void main(String[] args) {
		DefaultMethod app = new DefaultMethod();
		app.talk();
	}

}
