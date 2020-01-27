package com.mitocode.java8mito.nashorn;

import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class NashApp {

	private ScriptEngineManager m;
	private ScriptEngine e;
	private Invocable invoked;
	
	public NashApp() {
		m = new ScriptEngineManager();
		e = m.getEngineByName("nashorn");
		invoked = (Invocable) e;
	}
	
	public void callFunctions() throws Exception {
		//e.eval("print('JS from Java')");
		e.eval(new FileReader("src/main/java/com/mitocode/java8mito/nashorn/file.js"));
		
		String resp = (String) invoked.invokeFunction("calculate", "2", "3");
		System.out.println(resp);
		
		double resp2 = (double) invoked.invokeFunction("calculate", 2, 3);
		System.out.println(resp2);
	}
	
	public void implementInterface() throws Exception {
		e.eval(new FileReader("src/main/java/com/mitocode/java8mito/nashorn/file.js"));
		
		Object implementation = e.get("threadImpl");
		Runnable r = invoked.getInterface(implementation, Runnable.class);
		
		Thread th1 = new Thread(r);
		th1.start();
		
		Thread th2 = new Thread(r);
		th2.start();
	}
	
	public static void main(String[] args) throws Exception {
		NashApp app = new NashApp();
		//app.callFunctions();
		app.implementInterface();
	}
	
}
