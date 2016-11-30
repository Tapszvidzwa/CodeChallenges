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

/*==============================================================
Hackerank solution

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        scan.close();
        
        // use a regex matching to split the string on capital letters
        // the resulting array contains contiguous sections of lowercase letters
        String[] words = s.split("[A-Z]");
        // this works because the problem states that each word has at least 2 characters, and we know that the first character of each word is always capitalized.
        
        System.out.println(words.length);
    }
}

*/
