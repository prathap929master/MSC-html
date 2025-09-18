import java.util.*;
class Q44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int[][] a = new int[n][n];
        int sum = 0;
        System.out.println("Enter 3x3 matrix:");
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++) {
                a[i][j] = sc.nextInt();
                if (i == j) sum += a[i][j];
            }
        System.out.println("Sum of diagonal elements = " + sum);
    }
}
