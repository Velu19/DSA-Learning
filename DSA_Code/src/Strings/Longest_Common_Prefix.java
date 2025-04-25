package Strings;

import java.util.Arrays;

public class Longest_Common_Prefix {

    //This is like brute force solution....This works well.
    // public String longestCommonPrefix(String[] strs) {

    //     String comp = strs[0];

    //     StringBuilder res = new StringBuilder();

    //     if(comp.length() == 0){
    //         return  "";
    //     }

    //     for(int i = 0 ; i <comp.length() ;i++ ){
    //         char pos = comp.charAt(i);

    //         for(int j = 0;j<strs.length ; j++){

    //             //check why the first condition exists.
    //             if( i >= strs[j].length() || strs[j].charAt(i) != pos   ){
    //                 return res.toString();
    //             }
    //         }

    //         res.append(pos);
    //     }


    //     return res.toString();

    // }


    //If the array is sorted then you have to compare only the last and first strings.
    //why sort the array??

    /**
     consider the input array of strings {"flower", "flow", "flight"}.
     After sorting the array, we get {"flight", "flow", "flower"}.
     The longest common prefix of all the strings is "fl", which is located at the beginning of the first string "flight" and the second string "flow".
     Therefore, by comparing the first and last strings of the sorted array, we can easily find the longest common prefix.
    */
    public String longestCommonPrefix(String[] strs) {

        StringBuilder res = new StringBuilder();

        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length-1];

        for(int i = 0;i< Math.min(first.length(), last.length() ) ;i++){
            if(first.charAt(i) != last.charAt(i)){
                return res.toString();
            }
            res.append(first.charAt(i));
        }

        return res.toString();
    }


}
