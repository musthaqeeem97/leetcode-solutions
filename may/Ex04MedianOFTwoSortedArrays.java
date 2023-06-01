package may;

public class Ex04MedianOFTwoSortedArrays {
	 
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		   
		    int total = nums1.length+nums2.length;
		    int mid = total/2;
		
		    int[] res = mergeArrays(nums1,nums2,mid);
		    
		    if(total%2!=0)
		        return (double)res[mid];
		    else 
		    	return ((double)res[mid-1]+res[mid])/2;
				
	    }

	public int[] mergeArrays(int[] nums1, int[] nums2, int mid) {
		
		if(nums1.length==0) return nums2;
		if (nums2.length==0)return nums1;
			
		int res[] = new int [mid+1];
        
        int i=0;
        int j=0;
        int k=0;
        
        while (i<nums1.length && j<nums2.length&& k<=mid) {
			
        	if (nums1[i]<nums2[j]) {
				res[k++]=nums1[i++];
			}else {
				res[k++]=nums2[j++];
			}   
		}
        
        while(i<nums1.length && k<=mid) {
        	res[k++]=nums1[i++];
		}
        
        while(j<nums2.length && k<=mid) {
        	res[k++]=nums2[j++];
		}
        
        return res;
	}
}
