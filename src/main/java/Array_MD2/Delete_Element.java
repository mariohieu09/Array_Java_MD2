package Array_MD2;

import java.util.Scanner;

public class Delete_Element {
    public static void main(String[] args) {
        int[] ar = {1, 3, 4, 5, 7, 89, 3241, 5, 6, 13};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        del_el(ar, num);


    }

    public static void del_el(int[] a, int n) {
        int i = 0;
        for ( i = 0; i < a.length; i++) {
            if (a[i] == n) {
                a[i] = 0;
            }
        }
        for(i = 0; i< a.length; i++){
            for(int j = i + 1; j< a.length; j++){
                if(a[i] == 0){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(i = 0; i< a.length; i++){
            System.out.println(a[i] + " ");
        }


    }
}