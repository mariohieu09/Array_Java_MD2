package Array_MD2;

public class Matrix_BG_Element {
    public static void main(String[] args) {
        int [][]a = {{1,2,4}, {8,9,10}, {111,890,431142}};
        System.out.println(Biggest_element(a));
    }
    public static int Biggest_element(int[][] a){
        int max = a[0][0];
        for(int i = 0; i < a.length; i++){
            for(int j = 1; j < a[i].length; j++){
                if(max < a[i][j]){
                    max = a[i][j];
                }
            }

        }
        return max;
    }

}
