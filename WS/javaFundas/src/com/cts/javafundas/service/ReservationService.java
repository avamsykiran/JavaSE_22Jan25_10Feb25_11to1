package com.cts.javafundas.service;

import java.util.ArrayList;
import java.util.List;

import com.cts.javafundas.models.Bus;

public class ReservationService implements Runnable {

	private Bus bus;
	private int seatsRequired;
	private List<Integer> seatsReserved;
	
	public ReservationService(Bus bus, int seatsRequired) {
		super();
		this.bus = bus;
		this.seatsRequired = seatsRequired;
		this.seatsReserved = new ArrayList<>();
	}

	public List<Integer> getSeatsReserved() {
		return seatsReserved;
	}

	@Override
	public void run() {
		for(int i=1;i<=seatsRequired;i++) {
			synchronized (bus) {
				int lastReservedSeat = bus.getLastReservedSeat();
				if(lastReservedSeat<bus.getMaxSeats()) {
					int seat = lastReservedSeat + 1;
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {				
						e.printStackTrace();
					}
					this.seatsReserved.add(seat);
					bus.setLastReservedSeat(seat);
				}	
			}
		}
	}
	
	
	
}
