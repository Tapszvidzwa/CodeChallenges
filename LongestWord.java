import java.util.*; 

class LongestWords {
  public static String LongestWord(String sen) { 
	  
	  //cases: null case -> return ""
	  
	  if (sen == null) {
		  return "";
	  }
	  
	  //convert the input string into a char array
	  char[] input = sen.toCharArray();  
	  int globalCount = 0;
	  int globalIndex = 0;
	  int count = 0;
	  int firstIndex;
	  
	 //go through the loop and find alphabetic letters
	  for(int i = 0; i < input.length; i++) {
		   
		  if(Character.isLetter(input[i])) {
			  firstIndex = i;
			  count = 0;
			  
			  while(i < input.length && Character.isLetter(input[i])) {
				  count++;
				  i++;	
				  
				  if(i == input.length) {
					  break;
				  }
			  }
					  
			  if(count > globalCount) {
				  globalCount = count;
				  globalIndex = firstIndex;
				  
				  //reset count and first index
				  count = 0;
				  firstIndex  = 0;  
			  }
		  }
		  
	  }
	  
	  String newStr = "";
	
	  while(globalCount != 0) {
		  newStr = newStr + input[globalIndex++];
		  globalCount--;
	  }
	  
	  return newStr;	 
	   }  
    
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LongestWord(s.nextLine())); 
    s.close();
  }  
}

