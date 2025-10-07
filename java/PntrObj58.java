public class PntrObj58 {
    private int roll_no;
    private String name;

    // Method to set data
    public void setData(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }

    // Method to print data and identify object
    public void print() {
        System.out.println("Invoked by object with ID: " + System.identityHashCode(this));
        System.out.println("Roll No: " + this.roll_no);
        System.out.println("Name: " + this.name);
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        // Create 3 objects
        PntrObj obj1 = new PntrObj();
        PntrObj obj2 = new PntrObj();
        PntrObj obj3 = new PntrObj();

        // Set data
        obj1.setData(101, "Alice");
        obj2.setData(102, "Bob");
        obj3.setData(103, "Charlie");

        // Print data using each object
        obj1.print();
        obj2.print();
        obj3.print();
    }
}
