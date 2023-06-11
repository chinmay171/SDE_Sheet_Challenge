import java.io.*;
import java.util.* ;

public class modularExponantiation {
    public static long helper(long x, long n, int m){
        if(n == 0) return 1l;

        long curr = helper(x, n/2, m);
        if(n % 2 == 0) return curr*curr % m;
        else return curr*curr*x % m;
    }
    public static int modularExponentiation(int x, int n, int m) {
        return (int)helper((long)x, (long)n, m);
    }
}