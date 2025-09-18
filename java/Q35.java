import java.util.Scanner;

class Q35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        int sum = 0, count = 0, i = 0;

        do {
            System.out.print("Enter number " + (i + 1) + ": ");
            int num = sc.nextInt();

            if (num % 2 == 0) {   // check even
                sum += num;
                count++;
            }
            i++;
        } while (i < n);

        if (count > 0) {
            double avg = (double) sum / count;
            System.out.println("Average of even numbers = " + avg);
        } else {
            System.out.println("No even numbers entered.");
        }

    }
}
