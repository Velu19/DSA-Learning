package Strings;

public class Rotate_String {
    public boolean rotateString(String s, String goal) {

        if(s.length() != goal.length() ){
            return false;
        }

        String subString = s+s;

        if(subString.contains(goal)){
            return true;
        }
        else{
            return false;
        }

    }
}
