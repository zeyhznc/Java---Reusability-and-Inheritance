package org.javaturk.oopj.ch12HOMEWORK;

public class Square extends Shape{
	protected double side;

	public Square(double side) {
		super(0,0);
		this.side = side;
	}
	
	@Override
	public double calculateArea() {
		double a = side*side;
		return a;
	}
	
	@Override
	public double calculateCircumference() {
		double c = 4*side;
		return c;
	}

	@Override
	public String toString() {
		String s = new String();
		s += "Square \n";
		s += "Side: " + side + "\n";		
		return s;
	}

// equals() metodunu override et
	@Override
	public boolean equals (Object s){
		Square S1 = (Square)s;
		boolean z = false;
		if (side == S1.side) {
			z = true;
		}
		return z;	
	}
	
// hashcode() metodunu override et
	@Override
	public int hashCode(double side) {
		return (int)side;
	}		
}
