package com.cts.javafundas.models;

public class Bus {

	private int maxSeats;
	private int lastReservedSeat;
	
	public Bus(int maxSeats) {
		super();
		this.maxSeats = maxSeats;
		this.lastReservedSeat = 0;
	}

	public int getMaxSeats() {
		return maxSeats;
	}
	
	public int getLastReservedSeat() {
		return lastReservedSeat;
	}

	public void setLastReservedSeat(int lastReservedSeat) {
		this.lastReservedSeat = lastReservedSeat;
	}
	
}
