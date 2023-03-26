package Array_MD2;

import java.util.Scanner;

public class Find_Element {
    public static void main(String[] args) {
        boolean Exis = false;
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String x;
        x = sc.nextLine();
        for(int i = 0; i< students.length; i++){
            if(x.equals(students[i])){
                System.out.println("Position of the students in the list " + x + " is: " + i);
                Exis = true;
                break;
            }
        }
        if(Exis == false){
            System.out.println("Not found");
        }


    }
}
