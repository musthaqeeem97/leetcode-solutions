package may;

public class Ex287FindtheDuplicateNumber {
	
	 public int findDuplicate(int[] nums) {
		 
		    int n = nums.length;
		    int max_index = 0;
		    int max = 0;
	        for (int i = 0; i < n; i++) {
				int index = nums[i]%n;
				nums[index] = nums[index] + n;
	    }   
	        for (int i = 0; i < n; i++) {
				if(nums[i]>max) {
					max = nums[i];
					max_index = i;
				}
				//to return the values to the original value /not needed for getting the solution
				nums[i]= nums[i]%n; 
			}

	        return max_index;
	 }

}
/*
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.

 

Example 1:

Input: nums = [1,3,4,2,2]
Output: 2
Example 2:

Input: nums = [3,1,3,4,2]
Output: 3
 */
