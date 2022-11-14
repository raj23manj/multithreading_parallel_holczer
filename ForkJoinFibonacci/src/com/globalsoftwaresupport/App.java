package com.globalsoftwaresupport;

import java.util.concurrent.ForkJoinPool;

public class App {

	public static void main(String[] args) {	
		ForkJoinPool pool = new ForkJoinPool();
		System.out.println(pool.invoke(new FibonacciTask(25)));		
	}
}
