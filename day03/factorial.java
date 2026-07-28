package day03;

import java.util.Scanner;

public class factorial {
    public static int printFactorial(int number, int factorial) {

        if(number == 0) {
        //  System.out.println("Factorial of " + number + " is: " + factorial);
           return factorial;
       }
        factorial *= number;
        return printFactorial(number-1, factorial);

        
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number=sc.nextInt(); // Example number to calculate factorial
        int factorial = 1;
        int fact=printFactorial(number, factorial); // Call the method to print factorial
        System.out.println("Factorial of " + number + " is: " + fact);

    
}
}

