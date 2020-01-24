package com.mitocode.java8mito.foreachremoveifsort;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionApp {

	private List<String> list;
	
	public void fillList() {
		list = new ArrayList<>();
		list.add("Mitocode");
		list.add("Mito");
		list.add("Code");
	}
	
	public void useForEach() {
		/*for (String element : list) {
			System.out.println(element);
		}*/
		
		//list.forEach(x -> System.out.println(x));
		
		list.forEach(System.out::println);
	}
	
	public void useRemoveIf() {
		//This gonna throw an error
		/*for (String element : list) {
			if(element.equalsIgnoreCase("code")) {
				list.remove(element);
			}
		}*/
		
		/*Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			if(it.next().equalsIgnoreCase("code")) {
				it.remove();
			}
		}*/
		
		list.removeIf(x -> x.equalsIgnoreCase("mito"));
	}
	
	public void useSort( ) {
		list.sort((x, y) -> x.compareTo(y));
	}
	
	public static void main(String[] args) {
		CollectionApp app = new CollectionApp();
		app.fillList();
		//app.useRemoveIf();
		app.useSort();
		app.useForEach();
	}
	
}
