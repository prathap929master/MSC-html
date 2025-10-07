// Abstract class
abstract class Shape59 {
    int dim1, dim2;

    // Constructor to initialize dimensions
    Shape(int dim1, int dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    // Abstract method to print area
    abstract void printArea();
}

// Rectangle class
class Rectangle extends Shape {
    Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    @Override
    void printArea() {
        int area = dim1 * dim2;
        System.out.println("Rectangle Area: " + area);
    }
}

// Triangle class
class Triangle extends Shape {
    Triangle(int base, int height) {
        super(base, height);
    }

    @Override
    void printArea() {
        double area = 0.5 * dim1 * dim2;
        System.out.println("Triangle Area: " + area);
    }
}

// Circle class
class Circle extends Shape {
    Circle(int radius) {
        super(radius, 0); // Only one dimension needed
    }

    @Override
    void printArea() {
        double area = Math.PI * dim1 * dim1;
        System.out.println("Circle Area: " + area);
    }
}

// Main class to test
public class Main {
    public static void main(String[] args) {
        Shape rect = new Rectangle(10, 20);
        Shape tri = new Triangle(10, 15);
        Shape cir = new Circle(7);

        rect.printArea();
        tri.printArea();
        cir.printArea();
    }
}
