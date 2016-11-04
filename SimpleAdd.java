import java.util.*; 
import java.io.*;

class SimpleAddss {  
  public static int SimpleAddings(int num) { 
  
  int total = 0;
  
  while(num != 0) {
      total += num--;
  }
    return total;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(SimpleAddings(s.nextInt())); 
    s.close();
  }   
  
}