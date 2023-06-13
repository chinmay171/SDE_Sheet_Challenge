import java.io.*;
import java.util.* ;

public class pairSum{
    public static List<int[]> pairSum(int[] arr, int s) {
        List<int[]> ans = new ArrayList<>();

        // HashMap wali galat h 
        // HashMap<Integer , Integer> map = new HashMap<>();
        // for(int a : arr) map.put(a, map.getOrDefault(a, 0) + 1);
        // for(int a : arr){
        //     int rem = s - a;
        //     if(map.containsKey(rem) == true){
        //         int n = map.get(rem);
        //         while(n-- > 0)
        //             ans.add(new int[]{a, rem});
        //         map.remove(rem);
        //     }
        // }

        // correct one
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;

        while(i < j){
            int currSum = arr[i] + arr[j];
            if(currSum == s){
                int cntSmall = 1;
                int cntLarge = 1;
                while(i < j && arr[i] == arr[i+1]){
                    i++; cntSmall++;
                }
                while(i < j && arr[j] == arr[j-1]){
                    j--; cntLarge++;
                }
                int totalPairs = cntSmall * cntLarge;
                while(totalPairs-- > 0) ans.add(new int[]{arr[i], arr[j]});
                i++; j--;
            }else if(currSum < s) i++;
            else j--;
        }

        return ans;
    }
}
