package may;

import java.util.ArrayList;
import java.util.List;

public class Ex22GenerateParentheses {
 
    public List<String> generateParenthesis(int n) {
	        
	        List <String> validParentheses = new ArrayList<>();
	        generateParentheses(validParentheses,n,0,0,"");
	  
	        return validParentheses;
	    }

	private void generateParentheses(List<String> validParentheses, int n, int open, int close,String string) {
		
		if (string.length()== 2*n) {
			validParentheses.add(string);
			return;
		}
		
		if (open<n) {
			generateParentheses(validParentheses,n,open+1,close,string+"(");
		}
		
		if (close<open) {
			generateParentheses(validParentheses,n,open,close+1,string+")");
		}
		
	}
}
