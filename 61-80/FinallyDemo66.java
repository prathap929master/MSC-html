import java.util.Scanner;

public class FinallyDemo66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter numerator: ");
            int numerator = sc.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = sc.nextInt();

            int result = numerator / denominator; // May throw ArithmeticException
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: Cannot divide by zero!");
        } finally {
            // This block executes regardless of exception
            System.out.println("Finally block executed: Closing resources or cleanup tasks.");
            sc.close();
        }

        System.out.println("Program continues after try-catch-finally.");
    }
}
