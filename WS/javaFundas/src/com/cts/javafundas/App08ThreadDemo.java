package com.cts.javafundas;

import com.cts.javafundas.models.Bus;
import com.cts.javafundas.service.NumericSeries;
import com.cts.javafundas.service.ReservationService;

public class App08ThreadDemo {

	public static void main(String[] args) {
		
		Bus bus = new Bus(25);
		
		ReservationService r1 = new ReservationService(bus, 10);
		ReservationService r2 = new ReservationService(bus, 10);
		ReservationService r3 = new ReservationService(bus, 10);
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("Reservation Started! Please wait ...!");
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {		
			e.printStackTrace();
		}
		
		System.out.println("First Service: "+ r1.getSeatsReserved());
		System.out.println("Second Service: "+ r2.getSeatsReserved());
		System.out.println("Third Service: "+ r3.getSeatsReserved());
	}

}
