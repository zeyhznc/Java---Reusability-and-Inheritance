package org.javaturk.oopj.ch12HOMEWORK;

public class Circle extends Shape {
	protected double radius;

	public Circle(double radius) {
		super(0,0);
		this.radius = radius;
	}
	
	

	@Override 
	public double calculateArea() {
		double a = Math.PI*(radius*radius);
//		System.out.println("The area of the circle is: " +a);
		return a;
	}
	
	public double calculateCircumference() {
		double c = 2*(Math.PI)*(radius);
//		System.out.println("The circumference of the circle is: "+c);
		return c;
	}
	

	
	@Override
	public String toString() {
		String s = new String();
		s += "Circle\n";
		s += "Radius: " + radius + "\n";		
		return s;
		
	}

	
// equals() metodunu override et
	@Override
	public boolean equals (Object c) {
		Circle C1 = (Circle)c;
		boolean x = false;
		if(radius == C1.radius)
			x = true;
		return x;
	}
	
	
// hashcode() metodunu override et
	@Override
	public int hashCode(double radius) {
		return (int) radius;
	}	
}
