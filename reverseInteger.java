/*
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output:  321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could only hold integers within the 32-bit signed integer range. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows. */

    public int reverse(int x) {
     
        StringBuilder builder = new StringBuilder();
        
        String numstr = String.valueOf(x);
        builder.append(numstr);
        String reversedStr = builder.reverse().toString();
        
        if('-' == reversedStr.charAt(reversedStr.length() - 1)) {
            builder.deleteCharAt(reversedStr.length() - 1);
            reversedStr = '-' + builder.toString();      
        }
        
        try {
         if(Integer.parseInt(reversedStr) > Integer.MAX_VALUE || Integer.parseInt(reversedStr) < Integer.MIN_VALUE) {
            return 0;
            }
        }
         catch (NumberFormatException e) {
            return 0;
        }
        
        return (int) Integer.parseInt(reversedStr);    
        
}




