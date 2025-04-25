package Strings;

public class Remove_Outermost_Parentheses {

    //The solution I wrote.....
    // public String removeOuterParentheses(String s) {

    //     String resString ="";

    //     int i = 0;
    //     int j = 1 ;
    //     int count =0;

    //     while(i < s.length() && j <s.length()){
    //         if( s.charAt(j) == ')' && count == 0){
    //             i = j+1;
    //             j = i+1;
    //         }
    //         else if(s.charAt(j) == '('){
    //             count++;
    //             resString+='(';
    //              j++;
    //         }
    //         else{
    //             count--;
    //             resString+=')';
    //             j++;
    //         }

    //     }


    //     return resString;


    // }

    //best solution. The same logic but different implementation.
    public String removeOuterParentheses(String s) {
        StringBuilder res = new StringBuilder();
        int depth = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (depth > 0) res.append(ch);
                depth++;
            } else {
                depth--;
                if (depth > 0) res.append(ch);
            }
        }

        return res.toString();
    }

}
