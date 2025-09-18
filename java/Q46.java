import java.util.*;
class Rectangle {
    double length, breadth, area;
    void readdata(double l, double b) {
        length = l; breadth = b;
    }
    double areaCal() {
        area = length * breadth;
        return area;
    }
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.readdata(5.0, 4.0);
        System.out.println("Area = " + r.areaCal());
    }
}
