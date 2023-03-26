package Array_MD2;

import java.util.Arrays;
import java.util.Scanner;

public class Colums_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = {{222, 44, 57}, {99, 37, 68}, {93, 71, 332}};
        for (int i = 0; i < a.length; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
        System.out.println("Enter a colum you want: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i][n - 1];
        }
        System.out.println("Ket qua la: " + sum);
    }
}
