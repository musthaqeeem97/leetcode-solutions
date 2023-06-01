package may;

public class Ex42TrappingRainWater {

	 public int trap(int[] height) {
	        
		 
		 int left = 0;
		 int right = height.length-1;
		 
		 int leftMax = height[left];
		 int rightMax = height[right];
		 
		 int res = 0;
		 while (left<right) {
			
			 if (leftMax<rightMax) {
				
				 left++;
				 leftMax = Math.max(height[left],leftMax);
				 res+=leftMax - height[left];
			}else {
				right--;
				rightMax = Math.max(height[right],rightMax);
				res+= rightMax - height[right];
			}
		}
		 return res;
	    }
	 
}

/*
 * Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.

Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.

Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
 */
