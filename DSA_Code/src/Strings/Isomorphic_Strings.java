package Strings;


import java.util.Arrays;

public class Isomorphic_Strings {

    //This solution is good and it beats 75%users.
    //but let me try the solution with arrays.
    // public boolean isIsomorphic(String s, String t) {

    //     if(s.length() != t.length()){
    //         return false;
    //     }

    //     Map<Character,Character> maping = new HashMap<Character,Character>();

    //     for(int i=0; i<s.length(); i++ ){
    //         char sc = s.charAt(i);
    //         char tc = t.charAt(i);

    //         if(maping.containsKey(sc)){
    //             if(maping.get(sc) != tc ){
    //                 return false;
    //             }

    //         }
    //         else if (maping.containsValue(tc)){
    //             return false;

    //         }
    //         maping.put(sc,tc);

    //     }


    //     return true;

    // }

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        //why integer of length 256
        //because there are just 256 characters
        int[] mapST = new int[256];
        int[] mapTS = new int[256];
        Arrays.fill(mapST, -1);
        Arrays.fill(mapTS, -1);

        for (int i = 0; i < s.length(); i++) {
            char chS = s.charAt(i);
            char chT = t.charAt(i);

            if (mapST[chS] == -1 && mapTS[chT] == -1) {
                mapST[chS] = chT;
                mapTS[chT] = chS;
            } else {
                if (mapST[chS] != chT || mapTS[chT] != chS) {
                    return false;
                }
            }
        }
        return true;
    }

}
