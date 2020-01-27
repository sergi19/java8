package com.mitocode.java8mito.highorderfunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class HighApp {

    private Function<String, String> convertToUppercase = x -> x.toUpperCase();
    private Function<String, String> convertToLowercase = x -> x.toLowerCase();

    public void show(Function<String, String> function, String value) {
        System.out.println(function.apply(value));
    }

    public Function<String, String> showMessage(String message) {
        return (String x) -> message + x;
    }

    public void filter(List<String> list, Consumer<String> consumer, int length, String string) {
        //list.stream().filter(establishLogic(length)).forEach(consumer);
        list.stream().filter(establishFilterLogic(string)).forEach(consumer);
    }

    public Predicate<String> establishLogic(int length) {
        return text -> text.length() < length;
    }

    public Predicate<String> establishFilterLogic(String string) {
        return text -> text.contains(string);
    }

    public static void main(String[] args) {
        HighApp app = new HighApp();
        app.show(app.convertToUppercase, "sergio");
        app.show(app.convertToLowercase, "SERGio");

        String message = app.showMessage("Hola ").apply("Sergio");
        System.out.println(message);

        List<String> list = new ArrayList<>();
        list.add("Mito");
        list.add("Code");
        list.add("MitoCode");

        //app.filter(list, System.out::println, 7, null);
        app.filter(list, System.out::println, 0, "Code");
    }

}
