package Array_MD2;

public class Find_Smallest_Element {
    public static void main(String[] args) {
            double [] ar = {1,23,4,643,7,8,3,65,0,1235,3,75,8};
        System.out.println("Gia tri nho nhat cua mang la:" + check(ar));
    }
    public static double check(double []a){
        double min = a[0];
        for(int i = 1; i< a.length; i++){
            if(min > a[i]){
                min = a[i];
            }
        }
        return  min;
    }
}
