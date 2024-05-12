package ShapePackage;

import java.lang.Math;

public class Circle extends Shape {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	double area() {
		return Math.PI * Math.pow(radius,  2);
		
	}

	@Override
	double perimeter() {
		return Math.PI * (2 *radius);
	}
	public String toString() {
		 return "Circle: Area: " + area() + ", Perimeter: " + perimeter();
	}

}
