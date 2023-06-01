package may;

public class Ex152MaximumProductSubArray {

	public int maxProduct(int[] nums) {
        
		int minProduct = nums[0];
		int maxProduct = nums[0];
		int maxResult = nums[0];
		
		
		for (int i = 1; i < nums.length; i++) {
			
			int tempMax = Math.max(nums[i],Math.max(maxProduct*nums[i], minProduct*nums[i]));
			minProduct = Math.min(nums[i],Math.min(maxProduct*nums[i],minProduct*nums[i]));
			
			maxResult = Math.max(maxResult, tempMax);
			
			
			maxProduct = tempMax;
			
		}
		System.out.println(minProduct);
		
		return maxResult;
    }
	public static void main(String[] args) {
		Ex152MaximumProductSubArray x = new Ex152MaximumProductSubArray();
		int nums[] = {2,3,-2,4};
		System.out.println(x.maxProduct(nums));
	}
}
