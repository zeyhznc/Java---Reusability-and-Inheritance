package org.javaturk.oopj.ch12HOMEWORK;

public class Rectangle extends Shape {
	
	public Rectangle(double height, double width) {
		super(height,width);
	}

	@Override
	public double calculateArea() {
		double a = super.height * super.width;
		return a;
	}
	
	@Override
	public double calculateCircumference() {
		double c = 2*(super.height + super.width);
		return c;
	}

	@Override
	public String toString() {
		String s = new String();
		s += "Rectangle \n";
		s += "Height: " + height + "\n";
		s += "Width: " + width + "\n";
		return s;
		}
	
	
// equals() metodunu override et
	@Override
	public boolean equals(Object r){
		Rectangle R1 = (Rectangle)r;
		boolean y = false;
		if((width == R1.width) && (height == R1.height)) {
			y =true;
		}
		return y;
	}

// hashcode() metodunu override et
	@Override
	public int hashCode(double width, double height) {
		return (int) width;
	}	
}
