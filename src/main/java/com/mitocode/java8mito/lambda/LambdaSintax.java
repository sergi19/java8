package com.mitocode.java8mito.lambda;

public class LambdaSintax {
	
	public double testSintax() {
		Operation o = (double x, double y) -> (x + y) / 2;
		//Operation o = (double x, double y) -> { return (x + y) / 2; };
		/*Operation o = (double x, double y) -> {
			double a = 2.0;
			return (x + y) / 2 + a; 
		};*/
		/*Operation o = (x, y) -> {
			double a = 2.0;
			return (x + y) / 2 + a; 
		};*/
		//Operation o = (x, y) -> (x + y) / 2;
		//Operation o = () -> 2;
		/*Operation o = () -> {
			int x = 2;
			int y = 4;
			return x + y;
		};*/
		return o.calculateAVG(2, 3);
	}

	public static void main( String[] args ) {
		LambdaSintax lambdaSintax = new LambdaSintax();
        System.out.println(lambdaSintax.testSintax());
    }
	
}
