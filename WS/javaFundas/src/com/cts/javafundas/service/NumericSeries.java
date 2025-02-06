package com.cts.javafundas.service;

public class NumericSeries implements Runnable {

	private int lowerLimit;
	private int upperLimit;
			
	public NumericSeries(int lowerLimit, int upperLimit) {
		super();
		this.lowerLimit = lowerLimit;
		this.upperLimit = upperLimit;
	}

	@Override
	public void run() {
		String tname = Thread.currentThread().getName();
		for(int i=lowerLimit;i<=upperLimit;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {			
				e.printStackTrace();
			}
			System.out.println(tname + ">> " + i);
		}	
	}

}
