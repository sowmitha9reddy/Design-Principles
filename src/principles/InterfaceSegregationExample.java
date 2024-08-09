package principles;
//interface Shape {
//    void draw();
//    void resize();
//    void calculateArea();
//}
//
//class Circle implements Shape {
//    public void draw() {
//        System.out.println("Drawing Circle");
//    }
//
//    public void resize() {
//        System.out.println("Resizing Circle");
//    }
//
//    public void calculateArea() {
//        System.out.println("Calculating area of Circle");
//    }
//}
//
//class Square implements Shape {
//    public void draw() {
//        System.out.println("Drawing Square");
//    }
//
//    public void resize() {
//        System.out.println("Resizing Square");
//    }
//
//    public void calculateArea() {
//        System.out.println("Calculating area of Square");
//    }
//}
//
////class Point implements Shape {
////    public void draw() {                                   //it gives an error  beacuse the class need to implements all the methods in interface.
////        System.out.println("Drawing Point");
////    }
////
////}
//
//
//
//public class InterfaceSegregationExample {
//	public static void main(String[] args) {
//        Shape circle = new Circle();
//        circle.draw();
//        circle.resize();
//        circle.calculateArea();
//        Shape s = new Square();
//        s.draw();
//        s.resize();
//        s.calculateArea();
//
////        Shape point = new Point();
////        point.draw();
//        
//    }
//}

interface Drawable {
    void draw();
}

interface Resizable {
    void resize();
}

interface AreaCalculable {
    void calculateArea();
}

class Circle implements Drawable, Resizable, AreaCalculable {
    public void draw() {
        System.out.println("Drawing Circle");
    }

    public void resize() {
        System.out.println("Resizing Circle");
    }

    public void calculateArea() {
        System.out.println("Calculating area of Circle");
    }
}

class Square implements Drawable, Resizable, AreaCalculable {
    public void draw() {
        System.out.println("Drawing Square");
    }

    public void resize() {
        System.out.println("Resizing Square");
    }

    public void calculateArea() {
        System.out.println("Calculating area of Square");
    }
}

class Point implements Drawable {
    public void draw() {
        System.out.println("Drawing Point");
    }
}
public class InterfaceSegregationExample {
 public static void main(String[] args) {
   Circle circle = new Circle();
    circle.draw();
    circle.resize();
    circle.calculateArea();
  
    

    Drawable point = new Point();
    point.draw();
}

}

