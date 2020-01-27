package com.mitocode.java8mito.rxjava;

import java.util.ArrayList;
import java.util.List;

import rx.Observable;
import rx.functions.Action1;


public class RxApp {

    private List<Integer> list1;
    private List<Integer> list2;

    public RxApp() {
        list1 = new ArrayList<>();
        list2 = new ArrayList<>();
        this.fillLists();
    }

    public void fillLists() {
    	for (int i = 0; i < 10000; i++) {
			list1.add(i);
			list2.add(i);
		}
    }

    public void search() {
    	Observable<Integer> obs1 = Observable.from(list1);
    	Observable<Integer> obs2 = Observable.from(list2);
    	
    	/*Observable.merge(obs1, obs2).subscribe(new Action1<Integer>() {

			@Override
			public void call(Integer number) {
				// TODO Auto-generated method stub
				if (number == 1) {
					System.out.println(number);
				}
			}
    		
    	});*/
    	
    	Observable.merge(obs1, obs2).filter(n -> n == 1).subscribe(System.out::println);
    	Observable.merge(obs1, obs2).filter(n -> n == 1).subscribe(x -> {
    		System.out.println(x);
    	});
    }

    public static void main(String[] args) {    	
        /*List<String> list = new ArrayList<>();
        list.add("Sergio");
        list.add("Ceballos");
        list.add("Fajardo");
        		
        Observable<String> obs = Observable.from(list);
        /*obs.subscribe(new Action1<String>() {
			@Override
			public void call(String t) {
				System.out.println(t);
			}
		});
        obs.subscribe(x -> System.out.println(x));*/
    	
    	RxApp app = new RxApp();
    	app.search();
    }

}
