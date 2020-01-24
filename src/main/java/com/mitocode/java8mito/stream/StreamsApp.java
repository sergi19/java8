package com.mitocode.java8mito.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamsApp {

	private List<String> list;
	private List<String> numbers;
	
	public StreamsApp() {
		list = new ArrayList<>();
		list.add("Mito");
		list.add("Code");
		list.add("Jaime");
		list.add("Mitocode");
		
		numbers = new ArrayList<>();
		numbers.add("1");
		numbers.add("2");
	}
	
	public void filter() {
		list.stream().filter(x -> x.startsWith("M")).forEach(System.out::println);
	}
	
	public void sort() {
		list.stream().sorted().forEach(System.out::println);
	}
	
	public void transform() {
		//list.stream().map(String::toUpperCase).forEach(System.out::println);
		numbers.stream().map(x -> Integer.parseInt(x) * 10).forEach(System.out::println);
		//numbers.stream().map(Integer::parseInt).map(x -> x * 10).forEach(System.out::println);
	}
	
	public void limit() {
		list.stream().limit(2).forEach(System.out::println);
	}
	
	public void count() {
		System.out.println(list.stream().count());
	}
	
	
	public static void main(String[] args) {
		StreamsApp app = new StreamsApp();
		//app.filter();
		//app.sort();
		//app.transform();
		//app.limit();
		app.count();
	}
	
}
