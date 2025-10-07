// Create a class BOX with data members width, depth, height and members functions volume, and area. 
// Calculate the volume and area of two boxes using parameterized constructor.

public class BOX51 {
    // Data members
    private double width, depth, height;

    // Parameterized constructor
    public BOX(double width, double depth, double height) {
        this.width = width;
        this.depth = depth;
        this.height = height;
    }

    // Method to calculate volume
    public double volume() {
        return width * depth * height;
    }

    // Method to calculate surface area
    public double area() {
        return 2 * (width * depth + width * height + depth * height);
    }

    // Main method
    public static void main(String[] args) {
        // Creating two BOX objects
        BOX box1 = new BOX(3.5, 4.0, 5.2);
        BOX box2 = new BOX(6.0, 7.5, 2.0);

        // Output for Box 1
        System.out.println("Box 1 Volume: " + box1.volume());
        System.out.println("Box 1 Surface Area: " + box1.area());

        // Output for Box 2
        System.out.println("Box 2 Volume: " + box2.volume());
        System.out.println("Box 2 Surface Area: " + box2.area());
    }
}
