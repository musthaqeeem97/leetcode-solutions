package may;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex56MergeIntervals {

	 public int[][] merge(int[][] intervals) {
	        // Sort intervals based on the start time
		 Arrays.sort(intervals,(a,b)->(a[0]<b[0])?-1:(a[0]>b[0])?1:0);

	        List<int[]> mergedIntervals = new ArrayList<>();
	       
	        if (intervals.length ==0) {
				return mergedIntervals.toArray(new int[0][]);
			}
	        
	        int[] currentInterval = intervals[0];
	        
	        //will compare the end of the current interval to the start of the remaining intervals 
	        for (int i = 1; i < intervals.length; i++) {
				if (currentInterval[1]>=intervals[i][0]) {
					currentInterval[1] = Math.max(currentInterval[1], intervals[i][1]);
				}else {
					mergedIntervals.add(currentInterval);
					currentInterval = intervals[i];
				}
			}
	        mergedIntervals.add(currentInterval);
	        
	        //will  convert the List<int[]> into a nested array of size==mergedIntervals.size(); 
	        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
	    }
}
