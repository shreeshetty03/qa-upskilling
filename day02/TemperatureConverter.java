package day02;

import java.util.Scanner;

public class TemperatureConverter {
   
    public static void main(String[] args) {
        //Formula: Fahrenheit = (Celsius × 9/5) + 32
        /* Example:
         * Celsius = 37
         * Fahrenheit = 98.6
         */
        Scanner sc = new Scanner(System.in);
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
    }
    
}
