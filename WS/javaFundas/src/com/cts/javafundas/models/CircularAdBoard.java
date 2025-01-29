package com.cts.javafundas.models;

import java.util.Objects;

public class CircularAdBoard implements AdBoard {

	private double radius;
	
	public CircularAdBoard() {
		
	}
	
	public CircularAdBoard(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI*Math.pow(radius, 2.0);
	}

	@Override
	public int hashCode() {
		return Objects.hash(radius);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CircularAdBoard other = (CircularAdBoard) obj;
		return Double.doubleToLongBits(radius) == Double.doubleToLongBits(other.radius);
	}

	@Override
	public String toString() {
		return "CircularAdBoard [radius=" + radius + "]";
	}

	
}
