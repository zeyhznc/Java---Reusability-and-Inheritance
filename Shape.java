package org.javaturk.oopj.ch12HOMEWORK;

public class Shape {
	protected double height;
	protected double width;
	
	public Shape (double height, double width) {
		this.height= height;
		this.width = width;
	}
	
	public void draw(){
		
	}
	
	public void erase(){
		
	}
	
	public double calculateArea(){
		double a = height*width;
		return a;
	}
	
	public double calculateCircumference() {
		double c = 2*(height+width);
		return c;
	}

	public int hashCode(double radius) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int hashCode(double width, double height) {
		// TODO Auto-generated method stub
		return 0;
	}

		
}
	
	

	
	
	
	
	
	


