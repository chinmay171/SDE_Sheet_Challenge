import java.util.* ;
import java.io.*; 
public class allocatedBooks {
    public static boolean isPossible(int[] A, int students, long pages){
        int cnt = 0;
        long sumAllocated = 0;
        for (int i = 0; i < A.length; i++) {
            if (sumAllocated + (long)A[i] > pages) {
                cnt++;
                sumAllocated = (long)A[i];
                if (sumAllocated > pages) return false;
            } else sumAllocated += (long)A[i];
        }
        if (cnt < students) return true;
        return false;
    }
    public static long ayushGivesNinjatest(int n, int m, int[] time) {
        if(n > m) return -1;

        long low = Integer.MAX_VALUE;
        long high = 0;
        for(int t : time){
            low = Math.min(low, t);
            high += (long)t;
        }

        long res = -1;
        while(low <= high){
            long mid = (low + high) / 2;

            if(isPossible(time, n, mid)){
                res = mid;
                high = mid - 1;
            }else low = mid + 1;
        }

        return res;
    }
}