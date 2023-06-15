import java.io.*;
import java.util.* ;
import java.util.ArrayList;
public class longestSubsetZeroSum {
	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {
		int n = arr.size();
		int[] preArr = new int[n+1];
		preArr[0] = 0;
		for(int i = 0; i < n; ++i) preArr[i+1] = arr.get(i) + preArr[i];
		HashMap<Integer, Integer> map = new HashMap<>();
		int ans = 0;
		for(int i = 0; i <= n; ++i){
			if(map.containsKey(preArr[i]) == false)map.put(preArr[i], i);
			else ans = Math.max(ans, i - map.get(preArr[i]));
		}
		return ans;
	}
}