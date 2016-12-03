import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*John's clothing store has a pile of n  loose socks where each sock i is labeled 
with an integer, c , denoting its color. He wants to sell as many socks as possible,
 but his customers will only buy them in matching pairs. Two socks, and , are a single
 matching pair if c1 = c2 .

Given n  and the color of each sock, how many pairs of socks can John sell?

Input Format

The first line contains an integer, n , denoting the number of socks. 
The second line contains  space-separated integers describing the respective values of c0 -> cn.

Output Format

Print the total number of matching pairs of socks that John can sell.

Sample Input
9
10 20 20 10 10 30 50 10 20

Sample Output
3

*/

/* ====== MY SOLUTION ===================================================*/
public class SockPairs {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        HashMap m = new HashMap<>();
        
        int n = in.nextInt();
        
        m.put((int)in.nextInt(), 1);

        
        for(int c_i=1; c_i < n; c_i++){
            int key = in.nextInt();
            if(m.containsKey(key)) {
                m.put(key, (int) m.get(key) + 1);
            } else {
                m.put(key, 1);
            }
        }
     
        int count = 0;
        Iterator iter = m.entrySet().iterator();

        while(iter.hasNext()) { 
          Map.Entry v = (Map.Entry)iter.next();
	  count += ((int)v.getValue() / 2); //could have used bit shifting to the left, see notes
        } 
        
        System.out.println(count);
    }
}

/* ======================= HACKERRANK SOLUTION =================== */

/*
import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        HashMap<Integer, Integer> colors = new HashMap<Integer, Integer>();
        
        while(n-- > 0) {
            int c = scan.nextInt();
            Integer frequency = colors.get(c);
            
            // If new color, add to map
            if(frequency == null) {
                colors.put(c, 1);
            }
            else { // Increment frequency of existing color
                colors.put(c, frequency + 1);
            }
        }
        scan.close();
        
        // Count and print the number of pairs
        int pairs = 0;
        for(Integer frequency : colors.values()) {
            pairs += frequency >> 1;
        }
        System.out.println(pairs);
    }
}
*/

/* The signed left shift operator "<<" shifts a bit pattern to the left, and the 
signed right shift operator ">>" shifts a bit pattern to the right. The bit pattern 
is given by the left-hand operand, and the number of positions to shift by the right-hand
 operand.

int i = 4;
System.out.println(i >> 1); // prints 2 - since shift right is equal to divide by 2
System.out.println(i << 1); // prints 8 - since shift left is equal to multiply by 2

*/
