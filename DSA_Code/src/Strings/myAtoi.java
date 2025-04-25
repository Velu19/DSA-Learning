package Strings;

public class myAtoi {

    // You didn't solve this problem .
    //but you were 80% there.
    // public int myAtoi(String s) {
    //     int sign = 1;
    //     long res = 0;
    //     s = s.trim();
    //     int j = 0;

    //     if(s.length() == 0){
    //         return 0;
    //     }

    //     char[] sArray = s.toCharArray();

    //     if(s.charAt(0) == '-'){
    //          sign = -1; j++;
    //     }else if(s.charAt(0)== '+'){
    //         j++;
    //     }

    //     for(int i = j ;i<sArray.length;i++){
    //         if(sArray[i] < '0' || sArray[i] > '9' ){
    //             break;
    //         }else{
    //             res = res * 10 + (sArray[i] - '0'); // Convert char to number
    //             if (sign * res > Integer.MAX_VALUE) return Integer.MAX_VALUE; // Handle overflow
    //             if (sign * res < Integer.MIN_VALUE) return Integer.MIN_VALUE;
    //         }

    //     }

    //     return (int) (sign*res);
    // }

    public int myAtoi(String s) {
        s = s.trim(); // Remove leading whitespace
        int sign = 1, i = 0;
        long res = 0; // Using long to handle overflow cases

        if (s.length() == 0) return 0;

        // Check for sign
        if (s.charAt(0) == '-') { sign = -1; i++; }
        else if (s.charAt(0) == '+') { i++; }

        // Process numerical characters
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (ch < '0' || ch > '9') break; // Stop at non-numeric character

            res = res * 10 + (ch - '0'); // Convert char to number
            if (sign * res > Integer.MAX_VALUE) return Integer.MAX_VALUE; // Handle overflow
            if (sign * res < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;
        }
        return (int) (sign * res);
    }

}
