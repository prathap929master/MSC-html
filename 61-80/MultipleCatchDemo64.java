import java.util.Scanner;

public class MultipleCatchDemo64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int num = sc.nextInt(); // May throw InputMismatchException

            int result = 10 / num; // May throw ArithmeticException
            System.out.println("Result of 10 / " + num + " = " + result);

            String str = null;
            System.out.println("Length of string: " + str.length()); // May throw NullPointerException

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: Division by zero is not allowed!");
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException caught: Please enter a valid integer!");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: Cannot perform operation on a null object!");
        }

        System.out.println("Program continues after handling exceptions.");
        sc.close();
    }
}
