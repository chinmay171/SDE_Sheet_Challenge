import java.util.* ;
import java.io.*; 
public class trappingRainwater {
    public static long getTrappedWater(long[] arr, int n) {
        long[] pref = new long[n];
        long[] suff = new long[n];

        pref[0] = arr[0];
        suff[n-1] = arr[n-1];
        for(int i = 1; i < n; ++i) pref[i] = Math.max(pref[i-1], arr[i]);
        for(int i = n-2; i >= 0; --i) suff[i] = Math.max(suff[i+1], arr[i]);

        long[] finalArr = new long[n];
        for(int i = 0; i < n; ++i) finalArr[i] = Math.min(pref[i], suff[i]);

        long ans = 0;
        for(int i = 0; i < n; ++i) ans += (finalArr[i] - arr[i]);

        return ans;
    }
}
