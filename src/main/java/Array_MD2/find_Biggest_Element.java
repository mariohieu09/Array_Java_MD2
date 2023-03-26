package Array_MD2;

public class find_Biggest_Element {
    public static void main(String[] args) {
            int[] a = {1,23,5426,7,8,879,314};
        System.out.println("Gia tri lon nhat la: " + check(a));


        }
        public static int check(int[] ar){
            int max = ar[0];
            for (int i = 1; i < ar.length; i++) {
                if (max < ar[i]) {
                    max = ar[i];
                }
            }
            return max;
        }
    }