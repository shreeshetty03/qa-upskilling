package day03;

import java.util.Scanner;

public class sumOfFirstnNaturalNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt(); // Read the value of n from the user
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i; // Add the current number to the sum
        }

        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }

}