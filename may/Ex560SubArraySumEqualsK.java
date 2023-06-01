package may;

import java.util.HashMap;

public class Ex560SubArraySumEqualsK {

	public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        
        if (n==0) {
			return 0;
		}
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int i = 0;
        int sum = 0;
        int count = 0;
        
        while (i<n) {
        	
        	sum +=  nums[i];
        	
        	if (sum==k) {
				count = count +1;
			}
        	
        	if (map.containsKey(sum-k)) {
				count += map.get(sum-k);
			}
        	
        	map.put(sum, map.getOrDefault(sum,0)+1);
			i++;
		}
        return count;
    }
	public static void main(String[] args) {
		Ex560SubArraySumEqualsK x = new Ex560SubArraySumEqualsK();
		
		int[] nums = {0,0,0,0,0,0,0,0,0,0};
		
		System.out.println(x.subarraySum(nums, 0));
	}
}
