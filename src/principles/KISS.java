package principles;
 abstract class Shape {
    public abstract double calculateArea();
}

 class Circle2 extends Shape{
    private double radius;

    public Circle2(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

 class Rectangle extends Shape {
   private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}


 
 class ShapeCalculator {
	    public static double calculateCircleArea(double radius) {
	        return Math.PI * radius * radius;
	    }

	    public static double calculateRectangleArea(double length, double width) {
	        return length * width;
	    }
	}


public class KISS {
	public static void main(String[] args) {
	        double circleArea = ShapeCalculator.calculateCircleArea(5);
	        System.out.println("Circle Area: " + circleArea); 

	        double rectangleArea = ShapeCalculator.calculateRectangleArea(4, 6);
	        System.out.println("Rectangle Area: " + rectangleArea); 
	    }
	


}
