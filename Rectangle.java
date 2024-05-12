package ShapePackage;

public class Rectangle extends Shape {
	
	private double width;
	private double length;
	
	public Rectangle (double width, double length) {
		this.width = width;
		this.length = length;
	}

	@Override
	double area() {
		return length * width;
		
	}

	@Override
	double perimeter() {
		return (length * 2) + (width * 2);
		
	}
	
	public String toString() {
		return "Rectangle: Area: " + area() + ", Perimeter: " + perimeter();
	}

}
