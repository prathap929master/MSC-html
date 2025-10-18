// Base class Employee
class Employee {
    protected String name;
    protected int id;
    protected double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

// Derived class Manager
class Manager extends Employee {
    private double bonus;

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    // Override displayDetails to include bonus
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Bonus: " + bonus);
    }
}

// Main program
public class EmployeeDemo74 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 101, 50000);
        Manager mgr1 = new Manager("Bob", 102, 80000, 15000);

        // Array of type Employee demonstrating polymorphism
        Employee[] employees = {emp1, mgr1};

        for (Employee e : employees) {
            System.out.println("------------------------");
            e.displayDetails(); // Calls appropriate displayDetails() method
        }
    }
}
