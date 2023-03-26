package Array_MD2;

import java.util.Scanner;

public class Chuyendoi_nhietdo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Fahr - Cel");
        System.out.println("2. Cel - Fahr");
        System.out.println("Choose a method:");
        int num = sc.nextInt();
        System.out.println("Enter a number: ");
        double heit = sc.nextDouble();
        if(num == 1){
            System.out.println(FahrenheitToCelcius(heit));
        }else{
            System.out.println(CelciusToFahrenheit(heit));
        }
    }
    public static double CelciusToFahrenheit(double a){
        double b = (9.0 / 5)* a + 32;
        return b;
    }
    public static double FahrenheitToCelcius(double a){
        double b = (5.0 / 9) * (a - 32);
        return b;
    }
}
