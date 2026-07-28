package day04;

import java.util.Scanner;

public class callUtil {

     public static void main(String[] args){
        utils u=new utils();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to check if it's even: ");
        int number=sc.nextInt();
       
        if(u.isEven(number)){
            System.out.println(number + " is even.");
        }
        else{
            System.out.println(number + " is odd.");
        }
        System.out.print("Enter three numbers to find the maximum: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("The maximum of " + a + ", " + b + ", and " + c + " is: " + u.maxOfThreeNumbers(a, b, c));
        System.out.print("Enter a string to reverse: ");
        String S=sc.next();
        System.out.println("The reverse of the string "+S+" is: "+u.reverseString(S));

    }

}
    

