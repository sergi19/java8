package com.mitocode.java8mito.functionalinterface;

import com.mitocode.java8mito.lambda.Operation;

public class FuncInterfApp {
	
	public double operate(double x, double y) {
		Operation op = (n1, n2) -> n1 + n2;
		return op.calculateAVG(x, y);
	}
	
	public static void main(String[] args) {
		FuncInterfApp app = new FuncInterfApp();
		double resp = app.operate(2, 3);
		System.out.println(resp);
	}

}
