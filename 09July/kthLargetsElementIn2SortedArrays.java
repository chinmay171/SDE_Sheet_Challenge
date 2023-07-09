public class kthLargetsElementIn2SortedArrays {
    public static int ninjaAndLadoos(int arr1[], int arr2[], int n, int m, int k) {
        
        // int i = 0;
        // int j = 0;
        
        // int k1 = 0;
        // while(i < n && j < m){
        //     if(arr1[i] == arr2[j]){
        //         k1 += 2;
        //         i++;
        //         j++;
        //         if(k1 >= k) return arr1[i-1];
        //     }else if(arr1[i] < arr2[j]){
        //         k1++;
        //         i++;
        //         if(k1 == k) return arr1[i-1];
        //     }else{
        //         k1++;
        //         j++;
        //         if(k1 == k) return arr2[j-1];
        //     }
        // }
        
        // while(i < n){
        //     i++;
        //     k1++;
        //     if(k1 == k) return arr1[i-1];
        // }
        // while(j < m){
        //     j++;
        //     k1++;
        //     if(k1 == k) return arr2[j-1];
        // }
        // return 1;

        if(n > m)
            return ninjaAndLadoos(arr2, arr1, m, n, k);

        int low = Math.max(0, k-n);
        int high = Math.min(k, m);

        while(low <= high){
            int mid = (low + high) / 2;
            int mid2 = k - mid;
            int l1 = (mid == 0) ? Integer.MIN_VALUE : arr1[mid-1]; 
            int l2 = (mid2 == 0) ? Integer.MIN_VALUE : arr2[mid2-1];
            int r1 = (mid == m) ? Integer.MAX_VALUE : arr1[mid]; 
            int r2 = (mid2 == n) ? Integer.MAX_VALUE : arr2[mid2];

            if(l1 <= r2 && l2 <= r1){
                return Math.max(l1, l2);
            }else if(l1 > r2){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return 1;
    }
}
