package may;

public class Ex05LongestpallindromicSubString {

	 public String longestPalindrome(String s) {
	      
		 int n = s.length();
		  boolean[][] isPalindrome = new boolean[n][n]; 
		  
		  String longestSubString = "";
		  int maxLength = 0;
		  
		  
		  for (int diff = 0; diff < n; diff++) {
			
			   for (int i = 0, j = diff +i; j < n; i++,j++) {
				
				   //when difference is 0/when length of palindrome substring 1
				   if(i==j) isPalindrome[i][j]= true;
				   
				   //when difference is 1/when length of palindrome substring 2
				   else if (diff==1) 
					   isPalindrome[i][j]=(s.charAt(i)==s.charAt(j))?true:false;
					
				 //when difference is 2 or more/when length of palindrome substring is 3 or more
				   else {
					   if((s.charAt(i)==s.charAt(j))&&(isPalindrome[i+1][j-1])){
						   isPalindrome[i][j]=true;
					   }
				   }
				   
				   if (isPalindrome[i][j]) {
					
					   if (j-i+1>maxLength) {
						   maxLength = j-i+1;
						   longestSubString = s.substring(i,j+1);
						
					}
				}
			}
				   
		}
		  return longestSubString;
	}
}
