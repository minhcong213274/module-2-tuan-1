package cong;

import java.util.Scanner;

public class temperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit ");
        int number = scanner.nextInt();
        while (number != 0){
            if (number==1){
                System.out.println("Fahrenheit to Celsius");
                int Fahrenheit = scanner.nextInt();
                System.out.println((5.0 / 9) * (Fahrenheit - 32) +" Celsius");
                System.out.println("Menu");
                System.out.println("1. Fahrenheit to Celsius");
                System.out.println("2. Celsius to Fahrenheit");
                System.out.println("0. Exit ");
                number = scanner.nextInt();
            }if (number==2){
                System.out.println("Celsius to Fahrenheit");
                int Celsius = scanner.nextInt();
                System.out.println(Celsius/(5.0 / 9) +32 + " Fahrenheit");
                System.out.println("Menu");
                System.out.println("1. Fahrenheit to Celsius");
                System.out.println("2. Celsius to Fahrenheit");
                System.out.println("0. Exit ");
                number = scanner.nextInt();
            }
        }
    }
}
