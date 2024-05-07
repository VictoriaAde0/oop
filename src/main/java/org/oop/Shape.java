package org.oop;

public class Shape {
    public double Area() {
        return 0;
    }
    public double Perimeter() {
        return 0;
    }
}
class Rectangle extends Shape {
    private double length;
    private double breath;

    public Rectangle(double length, double breath) {
        this.length = length;
        this.breath = breath;
    }
    public double Area() {
        return length * breath;
    }

    public double Perimeter() {
        return 2 * (length + breath);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double Area() {
        return Math.PI * radius * radius;
    }

    public double Perimeter() {
        return 2 * Math.PI * radius;
    }


    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(7, 4);
        Circle circle = new Circle(4);

        System.out.println("Rectangle:");
        System.out.println("Area: " + rectangle.Area());
        System.out.println("Perimeter: " + rectangle.Perimeter());


        System.out.println("Circle:");
        System.out.println("Area: " + circle.Area());
        System.out.println("Perimeter: " + circle.Perimeter());

    }
}


