package com.mitocode.java8mito.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Hello world!
 *
 */
public class LambdaApp {
	
	public void sort() {
		List<String> list = new ArrayList<>();
		list.add("MitoCode");
		list.add("Code");
		list.add("Mito");
		
		/*Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		
		});*/
		
		Collections.sort(list, (String p1, String p2) -> p1.compareTo(p2));
		
		for(String element: list) {
			System.out.println(element);
		}
	}
	
	public void calculate() {
		/*Operation o = new Operation() {
			
			@Override
			public double calculateAVG(double n1, double n2) {
				return (n1 + n2) / 2;
			}
		};
		System.out.println(o.calculateAVG(2, 3));*/
		
		Operation o = (double x, double y) -> (x + y) / 2;
		System.out.println(o.calculateAVG(2, 3));
	}
	
    public static void main( String[] args ) {
        LambdaApp lambdaApp = new LambdaApp();
        //lambdaApp.sort();
        lambdaApp.calculate();
    }
}
