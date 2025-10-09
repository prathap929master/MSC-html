// Program to find volume of Cube, Cylinder and Sphere using Method Overloading
import java.util.Scanner;

class VolumeCalculator {

    // Volume of cube: a^3
    double volume(double a) {
        return a * a * a;
    }

    // Volume of cylinder: π * r^2 * h
    double volume(double r, double h) {
        return Math.PI * r * r * h;
    }

    // Volume of sphere: (4/3) * π * r^3
    double volume(float r) {
        return (4.0 / 3.0) * Math.PI * r * r * r;
    }
}

public class VolumeOverload {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VolumeCalculator obj = new VolumeCalculator();

        System.out.print("Enter side of cube: ");
        double a = sc.nextDouble();
        System.out.println("Volume of Cube = " + obj.volume(a));

        System.out.print("\nEnter radius and height of cylinder: ");
        double r = sc.nextDouble();
        double h = sc.nextDouble();
        System.out.println("Volume of Cylinder = " + obj.volume(r, h));

        System.out.print("\nEnter radius of sphere: ");
        float rs = sc.nextFloat();
        System.out.println("Volume of Sphere = " + obj.volume(rs));
    }
}