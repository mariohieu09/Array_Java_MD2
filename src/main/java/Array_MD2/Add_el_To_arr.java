package Array_MD2;

public class Add_el_To_arr {
    public static void main(String[] args) {
        int []a = {1,2,3,4};
        Add_el(a, 6, 3);

    }
    public static void Add_el(int []a, int n, int index){
        int []b = new int [a.length +1];
        for(int i = 0; i < a.length; i++){
            b[i] = a[i];
            if(i == index){
                b[i] = n;
                break;
            }
        }
        for(int j = index; j < a.length - 1; j++){
            b[j + 1] = a[j];
        }
        for(int k = 0; k< b.length; k++){
            System.out.println(b[k]);
        }
    }
}

