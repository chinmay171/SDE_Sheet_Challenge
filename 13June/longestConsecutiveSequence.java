import java.io.*;
import java.util.* ;

public class longestConsecutiveSequence {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        HashSet<Integer> set = new HashSet<>();
        for(int a : arr) set.add(a);
        int ans = 0;

        for(int a : arr){
            if(set.contains(a - 1) == false){
                int cVal = a;
                int cAns = 1;
                while(set.contains(cVal + 1) == true){
                    cVal++;
                    cAns++;
                }
                ans = Math.max(ans, cAns);
            }
        }
        return ans;
    }
}