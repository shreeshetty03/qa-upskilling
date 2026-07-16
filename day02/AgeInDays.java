package day02;

import java.util.Scanner;

public class AgeInDays {

    public static void main(String[] args) {
        //Formula: Age in Days = Age in Years * 365
        /* Example:
         * Age in Years = 25
         * Age in Days = 9125
         */
        Scanner sc = new Scanner(System.in);
        int ageInYears = sc.nextInt(); // Example age in years
        int ageInDays = ageInYears * 365;
        System.out.println("Your age in days is: " + ageInDays);
    }
    
}
