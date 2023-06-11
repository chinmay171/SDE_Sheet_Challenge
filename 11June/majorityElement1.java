import java.io.*;
import java.util.* ;

public class majorityElement1 {
	public static int findMajority(int[] arr, int n) {
		int floor = (n/2);
		// HashMap<Integer, Integer> map = new HashMap<>();
		// for(int i = 0 ; i < n; ++i){
		// 	map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		// 	if(map.get(arr[i]) > floor) return arr[i];
		// }
		// return -1;

		int element = -1;
		int count = 0;
		for(int i = 0; i < n; ++i){
			if(count == 0){
				element = arr[i];
				count++;
			}
			else if(arr[i] == element) count++;
			else count--;
		}

		int cnt = 0;
		for(int a : arr) if(a == element) cnt++;

		if(cnt > floor) return element;
		return -1; 
	}
}