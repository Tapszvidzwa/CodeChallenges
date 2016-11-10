/* 
Given a square matrix of size , calculate the absolute difference between the sums of its diagonals.

Input Format

The first line contains a single integer, . The next  lines denote the matrix's rows, with each line containing space-separated integers describing the columns.

Output Format

Print the absolute difference between the two sums of the matrix's diagonals as a single integer.

Sample Input

3
11 2 4
4 5 6
10 8 -12
Sample Output

15
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
         
        int n = scan.nextInt();
        
        int [][] arr = new int[n][n];
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        
        int j = 0;
        int c = n - 1;
        
        for(int i = 0; i < n; i++) {
            num1 += arr[i][j++];
            num2 += arr[i][c--];
        }
        
       num3 = num1 - num2;
        
        if(num3 < 0) {
            num3 *= -1;
        }
       
        scan.close();
        System.out.println(num3);
       
    }
}
