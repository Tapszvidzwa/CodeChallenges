/* This exercise is to test your understanding of Java Strings. A sample String declaration:

String myString = "Hello World!"
The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.

Given two strings of lowercase English letters,  and , perform the following operations:

Sum the lengths A of  and B .
Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
Capitalize the first letter in  and  and print them on a single line, separated by a space.
Input Format

The first line contains a string . The second line contains another string . The strings are comprised of only lowercase English letters.

Output Format

There are three lines of output: 
For the first line, sum the lengths of  and . 
For the second line, write Yes if  is lexicographically larger than  or No if it is not. 
For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.

Sample Input

hello
java
Sample Output

9
No
Hello Java
Explanation

String A is "hello" and B is "java".

A has a length of 5 , and B has a length of $ ; the sum of their lengths is 9 . 
When sorted alphabetically/lexicographically, "hello" comes before "java"; therefore,  is not larger than  and the answer is No.

When you capitalize the first letter of both  and  and then print them separated by a space, you get "Hello Java".
*/

import java.io.*;
import java.util.*;

public class firstToAppearInAlphabet {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        //count the number of characters
        char[] strA = A.toCharArray();
        char[] strB = B.toCharArray();
        
        //
        System.out.println(strA.length + strB.length);
        System.out.println(firstAlphabet(strA, strB));
        System.out.println(capitalize(strA) + " " + capitalize(strB));
        
    }
    
    
    public static String capitalize(char[] str) {
        
        str[0] = Character.toUpperCase(str[0]);
        return String.valueOf(str);
        
    }
    
    public static String firstAlphabet(char[] smaller, char[] larger) {
        
      for(int i = 0; i < smaller.length; i++) {
          if(smaller[i] < larger[i]) {
              return "No";
          } else if(larger[i] < smaller[i]) {
             return "Yes";
          }
      }
        
        return "No";
    }
    
}

//Comments 
//// You could have probably used compareToMethod
//
//str1.compareTo(str2) if equal returns zero, if str appears first, returns less than zero, if it appears somewhere ahead, it produces a positive number 
//
//
//the The value 0 if the argument is a string lexicographically equal to this string; a value less than 0 if the argument is a string lexicographically greater than this string; and a value greater than 0 if the argument is a string lexicographically less than this string




