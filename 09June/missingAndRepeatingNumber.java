import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class missingAndRepeatingNumber {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        int[] dp = new int[n];
        for(int i = 0; i < n; ++i) dp[arr.get(i)-1]++;
        int missing = -1;
        int repeating = -1;
        for(int i = 0; i < n; ++i){
            if(dp[i] == 0) missing = i+1;
            else if(dp[i] > 1) repeating = i+1;
        }
        return new int[]{missing, repeating};
    }
}