public class NthRootOfM {
    public static int NthRoot(int n, int m) {
        int low = 1;
        int high = m;

        while(low <= high){
            int mid = (low + high) / 2;
            int temp = (int)Math.pow(mid, n);

            if(temp == m) return mid;
            else if(temp > m) high = mid - 1;
            else low = mid + 1;
        }

        return -1;
    }
}
