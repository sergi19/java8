package com.mitocode.java8mito.repeatedannotations;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class AnnotationsApp {

	@Retention(RetentionPolicy.RUNTIME)
	public @interface Languages {
		Language[] value() default {};
	}
	
	@Repeatable(value = Languages.class)
	public @interface Language {
		String value();
	}
	
	//1.7
	/*@Lenguajes({
		@Lenguaje("Java"),
		@Lenguaje("Python")
	})*/
	//1.8
	@Language("Java")
	@Language("Python")
	public interface ProgrammingLanguage {
		
	}
	
	public static void main(String[] args) {
		Language[] arrayLenguaje = ProgrammingLanguage.class.getAnnotationsByType(Language.class);
		System.out.println("You have " + arrayLenguaje.length + " annotations in Language[]");
		
		Languages len = ProgrammingLanguage.class.getAnnotation(Languages.class);
		for (Language element : len.value()) {
			System.out.println(element.value());
		}
	}
	
}
