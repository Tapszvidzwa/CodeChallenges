import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*count the number of words in the camelcase string */

public class CamelCase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int count = 0;
        
        
        for(int i = 0; i < s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i))) {
                count++;
            }
        }
        
        System.out.println(count + 1);
        
        
    }
}
