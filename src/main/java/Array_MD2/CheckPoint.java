package Array_MD2;

import java.util.Scanner;

public class CheckPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        double[] arr = new double[30];
        for(int i = 0; i < arr.length; i++){
            System.out.println("Nhap diem sinh vien thu " + (i +1));
            arr[i] = sc.nextDouble();
        }
        for(int i = 0; i< arr.length; i++){
            if(arr[i] > 5.0){
                count++;
            }
        }
        System.out.println("Co tong cong " + count + "sinh vien da thi do");
    }
}
