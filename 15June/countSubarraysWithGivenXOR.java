import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class countSubarraysWithGivenXOR {
	public static int subarraysXor(ArrayList<Integer> arr, int x) {
		int xor = 0, ans = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(xor, 1);
		for(int i = 0; i < arr.size(); ++i){
			xor = xor ^ arr.get(i);
			if(map.containsKey(xor ^ x) == true) ans += map.get(xor ^ x);
			map.put(xor, map.getOrDefault(xor, 0) + 1);
		}
		return ans;
	}
}