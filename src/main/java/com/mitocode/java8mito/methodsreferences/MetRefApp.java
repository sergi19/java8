package com.mitocode.java8mito.methodsreferences;

import java.util.Arrays;
import java.util.Comparator;

public class MetRefApp {

	public static void referenceStaticMethod() {
		System.out.println("Static Refered Method");
	}
	
	public void referenceArbitraryObjectInstanceMethod() {
		String[] names = {"Sergio", "Matias", "Luisa", "Otto"};
		
		/*Arrays.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});*/
		
		//Arrays.sort(names, (s1, s2) -> s1.compareTo(s2));
		//System.out.println(Arrays.toString(names));
		
		Arrays.sort(names, String::compareToIgnoreCase);
		System.out.println(Arrays.toString(names));
	}
	
	public void referenceParticularObjectInstanceMethod() {
		System.out.println("Particular Object Instance Refered Method");
	}
	
	public void referenceConstructor() {
		/*IPerson iper = new IPerson() {
			
			@Override
			public Person create(int id, String name) {
				return new Person(id, name);
			}
		};
		Person p = iper.create(1, "Sergio");
		System.out.println(p.getId() + " - " + p.getName());*/
		
		
		/*IPerson iper2 = (id, name) -> new Person(id, name);
		Person p = iper2.create(1, "Sergio");
		System.out.println(p.getId() + " - " + p.getName());*/
		
		IPerson iper3 = Person::new;
		Person p = iper3.create(1, "Otto");
		System.out.println(p.getId() + " - " + p.getName());
	}
	
	
	public void operate() {
		//Operation o = () -> MetRefApp.referenceStaticMethod();
		//o.greet();
		
		Operation o2 = MetRefApp::referenceStaticMethod;
		o2.greet();
	}
	
	public static void main(String[] args) {
		MetRefApp app = new MetRefApp();
		//app.operate();
		//app.referenceArbitraryObjectInstanceMethod();
		//Operation o = app::referenceParticularObjectInstanceMethod;
		//o.greet();
		app.referenceConstructor();
	}
}
