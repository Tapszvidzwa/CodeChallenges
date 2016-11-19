import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//Given an array of five elements find the maximum value and the minimum
//value that you could get if you were to remove only one element



public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //add all the numbers first
        long [] nums = new long[5];
        long sum = 0; 
        long max = 0;
        long min = 0;
        
        for(int i = 0; i < 5; i++) {
            nums[i] = scan.nextInt();
            sum += nums[i];
        }
        
        max = sum - nums[0];
        min = max;
        
        
        for(int i = 1; i < 5; i++) {
            if(sum - nums[i] < min) {
                min = sum - nums[i];
            }
            
            if(sum - nums[i] > max) {
                max = sum - nums[i];
            }
        }
        
        System.out.println(min + " " + max);
                  
    }
}

//a better way to deal with this was to have tried to find the
//biggest and smallest number from the array that you were given
// and use those to find the minimum and the maximum value
