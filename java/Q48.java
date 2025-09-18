class Distance {
    int feet;
    float inches;

    void set(int f, float i) { feet = f; inches = i; }
    void disp() { System.out.println(feet + " feet " + inches + " inches"); }

    Distance add(Distance d) {
        Distance res = new Distance();
        res.feet = feet + d.feet;
        res.inches = inches + d.inches;
        if(res.inches >= 12) {
            res.feet += (int)(res.inches / 12);
            res.inches = res.inches % 12;
        }
        return res;
    }

    public static void main(String[] args) {
        Distance d1 = new Distance();
        Distance d2 = new Distance();
        Distance d3;
        d1.set(5, 8.5f);
        d2.set(3, 7.0f);
        d3 = d1.add(d2);
        d1.disp();
        d2.disp();
        System.out.print("Sum: "); d3.disp();
    }
}
