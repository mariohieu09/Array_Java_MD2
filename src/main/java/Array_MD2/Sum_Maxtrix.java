package Array_MD2;

import java.util.Arrays;

public class Sum_Maxtrix {
    public static void main(String[] args) {
        int[][] a = {{222, 44, 57}, {99, 37, 68}, {93, 71, 332}};
        for (int i = 0; i < a.length; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
        System.out.println();
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0;i < a.length; i++){
            sum1 += a[i][i];
        }
        for(int i = 0; i < a.length; i++){
            sum2 += a[a.length - 1 - i][i];
        }
        System.out.println("Tong duong cheo thu nhat la: " + sum1);
        System.out.println("Tong duong cheo thu hai la: " + sum2);
    }
}
