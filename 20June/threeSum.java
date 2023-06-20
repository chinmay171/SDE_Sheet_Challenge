import java.util.* ;
import java.io.*; 
public class threeSum {

	public static ArrayList<ArrayList<Integer>> findDuets(int[] arr, int left, int right, int target){
		ArrayList<ArrayList<Integer>> dual = new ArrayList<>();

		while(left < right){
			int curr = arr[left] + arr[right];

			if(target == curr){
				ArrayList<Integer> c = new ArrayList<>();
				c.add(arr[left]);
				c.add(arr[right]);
				dual.add(c);
				
				while(left < right && arr[left] == arr[left+1]) left++;
				while(left < right && arr[right] == arr[right-1]) right--;
				left++;
				right--;
			}else if(target < curr) right--;
			else left++;
		}

		return dual;
	}

	public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int K)  {
		Arrays.sort(arr);
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		for(int i = 0; i < n; ++i){
			if(i > 0 && arr[i] == arr[i-1]) continue;
			ArrayList<ArrayList<Integer>> twoSumList = findDuets(arr, i+1, n-1, K-arr[i]);
			for(ArrayList<Integer> a : twoSumList){
				ArrayList<Integer> temp = new ArrayList<>();
				temp.add(arr[i]);
				temp.add(a.get(0));
				temp.add(a.get(1));
				ans.add(temp);
			}
		}

		return ans;
	}
}
