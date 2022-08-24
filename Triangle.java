package org.javaturk.oopj.ch12HOMEWORK;

public class Triangle extends Shape {
	protected double side1;
	protected double side2;

	public Triangle(double height, double width, double side1, double side2) {
		super(height, width);
		this.side1= side1;
		this.side2 = side2;
	}
	
	@Override
	public double calculateArea() {
		double a = (width*height) / 2 ;
		return a;
	}

	@Override
	public double calculateCircumference() {
		double c = side1 + side2 + height;
		return c;
	}

	@Override
	public String toString() {
		String s = new String();
		s += "Triangle \n";
		s += "Height: " + height + "\n";
		s += "Width: " + width + "\n";
		s += "Side 1: " + side1 + "\n";	
		s += "Side 2: " + side2 + "\n";	
		return s;
	}
	
// equals() metodunu override et
	@Override
	public boolean equals(Object t) {
		Triangle T1 = (Triangle) t;
		boolean p = false;
		if((width == T1.width) && (height == T1.height)) {
			p = true;
		}
		return p;
	}
// hashcode() metodunu override et	
	@Override 
	public int hashCode(double width, double height) {
		return (int) width;
	}
	
	
	
	
	
	
	
	
	
	
}
