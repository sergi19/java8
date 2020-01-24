package com.mitocode.java8mito.lambda;

public class Scopes {
	 
	private static double attribute1 = 2;
	private double attribute2 = 5;
	
	public double testLocalVariable() {
		// It's possible to use the value but not re assign it
		final double n3 = 3;
		Operation o1 = new Operation() {
			
			@Override
			public double calculateAVG(double n1, double n2) {
				return n1 + n2 + n3;
			}
		};
		
		Operation o2 = (x, y) -> {
			return x + y + n3;
		};
		
		return o2.calculateAVG(1, 1);
	}

	public double testStaticAtributesVariables() {
		Operation o1 = new Operation() {
			
			@Override
			public double calculateAVG(double n1, double n2) {
				//atribute1 = x + y;
				attribute2 += n1 + n2 + attribute1;
				return attribute2;
			}
		};
		
		Operation o2 = (x, y) -> {
			//atribute1 = x + y;
			attribute2 += x + y + attribute1;
			return attribute2;
		};
		return o2.calculateAVG(3, 2);
	}
	
	public static void main(String... params) {
		Scopes s = new Scopes();
		//System.out.println(s.testLocalVariable());
		System.out.println(s.testStaticAtributesVariables());
	}
	
}
