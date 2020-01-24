package com.mitocode.java8mito.parallelstream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamApp {

	private List<Integer> numbers;
	
	public void fillList() {
		numbers = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			numbers.add(i);
		}
	}
	
	public void testStream() {
		numbers.stream().forEach(System.out::println);
	}
	
	public void testParallelStream() {
		numbers.parallelStream().forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		ParallelStreamApp app = new ParallelStreamApp();
		app.fillList();
		//app.testStream();
		app.testParallelStream();;
	}
	
}
