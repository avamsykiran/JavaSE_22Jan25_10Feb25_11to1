package com.cts.javafundas.models;

public interface AdBoard {
	
	double area();
	
	public default double costOfPainting(double paintRate) {
		return area()*paintRate;
	}
}
