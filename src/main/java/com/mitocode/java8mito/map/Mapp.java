package com.mitocode.java8mito.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Mapp {
	
	private Map<Integer, String> map;
	
	public void fillMap() {
		map = new HashMap<>();
		map.put(1, "Sergio");
		map.put(2, "Ceballos");
		map.put(3, "Fajardo");
	}
	
	public void show_v7() {
		for (Entry<Integer, String> e : map.entrySet()) {
			System.out.println("Key: " + e.getKey() + " Valor: " + e.getValue());
		}
	}
	
	public void show_v8() {
		//map.forEach((k,v) -> System.out.println("Key: " + k + " Valor: " + v));
		//map.entrySet().stream().forEach(e -> System.out.println("Key: " + e.getKey() + " Valor: " + e.getValue()));
		map.entrySet().stream().forEach(System.out::println);
	}
	
	public void insertIfAbsent() {
		map.putIfAbsent(3, "New");
	}
	
	public void operateIfPresent() {
		map.computeIfPresent(3, (k,v) -> k + v);
		System.out.println(map.get(3));
	}
	
	public void getOrDefault() {
		String value = map.getOrDefault(4, "Default value");
		System.out.println(value);
	}
	
	public void gather() {
		Map<Integer, String> gatherMap = map.entrySet().stream()
				.filter(e -> e.getValue().contains("S"))
				.collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
		gatherMap.forEach((k,v) -> System.out.println("Key: " + k + " Valor: " + v));
	}
	
	public static void main(String[] args) {
		Mapp app = new Mapp();
		app.fillMap();
		//app.show_v7();
		//app.insertIfAbsent();
		//app.operateIfPresent();
		//app.getOrDefault();
		app.gather();
		//app.show_v8();
	}

}
