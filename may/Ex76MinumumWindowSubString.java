package may;

import java.util.HashMap;
import java.util.Map;

public class Ex76MinumumWindowSubString {

	 public String minWindow(String s, String t) {
	        
		 Map<Character,Integer> targetMap = new HashMap<>();
		 
		for (char c:t.toCharArray()) {			
			//a character can occur at multiple times in t ex:t="aabb"
			targetMap.put(c, targetMap.getOrDefault(c, 0)+1);
		}
	     
		int l = 0;
		int r = 0;
		int startIndex = 0;
		int count = 0;
		int minLength = Integer.MAX_VALUE;
		String minWIndow = "";
		   // Traverse the s string using the right pointer
		for ( r = 0; r < s.length(); r++) {
			
			char rightChar = s.charAt(r);
		  // Decrease the frequency of the current character in the map
			if (targetMap.containsKey(rightChar)) {
				targetMap.put(rightChar, targetMap.get(rightChar)+1);
				if (targetMap.get(rightChar)>=0) {
					count ++;
				}
			}
		
			//shrinking the window
			while(count==t.length()) {
				
				if(r-l+1<minLength) {
					minLength =  r-l+1;
					startIndex = l;
					minWIndow= s.substring(startIndex,startIndex+minLength);
				}
				
				char leftChar = s.charAt(l);
				
				if (targetMap.containsKey(leftChar)) {
					targetMap.put(leftChar, targetMap.get(rightChar)+1);	
					if (targetMap.get(leftChar)>0) {
						count--;
					}
				}
				l++;
			}
		}
		
		return minWIndow;		
		 
	    }
}
