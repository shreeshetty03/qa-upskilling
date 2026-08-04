package day06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class groupWordByLength {
    public static HashMap<Integer, List<String>> groupWords(String[] words){
      HashMap<Integer, List<String>> groupedWords = new HashMap<>();

         for(String word:words)
          {
            int length=word.length();
            if(!groupedWords.containsKey(length))
            {
                groupedWords.put(length,new ArrayList<>()); //adds a new key-value pair to the HashMap with the length as the key and an empty ArrayList as the value.
            }
            groupedWords.get(length).add(word); //retrieves the ArrayList associated with the length key and adds the current word to that list.
        }

        return groupedWords;
    }

    public static void main(String[] args) {
        String[] words = {"apple", "banana", "kiwi", "grape", "orange", "pear", "peach"};
        HashMap<Integer, List<String>> mp = groupWords(words);
         

        for(Map.Entry<Integer,List<String>> entry:mp.entrySet())
        {
            System.out.println("Words of length "+entry.getKey()+" are: "+entry.getValue());
        }

    }
    
}
