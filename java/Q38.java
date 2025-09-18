import java.util.Scanner;

class Q38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Count digits
        int temp = num;
        int count = 0;
        while (temp > 0) {
            temp /= 10;
            count++;
        }
        System.out.println("Number of digits = " + count);

        // Reduce to single digit
        int sum = num;
        while (sum >= 10) {
            int t = sum;
            sum = 0;
            while (t > 0) {
                sum += t % 10;
                t /= 10;
            }
        }
        System.out.println("Single digit sum = " + sum);

    }
}
