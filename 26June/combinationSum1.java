import java.util.*;
public class combinationSum1 {
    public static ArrayList<ArrayList<Integer>> ans;
    public static void helper(int idx, int sum, ArrayList<Integer> arr, ArrayList<Integer> curr, int target){
        if(idx == arr.size()){
            if(sum == target) ans.add(new ArrayList<>(curr));
            return;
        }

        // yes
        curr.add(arr.get(idx));
        helper(idx + 1, sum + arr.get(idx), arr, curr, target);
        curr.remove(curr.size() - 1);
        // no
        helper(idx + 1, sum, arr, curr, target);
    }
    public static ArrayList<ArrayList<Integer>> findSubsetsThatSumToK(ArrayList<Integer> arr, int n, int k) {
        ans = new ArrayList<>();
        helper(0, 0, arr, new ArrayList<Integer>(), k);
        return ans;
    }
}