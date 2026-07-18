package day03;

import java.util.Scanner;

public class pallindromeNumber {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(); // Example number to check for palindrome
        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Build the reversed number
            number /= 10; // Remove the last digit from the original number
        }

        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
    }
    
    
}
