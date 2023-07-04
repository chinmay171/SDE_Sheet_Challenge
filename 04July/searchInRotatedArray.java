public class searchInRotatedArray {
    public static int search(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(arr[mid] == target) return mid;
            if(arr[mid] >= arr[low]){
                // mtlb mid ke baad pivot idx
                if(target <= arr[mid] && target >= arr[low]) high = mid - 1;
                else low = mid + 1;
            }else{
                // mtlb mid se pehle pivot idx
                if(target <= arr[high] && target >= arr[mid]) low = mid + 1;
                else high = mid - 1;
            }
        }

        return -1;
    }
}