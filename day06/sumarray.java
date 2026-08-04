package day06;
import java.util.ArrayList;
public class sumarray {
    public static void main(String[] args){
   ArrayList<Integer> a=new ArrayList<Integer>();
   a.add(1);
   a.add(2);
    a.add(3);
    a.add(4);
    a.add(5);

    int sum=0;

   /*  for(int i=0;i<a.size();i++)
    {
        sum+=a.get(i);
    }*/

    for(int numbers:a)
    {
        sum+=numbers;
    }
    System.out.println("Sum of array elements is: "+sum);

 }
    
}
