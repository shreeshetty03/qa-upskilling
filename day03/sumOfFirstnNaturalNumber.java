package day03;

import java.util.Scanner;

public class sumOfFirstnNaturalNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt(); // Read the value of n from the user
        int sum = 0;
       int result= printsumOfFirstnNaturalNumber(n,sum); // Call the method to print the sum
       System.out.println("Sum of first " + n + " natural numbers is: " + result);
    }

    public static int printsumOfFirstnNaturalNumber(int n,int sum) {
        if(n == 0) {
          return sum;
       }
        sum += n;
      return printsumOfFirstnNaturalNumber(n-1, sum);

        
    }

}

