//79
// Define Payable interface
interface Payable {
    double calculatePayment();
    void issueReceipt();
}

// Define Reportable interface
interface Reportable {
    void generateReport();
}

// Employee class implementing both interfaces
class Employee implements Payable, Reportable {
    private String name;
    private int id;
    private double hourlyRate;
    private double hoursWorked;

    public Employee(String name, int id, double hourlyRate, double hoursWorked) {
        this.name = name;
        this.id = id;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Implement Payable method
    @Override
    public double calculatePayment() {
        return hourlyRate * hoursWorked;
    }

    // Implement Payable method
    @Override
    public void issueReceipt() {
        System.out.println("Receipt:");
        System.out.println("Employee: " + name);
        System.out.println("ID: " + id);
        System.out.println("Total Payment: $" + calculatePayment());
        System.out.println("------------------------");
    }

    // Implement Reportable method
    @Override
    public void generateReport() {
        System.out.println("Work Report:");
        System.out.println("Employee: " + name);
        System.out.println("ID: " + id);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: $" + hourlyRate);
        System.out.println("Payment Due: $" + calculatePayment());
        System.out.println("------------------------");
    }

    // Main method to demonstrate
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 101, 25.0, 40);
        emp.issueReceipt();
        emp.generateReport();
    }
}
