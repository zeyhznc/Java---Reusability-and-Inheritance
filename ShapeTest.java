package org.javaturk.oopj.ch12HOMEWORK;

public class ShapeTest   {

	public static void main(String[] args) {
		Circle c1 = new Circle(3.0);
		System.out.println(c1.toString());
		System.out.println("The area of the circle is: ");
		System.out.println(c1.calculateArea());
		System.out.println("The circumference of the circle is: ");
		System.out.println(c1.calculateCircumference());
		
		Circle c2 = new Circle (2.5);
		System.out.println("Are the object c1 equal to the object c2 ?");
		System.out.println(c1.equals(c2));
		System.out.println("Print the hash codes of the objects c1 and c2");
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		System.out.println("");
		System.out.println("***************************************************");
		
		
		Rectangle rect1 = new Rectangle(2.0, 5.0);
		System.out.println(rect1.toString());
		System.out.println("The area of the rectangle is: ");
		System.out.println(rect1.calculateArea());
		System.out.println("The circumference of the rectangle is: ");
		System.out.println(rect1.calculateCircumference());
		
		Rectangle rect2 = new Rectangle(2.0, 5.0);
		System.out.println("Are the objects rect1 and rect2 equal?");
		System.out.println(rect1.equals(rect2));
		System.out.println("Print the hash codes of the objects rect1 and rect2");
		System.out.println(rect1.hashCode());
		System.out.println(rect2.hashCode());
		
		System.out.println("");
		System.out.println("***************************************************");
		
		
		Square s1 = new Square(4.0);
		System.out.println(s1.toString());
		System.out.println("The area of the square is: ");
		System.out.println(s1.calculateArea());
		System.out.println("The circumference of the square is: ");
		System.out.println(s1.calculateCircumference());
		
		Square s2 = new Square (5.0);
		System.out.println("Are the objects s1 and s2 equal?");
		System.out.println(s1.equals(s2));
		System.out.println("Print the hash codes of the objects s1 and s2");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println("");
		System.out.println("***************************************************");
		
		
		Triangle tri1 = new Triangle(6.0,3.0,2.0,2.0);
		System.out.println(tri1.toString());
		System.out.println("The area of the square is: ");
		System.out.println(tri1.calculateArea());
		System.out.println("The circumference of the square is: ");
		System.out.println(tri1.calculateCircumference());
		
		Triangle tri2 = new Triangle(6.0,3.0,4.0,4.0);
		System.out.println("Are the objects tri1 and tri2 equal?");
		System.out.println(tri1.equals(tri2));
		System.out.println("Print the hash codes of the objects tri1 and tri2");
		System.out.println(tri1.hashCode());
		System.out.println(tri2.hashCode());
		
		
		
		
		
		
		
		
		
		

		
	}

}
