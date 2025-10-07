import java.util.Scanner;

// Interface
interface Displayable57 {
    void display();
}

// Salary class
class Salary {
    double bp;    // Basic pay
    double hra;   // House rent allowance
    double da;    // Dearness allowance
    double cca;   // City compensatory allowance
    double total; // Yearly income

    public void calculateSalary() {
        if (bp <= 0) {
            System.out.println("Basic Pay must be positive.");
            return;
        }

        hra = 0.10 * bp;
        da = 0.30 * bp;
        cca = 200;
        total = 12 * (bp + da + hra + cca);
    }
}

// Tax class
class Tax {
    String name;
}

// Income_tax class extends Salary and Tax, and implements Displayable
class Income_tax extends Salary implements Displayable {
    String name; // Override from Tax
    double incomeTax;

    // Accept input and validate
    public void acceptData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = sc.nextLine();

        while (true) {
            try {
                System.out.print("Enter Basic Pay (bp): ");
                bp = Double.parseDouble(sc.nextLine());
                if (bp <= 0) {
                    System.out.println("Basic Pay must be greater than 0. Try again.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please enter a valid basic pay.");
            }
        }

        calculateSalary();
        calculateTax();
    }

    // Calculate tax based on total income
    private void calculateTax() {
        if (total > 100000) {
            incomeTax = 0.40 * total;
        } else if (total > 80000) {
            incomeTax = 0.30 * total;
        } else if (total > 60000) {
            incomeTax = 0.20 * total;
        } else {
            incomeTax = 0.0;
        }
    }

    // Display all details
    public void display() {
        System.out.println("\n--- Income Tax Details ---");
        System.out.println("Name: " + name);
        System.out.println("Basic Pay: " + bp);
        System.out.println("HRA (10%): " + hra);
        System.out.println("DA (30%): " + da);
        System.out.println("CCA: " + cca);
        System.out.println("Yearly Total Income: " + total);
        System.out.println("Income Tax: " + incomeTax);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Income_tax it = new Income_tax();
        it.acceptData();
        it.display();
    }
}
