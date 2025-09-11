import java.util.Scanner;

class NaturalNumbers33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int i = 1;
        System.out.println("First " + n + " natural numbers are:");

        do {
            System.out.print(i + " ");
            i++;
        } while (i <= n);
        
    }
}
