import java.util.Scanner;

class AgeNotValidException extends Exception {
    public AgeNotValidException(String message) {
        super(message);
    }
}

public class VoterEligibility67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            if (age < 18) {
                throw new AgeNotValidException("You are not eligible to vote!");
            } else {
                System.out.println("You are eligible to vote.");
            }
        } catch (AgeNotValidException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        sc.close();
    }
}
