import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SubString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
        
        //make a special case when string length is either zero or one
        
        //sub string starts from the index of the string you want to 
        //take and then ends with one more than the String you want to take
        
        //leave the outer number
        
        
        //method
        //-Get the string
        //-if the string is null throw exception of given null argument
        //otherwise just print out str.substring(start, end);
        
        if(S.equals(null)) {
            throw new NullPointerException("You cannot find the substring of a null string");
        }
        
        System.out.println(S.substring(start, end));
        return;
        
        
        
    }
}

