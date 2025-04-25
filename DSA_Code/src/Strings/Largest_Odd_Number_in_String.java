package Strings;

//Easy
public class Largest_Odd_Number_in_String {

    //Travelling from behind and getting the first odd number
    //will give you the first odd number
    public String largestOddNumber(String num) {

        for (int i =num.length()-1 ; i>=0 ; i--){

            int val = num.charAt(i) - '0';

            if(val %2 == 1){
                return new String(num).substring(0, i+1);
            }

        }


        return "";
    }
}
