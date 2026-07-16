package day02;

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {
        //Formula: Simple Interest = (Principal × Rate × Time) / 100
        /* Example:
         * Principal = 1000
         * Rate = 5
         * Time = 2
         * SI = 100
         */
        Scanner sc = new Scanner(System.in);
        double principal = sc.nextDouble(); // Principal amount
        double rate = sc.nextDouble(); // Rate of interest
        double time = sc.nextDouble(); // Time in years

        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("The Simple Interest is: " + simpleInterest);
    }
    
}
