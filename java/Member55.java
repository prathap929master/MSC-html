// Base class: Member
class Member55 {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    // Constructor
    public Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    // Method to print salary
    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

// Subclass: Employee
class Employee extends Member {
    String specialization;

    // Constructor
    public Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("--- Employee Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Specialization: " + specialization);
        printSalary();
    }
}

// Subclass: Manager
class Manager extends Member {
    String department;

    // Constructor
    public Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }

    // Method to display manager details
    public void displayDetails() {
        System.out.println("--- Manager Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        printSalary();
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating Employee object
        Employee emp = new Employee(
            "Alice", 30, "9876543210", "Delhi", 50000.0, "Software Development"
        );

        // Creating Manager object
        Manager mgr = new Manager(
            "Bob", 40, "9123456780", "Mumbai", 80000.0, "IT Department"
        );

        // Displaying details
        emp.displayDetails();
        System.out.println();
        mgr.displayDetails();
    }
}
