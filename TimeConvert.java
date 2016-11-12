import java.io.*;
import java.util.*;

/* This is a program that converts input time to 24 hour clock
 * input ->  10:05:35AM 
 * output -> 10:05:35
 */

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String time = scan.nextLine();

        String hours = time.substring(0, 2);
        String mins = time.substring(3, 5);
        String seconds = time.substring(6, 8);
        String day = time.substring(8, 10);

	//Integer.parseInt converts string int into integer format
        int newHr = Integer.parseInt(hours);
       
        if(day.equals("PM") && newHr <= 11) {
            newHr = (newHr + 12) % 24;
        } else if(day.equals("AM") && newHr == 12) {
            newHr = 0;
        }

	//String.format is used to pad leading zeros to the int
	//the first 0 specifies that you want to pad with zeros
	//the 2 specifies that you want to have two digits as the result
	
         hours = String.format("%02d", newHr);
         System.out.println(hours + ":"+ mins + ":" + seconds);
        scan.close();
    }
}
