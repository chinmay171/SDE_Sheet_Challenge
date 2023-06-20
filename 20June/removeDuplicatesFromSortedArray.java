import java.util.*;

public class removeDuplicatesFromSortedArray {
	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		int i = 0;
		int j = 0;
		while(j < n && arr.get(i) == arr.get(j)){
			j++;
		}
		if(j == n) return 1;
		while(j < n){
			if(j < n-1 && arr.get(j) == arr.get(j+1)){
				j++;
				continue;
			}
			Collections.swap(arr, i+1, j);
			i++;
			j++;
		}

		return i+1;
	}
}