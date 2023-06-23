import java.util.* ;
import java.io.*; 
public class uniqueSubset {
    public static ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    public static void rec(int idx, int[] arr, ArrayList<Integer> curr){
        ans.add(new ArrayList<>(curr));
        for(int i = idx; i < arr.length; ++i){
            if(i != idx && arr[i] == arr[i-1]) continue;
            curr.add(arr[i]);
            rec(i+1, arr, curr);
            curr.remove(curr.size() - 1);
        }
    }
    public static ArrayList<ArrayList<Integer>> uniqueSubsets(int n, int arr[]) {
        Arrays.sort(arr);
        ans = new ArrayList<>();
        rec(0, arr, new ArrayList<>());
        return ans;
    }

}