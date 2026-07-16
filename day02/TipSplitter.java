package day02;

import java.util.Scanner;

public class TipSplitter {
 
    public static void main(String[] args) {
        /*  Formula: 
        Tip Amount = (Bill Amount × Tip Percentage) / 100
        Total Bill = Bill Amount + Tip Amount
        Amount Per Person = Total Bill / Number of People
         * Example:
         * Bill Amount = 1000
         * Tip Percentage = 10
         * Number of People = 4
         * Tip per person = 275
         */
        Scanner sc = new Scanner(System.in);
        double billAmount = sc.nextDouble(); // Total bill amount
        double tipPercentage = sc.nextDouble(); // Tip percentage
        int numberOfPeople = sc.nextInt(); // Number of people splitting the 
        double tipAmount = (billAmount * tipPercentage / 100);
        double totalBill= billAmount + tipAmount;
        double tipPerPerson = totalBill / numberOfPeople;
        System.out.println("Each person should pay: " + tipPerPerson);
    }

    
}
