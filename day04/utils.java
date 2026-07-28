package day04;

public class utils {

    public boolean isEven(int number){
         return number % 2 == 0;

     }

    public int maxOfThreeNumbers(int a,int b,int c){
         if (a >= b && a >= c)
            return a;
        else if (b >= a && b >= c)
            return b;
        else
            return c;
        /*
        static int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
        }
         */
    }
    
    public String reverseString(String str){
        String reversed="";
        for(int i=str.length()-1;i>=0;i--)
        {
            reversed+=str.charAt(i);
        }
        return reversed;
    }


    

    
}
