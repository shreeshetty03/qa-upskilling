package day05;

import java.util.Scanner;

public class StringUtils {

    public static String revereString(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
    
    public static boolean isPalindrome(String str){
        String reversedStr=revereString(str);
        return str.equals(reversedStr);
    }

    public static int countVowels(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            //char ch=Character.toLowerCase(str.charAt(i)); // Convert character to lowercase for case-insensitive comparison
            // Check if the character is a vowel (both lowercase and uppercase)
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
               ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                count++;
            }
        }
        return count;
    }
    public static boolean isAnagram(String str1, String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        else{
               StringBuffer sb = new StringBuffer(str2);

        
        for (int i = 0; i < str1.length(); i++) {

            char ch = str1.charAt(i);
            boolean found = false;

            for (int j = 0; j < sb.length(); j++) {

                if (ch == sb.charAt(j)) {

                    sb.deleteCharAt(j);   // Remove matched character
                    found = true;
                    break;
                }
            }

            if (!found) {
                return false;
            }
        }

        
        if (sb.length() == 0)
           return true;
        else
              return false;
        /*char[] arr1=str1.toCharArray();
          char[] arr2=str2.toCharArray();
          java.util.Arrays.sort(arr1);
          java.util.Arrays.sort(arr2);
          return java.util.Arrays.equals(arr1,arr2);
         */
        }

    }
    public static void Capitalize_1st_Letter_Each_Word_In_String(String str)
    {     /* Remove extra spaces and trim the string
           //s means Any whitespace character (space, tab, etc.)
           {2,} means Two or more times
           "\\s{2,}" Find two or more consecutive spaces.
           */ 
       
         String replaceStrings =str.replaceAll("\\s{2,}", " ").trim();

        String[] words = replaceStrings.split(" ");

        for (String word : words) {

            System.out.print(
                word.substring(0,1).toUpperCase()
                + word.substring(1)
                + " "
            );
        }
     
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String reverse=sc.next();
        System.out.println("The reversed string"+reverse+ "is: " + StringUtils.revereString(reverse));
        System.out.print("Enter a string to check palindrome: ");
        String palindrome=sc.next();
        System.out.println("Is " + palindrome + " a palindrome? " + StringUtils.isPalindrome(palindrome));
         System.out.print("Enter a string to count vowels in: ");
        String vowelsString=sc.next();
        System.out.println("The number of vowels in " + vowelsString + "' is: " + StringUtils.countVowels(vowelsString));
        System.out.print("Enter two strings to check if they are anagrams: ");
        String str1=sc.next();
        String str2=sc.next();
        System.out.println("Are '" + str1 + "' and '" + str2 + "' anagrams? " + StringUtils.isAnagram(str1, str2));
        System.out.print("Enter a string to capitalize the first letter of each word: ");
        String capitalizeString=sc.nextLine();
        StringUtils.Capitalize_1st_Letter_Each_Word_In_String(capitalizeString);
    }

   
}
