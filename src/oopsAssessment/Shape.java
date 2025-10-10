package oopsAssessment;
//Q1. (Abstraction)
//A drawing application needs to calculate the area of different shapes. 
//Create an abstract class `Shape` with an abstract method `area()`. Implement `Circle` and `Rectangle` classes that 
//extend `Shape` and provide their own area calculation.

abstract class Shapee {
    abstract void area();
}
 
class Circle extends Shapee {
    double radius;
 
    Circle(double r) {
        radius = r;
    }
 
    void area() {
        System.out.println("Circle area: " + (3.14 * radius * radius));
    }
}
 
class Rectangle extends Shapee {
    double length, width;
 
    Rectangle(double l, double w) {
        length = l;
        width = w;
    }
 
    void area() {
        System.out.println("Rectangle area: " + (length * width));
    }
}
 
public class Shape {
    public static void main(String[] args) {
        Shapee c = new Circle(5);
        Shapee r = new Rectangle(4, 6);
 
        c.area();
        r.area();
    }
}
 
