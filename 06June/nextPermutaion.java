import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class nextPermutaion
{
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> arr) 
	{
		if(arr.size() <= 1) return arr;
		int idx = -1;
		for(int i = arr.size()-1 ; i > 0; --i)
			if(arr.get(i-1) < arr.get(i)){
				idx = i-1;
				break;
			}
		
		if(idx == -1){
			Collections.sort(arr);
			return arr;
		}

		ArrayList<Integer> ans = new ArrayList<>();
		for(int i = 0; i < idx; ++i) ans.add(arr.get(i));
		for(int i = arr.size()-1; i > idx; --i)
			if(arr.get(i) > arr.get(idx)){
				ans.add(arr.get(i));
				arr.remove(i);
				break;
			}

		for(int i = 0; i < idx; ++i) arr.remove(0);
		Collections.sort(arr);
		for(int i = 0; i < arr.size(); ++i) ans.add(arr.get(i));

		return ans;
	}
}
