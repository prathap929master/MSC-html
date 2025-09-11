import java.util.Scanner;

class Q34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int i = 1, count = 0;
        do {
            System.out.print(i + " ");
            i += 2;   // move to next odd number
            count++;
        } while (count < n);

    }
}
