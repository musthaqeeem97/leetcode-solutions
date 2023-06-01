package may;

import java.util.Stack;

public class Ex20ValidParentheses {

	 public boolean isValid(String s) {
	        Stack<Character> stack  = new Stack<>();
	        
	        for (int i = 0; i < s.length(); i++) {
				if (')'==(s.charAt(i))&&!stack.isEmpty()&&stack.peek()=='(') {
					stack.pop();
				}
				else if(']'==(s.charAt(i))&&!stack.isEmpty()&&stack.peek()=='[')  {
					stack.pop();
				}
				else if ('}'==(s.charAt(i))&&!stack.isEmpty()&&stack.peek()=='{')  {
					stack.pop();
				}
				else {
					stack.push(s.charAt(i));
				}
			}
	        return stack.isEmpty();
	    }
}
