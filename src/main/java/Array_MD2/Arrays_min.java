package Array_MD2;

public class Arrays_min {
    public static void main(String[] args) {
        int []a = {1,6,9,35,543,9,0};
        System.out.println("Gia tri nho nhat trong mang la :" + min_element(a));
    }
    public static int min_element(int[]a){
        int min = a[0];
        for(int i = 1; i< a.length; i++){
            if(min > a[i]){
                min = a[i];
            }
        }
        return  min;
    }
}
