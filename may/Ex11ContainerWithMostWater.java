package may;

public class Ex11ContainerWithMostWater {

	 public int maxArea(int[] height) {
	        
		 int start = 0;
		 int end = height.length -1;
		 
		 int area;
		 int maxArea = 0;
		 
		 while (start<end) {
			 
			 area = Math.min(height[start],height[end])*(end-start);
			 if (area>maxArea) {
				maxArea = area;
			}
			 if (height[start]<height[end]) {
				start++;
			}else {
				end--;
			}
			
		}
		 return maxArea;
	 }
}
