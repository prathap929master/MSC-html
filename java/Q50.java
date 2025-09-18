class VolumeCalc {
    double volume(double a) {                // cube
        return a*a*a;
    }
    double volume(double r, double h) {      // cylinder
        return Math.PI * r * r * h;
    }
    double volume(double l, double b, double h) { // rectangle
        return l * b * h;
    }
    double volumeSphere(double r) {          // sphere
        return (4.0/3.0) * Math.PI * r * r * r;
    }

    public static void main(String[] args) {
        VolumeCalc v = new VolumeCalc();
        System.out.println("Cube : " + v.volume(3));
        System.out.println("Cylinder : " + v.volume(2,5));
        System.out.println("Rectangle : " + v.volume(2,3,4));
        System.out.println("Sphere : " + v.volumeSphere(3));
    }
}
