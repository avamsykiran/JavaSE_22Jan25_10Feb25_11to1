package com.cts.javafundas;

import com.cts.javafundas.service.NumericSeries;

public class App07ThreadDemo {

	public static void main(String[] args) {
	
		Thread t1 = new Thread(new NumericSeries(10,20), "Series1");
		Thread t2 = new Thread(new NumericSeries(30,40), "Series2");
		Thread t3 = new Thread(new NumericSeries(50,60), "Series3");
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
