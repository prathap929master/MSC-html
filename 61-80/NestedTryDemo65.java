import java.util.Scanner;

public class NestedTryDemo65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter numerator: ");
            int numerator = sc.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = sc.nextInt();

            try {
                // Inner try block for division
                int result = numerator / denominator;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException caught: Cannot divide by zero!");
            }

            try {
                // Another inner try block for array access
                int[] arr = {1, 2, 3};
                System.out.print("Enter array index to access: ");
                int index = sc.nextInt();
                System.out.println("Array element: " + arr[index]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException caught: Invalid index!");
            }

        } catch (Exception e) {
            // Outer try block catches any other unexpected exceptions
            System.out.println("Exception caught in outer try: " + e);
        }

        System.out.println("Program continues after handling nested exceptions.");
        sc.close();
    }
}
