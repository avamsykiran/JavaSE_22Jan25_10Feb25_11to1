package com.cts.javafundas.models;

import java.util.Objects;

public class RectangularAdBoard implements AdBoard{

	private double length;
	private double breadth;
	
	public RectangularAdBoard() {
		
	}
	
	public RectangularAdBoard(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	@Override
	public double area() {
		return length*breadth;
	}

	@Override
	public int hashCode() {
		return Objects.hash(breadth, length);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RectangularAdBoard other = (RectangularAdBoard) obj;
		return Double.doubleToLongBits(breadth) == Double.doubleToLongBits(other.breadth)
				&& Double.doubleToLongBits(length) == Double.doubleToLongBits(other.length);
	}

	@Override
	public String toString() {
		return "RectangularAdBoard [length=" + length + ", breadth=" + breadth + "]";
	}

	
}
