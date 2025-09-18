import java.util.*;
class Q43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = 3, c = 3;
        int[][] a = new int[r][c];
        int[][] b = new int[r][c];
        int[][] prod = new int[r][c];

        System.out.println("Enter first 3x3 matrix:");
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                a[i][j] = sc.nextInt();

        System.out.println("Enter second 3x3 matrix:");
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                b[i][j] = sc.nextInt();

        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                for(int k=0;k<c;k++)
                    prod[i][j] += a[i][k] * b[k][j];

        System.out.println("Product of matrices:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
                System.out.print(prod[i][j] + " ");
            System.out.println();
        }
    }
}
