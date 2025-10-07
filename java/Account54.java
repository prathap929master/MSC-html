import java.util.Scanner;

// Superclass: Account
class Account54 {
    long acc_no;
    double balance;

    // Constructor
    public Account(long acc_no, double balance) {
        this.acc_no = acc_no;
        this.balance = balance;
    }

    // Method to display account details
    public void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

// Subclass: Person
class Person extends Account {
    String name;
    String aadhar_no;

    // Constructor
    public Person(String name, String aadhar_no, long acc_no, double balance) {
        super(acc_no, balance); // Call Account class constructor
        this.name = name;
        this.aadhar_no = aadhar_no;
    }

    // Override disp() method
    @Override
    public void disp() {
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
        super.disp(); // Call disp() of Account class
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        // Array of Person objects
        Person[] persons = new Person[n];

        // Input details for each person
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Person " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Aadhar Number: ");
            String aadhar = sc.nextLine();

            System.out.print("Account Number: ");
            long acc_no = sc.nextLong();

            System.out.print("Balance: ");
            double balance = sc.nextDouble();
            sc.nextLine(); // consume newline

            // Create Person object and store in array
            persons[i] = new Person(name, aadhar, acc_no, balance);
        }

        // Display details of all persons
        System.out.println("\n--- Person Details ---");
        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            persons[i].disp();
        }

        sc.close();
    }
}
