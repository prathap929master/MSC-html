import java.util.Scanner;

class Q36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = sc.nextInt();

        System.out.print("Enter exponent: ");
        int exp = sc.nextInt();

        int result = 1, i = 1;

        do {
            result *= base;
            i++;
        } while (i <= exp);

        System.out.println(base + "^" + exp + " = " + result);

    }
}
