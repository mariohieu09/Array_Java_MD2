package Array_MD2;

import java.util.Arrays;

public class Array_join {
    public static void main(String[] args) {
        int []a = {1,2,3,4};
        int []b = {5,6,7,8,9,10};
        Arrs_join(a, b);
    }
    public static void Arrs_join(int[]a , int[]b){
       int length = a.length + b.length;
       int []c = new int[length];
       int pos = 0;
       for(int i : a){
           c[pos] = i;
           pos++;
       }
       for(int i : b){
           c[pos] = i;
           pos++;
       }
        System.out.println(Arrays.toString(c));
    }


}
