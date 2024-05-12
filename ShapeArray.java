package ShapePackage;

import java.util.ArrayList;

public class ShapeArray {

    public static void main(String[] args) {
        Shape triangle = new Triangle(3, 4, 5);
        Shape circle = new Circle(6);
        Shape square = new Rectangle(7, 7);
        
        // Create an ArrayList to store shapes
        ArrayList<Shape> shapeList = new ArrayList<>();
        
        // Add shapes to the ArrayList
        shapeList.add(triangle);
        shapeList.add(circle);
        shapeList.add(square);
        
        //Loop through array and print area and perimeter
        for (Shape shape : shapeList) {
            System.out.println(shape.toString());
        }
    }
}
