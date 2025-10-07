//52. Create a super class called figure that stores dimensions of 2 dimensional object.
// It should contain method called Area that compute area of object. 
// The program should derive 2 subclasses rectangle and triangle from main class Figure. 
// Each of these should override area() so that it returns area of each using method overriding.

// Superclass
class Figure52 {
    double dim1, dim2;

    // Constructor
    Figure(double d1, double d2) {
        dim1 = d1;
        dim2 = d2;
    }

    // Method to be overridden
    double area() {
        System.out.println("Area of figure is undefined.");
        return 0;
    }
}

// Subclass: Rectangle
class Rectangle extends Figure {

    Rectangle(double width, double height) {
        super(width, height); // Call constructor of superclass
    }

    // Override area method
    @Override
    double area() {
        return dim1 * dim2; // Area = width * height
    }
}

// Subclass: Triangle
class Triangle extends Figure {

    Triangle(double base, double height) {
        super(base, height); // Call constructor of superclass
    }

    // Override area method
    @Override
    double area() {
        return 0.5 * dim1 * dim2; // Area = 1/2 * base * height
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Figure fig; // Reference of type Figure

        // Rectangle object
        Rectangle rect = new Rectangle(10, 5);
        fig = rect;
        System.out.println("Area of Rectangle: " + fig.area());

        // Triangle object
        Triangle tri = new Triangle(8, 6);
        fig = tri;
        System.out.println("Area of Triangle: " + fig.area());
    }
}
