package ShapePackage;


public class Triangle extends Shape {
	private double side1; //base
	private double side2; //height
	private double side3; //hypotenuse 
	
	public Triangle() {
		double side1 = 0;
		double side2 = 0;
		double side3 = 0;
	}
	
	
	public Triangle (double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		
	}

	@Override
	double area() {
		
		double s = (side1 + side2 + side3) / 2;
		
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		
	}

	@Override
	double perimeter() {
		return side1 + side2 +side3;
	}
	public String toString() {
		 return "Triangle: Area: " + area() + ", Perimeter: " + perimeter();
	}

}
