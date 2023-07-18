import java.util.* ;
import java.io.*; 
public class kMostFrequencies {
	public static class Pair{
        int ele;
        int freq;
        Pair(int ele, int freq){
            this.ele = ele;
            this.freq = freq;
        }
    }
	public static int[] KMostFrequent(int n1, int k, int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : nums)
            map.put(n, map.getOrDefault(n, 0) + 1);
        Pair[] p = new Pair[map.size()];
        int i = 0;
        for(int key : map.keySet())
            p[i++] = new Pair(key, map.get(key));
        Arrays.sort(p, (Pair a, Pair b) -> b.freq - a.freq);
        int[] ans = new int[k];
        i = 0;
        while(k-- > 0)
            ans[i] = p[i++].ele;
        return ans;
	}

}
