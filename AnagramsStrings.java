/*Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.

Complete the function in the editor. If  and  are case-insensitive anagrams, print "Anagrams"; otherwise, print "Not Anagrams" instead.

Input Format

The first line contains a string denoting . 
The second line contains a string denoting .

Constraints

Strings  and  consist of English alphabetic characters.
The comparison should NOT be case sensitive.
Output Format

Print "Anagrams" if  and  are case-insensitive anagrams of each other; otherwise, print "Not Anagrams" instead.

Sample Input 0

anagram
margana
Sample Output 0

Anagrams
*/

 static boolean isAnagram(String a, String b) {
        // Complete the function
        
        String A = a.toLowerCase();
        String B = b.toLowerCase();
        
        
       if (A.length() != B.length()) {
            return false;
        }
  
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
       
        for(int i = 0; i < A.length(); i++) {
            
            if(hm.containsKey(A.charAt(i))) {
            hm.put(A.charAt(i), hm.get(A.charAt(i)) + 1);
            }
            
            else {
                  hm.put(A.charAt(i),1);
            }
        }
       
        Set set = hm.entrySet();
        Iterator iter = set.iterator();
         
        while(iter.hasNext()) {
            
            
            Map.Entry hmItem = (Map.Entry) iter.next();
            
            char searchItem = (char) hmItem.getKey();
            
            int count1 = 0;
            
            
            for(int i = 0; i < B.length(); i++) {
                
                
                if(B.charAt(i) == searchItem) {
                    ++count1;
                } 
               
            }
            
            
            if(count1 == hmItem.getValue()) {
                continue;
            } else {
                return false;
            }     
        }
        
        return true;
      
    }















