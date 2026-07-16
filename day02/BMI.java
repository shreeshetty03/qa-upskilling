package day02;

import java.util.Scanner;

public class BMI {

    public static void main(String[] args){
        //Formula:BMI = weight / (height × height) where weight is in kilograms and height is in meters
        Scanner sc=new Scanner(System.in);
        float weight;
        float height;
        float BMI;
        weight=sc.nextFloat();
        height=sc.nextFloat();
        BMI=weight / (height * height);
        System.out.println("Your BMI is: " + BMI);
      }
    
}
