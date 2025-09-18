import java.util.Scanner;

public class Q41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        int sum = 0;

        System.out.println("Enter 9 integers for the 3x3 matrix:");

        // Read matrix elements and add to sum
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
                sum += matrix[i][j];
            }
        }

        // Display the matrix
        System.out.println("\nThe 3x3 matrix is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // Display the total sum
        System.out.println("\nSum of all elements = " + sum);
        sc.close();
    }
}
