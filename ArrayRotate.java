import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


//Given an array, review the final array after a number of rotations
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();  //num of elements in the array
        long k = in.nextInt(); //num of times to rotate array
        int q = in.nextInt(); //num of elements to be printed out
        
        long [] arr = new long [n];
        
        //populate the array
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextLong();
        }
        
        
         //perfom the rotation
       for(int j = 0; j < k; j++) {
            rotate(arr);
        }
        
        //print the ints at index m
        for(int c = 0; c < q; c++) {
            int m = in.nextInt();
            System.out.println(arr[m]);
        }  
        in.close();
    }
    
    public static void rotate(Long [] arr) {
        
        long temp = arr[arr.length - 1];
      
        for(int i = arr.length - 2; i >= 0; i--) {
         
            arr[i + 1] = arr[i];
        }
       arr[0] = temp;
    }
    
    }

//A faster way to solve this would have been to find a
//a mathematical way to to work how the indexes work
//rather than rotating all the elements because that has O(n)
//where n is the number of rotations, imagine if there was an incredibly large number
//of rotations

//TO-DO

// I will pull up the suggested solution from hackerank and explain it
