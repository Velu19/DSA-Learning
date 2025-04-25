package Strings;

import java.util.HashMap;
import java.util.Map;

public class Valid_Anagram {

    //sort and see.
    // public boolean isAnagram(String s, String t) {

    //     if(s.length() != t.length()){
    //         return false;
    //     }


    //     char[] firstString = s.toCharArray();
    //     char[] secondString = t.toCharArray();

    //     Arrays.sort(firstString);
    //     Arrays.sort(secondString);

    //     for(int i = 0;i<firstString.length;i++){
    //         // System.out.println()
    //         if(firstString[i] != secondString[i]){
    //             return false;
    //         }
    //     }

    //     return true;
    // }


    //just see this solution for the hashmap Usage.Might need in the future.
    //but is very slow.
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> count = new HashMap<>();

        // Count the frequency of characters in string s
        for (char x : s.toCharArray()) {
            count.put(x, count.getOrDefault(x, 0) + 1);
        }

        // Decrement the frequency of characters in string t
        for (char x : t.toCharArray()) {
            count.put(x, count.getOrDefault(x, 0) - 1);
        }

        // Check if any character has non-zero frequency
        for (int val : count.values()) {
            if (val != 0) {
                return false;
            }
        }

        return true;
    }


}
