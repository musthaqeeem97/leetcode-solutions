package may;

public class Ex70ClimbingStairs {

	 public int climbStairs(int n) {
	        
		 if(n<=2) {
			 return n;
		 }
	 
		 int [] memo = new int[n+1];
		 memo[1]= 1;
		 memo[2] =2;
		 
				 
		 for(int i=3;i<=n;i++) {
		    memo[i] = memo[i-1]+memo[i-2];
		 }
		 
		 return memo[n];
	    }
	 public int climbStairs2(int n) {
	        
		 if(n<=3) {
			 return n;
		 }
	 
		 int a = 3;
		 int b = 2;
		 
		 
				 
		 for(int i=4;i<=n;i++) {
		   a = a+b;
		   b = a-b;
		 }
		 
		 return a;
	    }
}
