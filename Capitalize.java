import java.util.*; 

	class Capitalize {  
	  public static String LetterCapitalize(String str) { 
	  
	 char [] newStr = str.toCharArray();
	 
	 
	 //check if the string is null
	 if(newStr == null) {
		 return "";
	 }
	 
	 
	 int index = 0;
	 char capitalized;
	 //if it isnt, the capitalize the first word
	 
	 
	 while (index < str.length()) {
		 if(index == 0) {
			 capitalized = Character.toUpperCase(newStr[index]);
			newStr[index] = capitalized;
		 }
		 	 
	 //run thru the array and look for the spaces,
		if(newStr[index] == ' '){
			capitalized = Character.toUpperCase(newStr[++index]);
			newStr[index] = capitalized;
			
		
		}
		
		index++;
	 }
	 
	 String ret = new String(newStr);
	 

	    return ret;
	    
	  } 
	  
	  public static void main (String[] args) {  
	    // keep this function call here     
	    Scanner s = new Scanner(System.in);
	    System.out.print(LetterCapitalize(s.nextLine())); 
	    s.close();
	  }   
}
