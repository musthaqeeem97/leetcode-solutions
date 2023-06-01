package may;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EX139WordBreak {

Map<String, Boolean> map = new HashMap<>();

//recursive
public boolean wordBreak(String s, List<String> wordDict) {
	if (wordDict.contains(s)) {
		return true;
	}  
	
	if(map.containsKey(s)) {
		return map.get(s);
	}
	
	
	for (int i = 0; i < s.length(); i++) {
		
		if(wordDict.contains(s.substring(0, i)) && wordBreak(s.substring(i),wordDict)) {
			map.put(s, true);
			return true;			
		}
		
	}
	map.put(s, false);
	return false;
    }



//dynamic programming
public boolean wordBreak2(String s, List<String> wordDict) {
	
	Set<String> wordSet = new HashSet<>(wordDict);
	boolean[] dp = new boolean[s.length()+1];
	dp[0] = true;
	
	for (int i = 1; i < dp.length; i++) {
		for (int j = 0; j < i; j++) {
			if (dp[j]&&wordSet.contains(s.subSequence(j, i))) {
				dp[i] = true;
			}
		}
	}
	return dp[s.length()];
}

}