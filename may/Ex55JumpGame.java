package may;

public class Ex55JumpGame {

	 public boolean canJump(int[] nums) {
		 
		 if(nums.length==1) return true;
	        
		 int max = 0;
		 
		 for (int i = 0; i < nums.length-1  && max>=i; i++) {
			
			 max = Math.max(max, i+nums[i]);
			 
			 if (max>=nums.length-1) {
				
				 return true;
			}
	    }
		 return false;
		 
	}	 
}
