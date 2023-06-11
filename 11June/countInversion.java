import java.util.* ;
import java.io.*; 
public class countInversion {
    public static long getCount(long[] arr, int left1, int right1, int left2, int right2){
        int size = (right1 - left1 + 1) + (right2 - left2 + 1);
        long[] res = new long[size];

        long count = 0;
        int i = left1;
        int j = left2;
        int k = 0;
        while(i <= right1 && j <= right2){
            if(arr[i] <= arr[j]){
                res[k] = arr[i];
                i++;
                k++;
            }else{
                count += (right1 - i + 1);
                res[k] = arr[j];
                j++;
                k++;
            }
        }
        while(i <= right1) res[k++] = arr[i++];
        while(j <= right2) res[k++] = arr[j++];
        for(int x = left1; x <= right2; ++x) arr[x] = res[x - left1];
        return count;
    }

    public static long mergeSort(long[] arr, int left, int right){
        if(left >= right) return 0;
        int mid = left + (right - left) / 2;
        long x = mergeSort(arr, left, mid);
        long y = mergeSort(arr, mid+1, right);
        long z = getCount(arr, left, mid, mid+1, right);
        return (x + y + z);
    }
    public static long getInversions(long arr[], int n) {
        // long ans = 0;
        // for(int i = 0; i < n; ++i)
        //     for(int j = i; j >= 0; --j)
        //         if(arr[i] < arr[j]) ans++;
        // return ans;

        return mergeSort(arr, 0, n-1);
    }
}