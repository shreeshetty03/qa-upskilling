package day03;

import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt(); // Example number to calculate factorial
        int factorial = 1;

        for(int i = 1; i <= number; i++) {
            factorial *= i; // Multiply factorial by the current number
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
    }




    
}
