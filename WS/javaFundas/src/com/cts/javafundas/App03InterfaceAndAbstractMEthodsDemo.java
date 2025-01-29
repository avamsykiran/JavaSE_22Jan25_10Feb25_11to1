package com.cts.javafundas;

import com.cts.javafundas.models.CircularAdBoard;
import com.cts.javafundas.models.RectangularAdBoard;

public class App03InterfaceAndAbstractMEthodsDemo {

	public static void main(String[] args) {
		
		RectangularAdBoard rb = new RectangularAdBoard(10,10);
		CircularAdBoard cb = new CircularAdBoard(10);
		
		System.out.println(rb.costOfPainting(5));
		System.out.println(cb.costOfPainting(5));

	}

}
