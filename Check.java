
import java.util.*; 
import java.io.*;

//checks if the all the letters in the string are surrounded by +
class Check {  
  public static String SimpleSymbols(String str) { 
  
   char[] newStr = str.toCharArray();
  
   int index = 0;
   boolean flag = false;
   
   if(Character.isLetter(newStr[0]) || Character.isLetter(newStr[str.length() - 1])) {
	   return "false";
	   
   }
   
   ++index;
   
   while(index < str.length() - 1) {
       
       if(Character.isLetter(newStr[index])) {
           if(newStr[index - 1] == '+' && newStr[index + 1] == '+') {
               flag = true;
           } else {
               flag = false;
           }
       }
       index++;
   }
   
   if(flag == true) {
       return "true";
   } else {
       return "false";
   }
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(SimpleSymbols(s.nextLine())); 
    s.close();
  }   
  
}








  