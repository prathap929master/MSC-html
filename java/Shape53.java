// Base class
class Shape53 {
    double area;

    // Method to display area
    void showArea() {
        System.out.println("Area: " + area);
    }
}

// Subclass: Circle
class Circle extends Shape {
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate and display area
    void calculateArea() {
        area = Math.PI * radius * radius;
        System.out.println("Circle Radius: " + radius);
        showArea();
    }
}

// Subclass: Rectangle
class Rectangle extends Shape {
    double length, breadth;

    // Constructor
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate and display area
    void calculateArea() {
        area = length * breadth;
        System.out.println("Rectangle Length: " + length + ", Breadth: " + breadth);
        showArea();
    }
}

// Main class to test
public class Main {
    public static void main(String[] args) {
        // Create Circle object
        Circle circle = new Circle(5.0);
        circle.calculateArea();

        System.out.println();

        // Create Rectangle object
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        rectangle.calculateArea();
    }
}
