import java.util.ArrayList;
import java.util.*;
public class combinationSum2 {
    public static ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    public static void helper(int idx, ArrayList<Integer> arr, ArrayList<Integer> curr, int k){
        if(k == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i = idx; i < arr.size(); ++i){
            if(i > idx && arr.get(i) == arr.get(i-1)) continue;
            if(arr.get(i) > k) break;
            curr.add(arr.get(i));
            helper(i + 1, arr, curr, k - arr.get(i));
            curr.remove(curr.size() - 1); 
        }
    }
    public static ArrayList<ArrayList<Integer>> combinationSum2(ArrayList<Integer> arr, int n, int target){
        Collections.sort(arr);
        ans = new ArrayList<>();
        helper(0, arr, new ArrayList<>(), target);
        return ans;
    }
}