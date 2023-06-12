import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class reversePair 
{
    // public static int findInv(ArrayList<Integer> arr, int l1, int r1, int l2, int r2){
    //     int count = 0;
    //     int i = 0;
    //     int j = 0;

    //     while(i <= r1 && j <= r2){
    //         if(arr.get(i) <= 2*arr.get(j)) i++;
    //         else{
    //             count += (r1 - i + 1);
    //             j++;
    //         }
    //     }
    //     return count;
    // }
    // public static int findInv(ArrayList<Integer> nums, int l1, int r1, int l2, int r2){
    //     int i = l1; 
    //     int j = l2; 
    //     int invCount = 0;
    //     while(i <= r1 && j <= r2){
    //         if(nums.get(i) <= 2l*nums.get(j)){
    //             i++;
    //         }else{
    //             invCount += (r1-i+1);
    //             j++;
    //         }
    //     }
    //     return invCount;
    // }
    // public static int getCount(ArrayList<Integer> arr, int l1, int r1, int l2, int r2){
    //     ArrayList<Integer> temp = new ArrayList<>();
    //     int i = l1;
    //     int j = l2;
    //     int count = findInv(arr, l1, l2, r1, r2);

    //     while(i <= r1 && j <= r2){
    //         if(arr.get(i) <= arr.get(j)) temp.add(arr.get(i++));
    //         else temp.add(arr.get(j++));
    //     }

    //     while(i <= r1) temp.add(arr.get(i++));
    //     while(j <= r2) temp.add(arr.get(j++));
    //     for(int x = l1; x <= r2; ++x) arr.set(x, temp.get(x - l1));
    //     return count;
    // }
    static int merge(ArrayList<Integer> nums, int low, int mid, int high) {
        int cnt = 0;
        int j = mid + 1; 
        for(int i = low;i<=mid;i++) {
            while(j<=high && nums.get(i) > (2 * (long) nums.get(j))) {
                j++;
            }
            cnt += (j - (mid+1));
        }
        
        ArrayList<Integer> temp = new ArrayList<>(); 
        int left = low, right = mid+1; 
        while(left <= mid && right<=high) {
            if(nums.get(left) <=nums.get(right)) {
                temp.add(nums.get(left++)); 
            }
            else {
                temp.add(nums.get(right++)); 
            }
        }
        
        while(left<=mid) {
            temp.add(nums.get(left++)); 
        }
        while(right<=high) {
            temp.add(nums.get(right++)); 
        }
        
        for(int i = low; i<=high;i++) {
            nums.set(i, temp.get(i - low)); 
        }
        return cnt; 
    }
    public static int mergeSort(ArrayList<Integer> arr, int left, int right){
        if(left >= right) return 0;
        int mid = left + (right - left) / 2;
        int l = mergeSort(arr, left, mid);
        int r = mergeSort(arr, mid+1, right);
        // int m = getCount(arr, left, mid, mid+1, right);
        int m = merge(arr, left, mid, right);

        return (l + r + m);
    }
    public static int reversePairs(ArrayList<Integer> arr) 
    {
        return mergeSort(arr, 0, arr.size()-1);
    }
}