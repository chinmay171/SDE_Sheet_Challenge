import java.util.ArrayList;
public class searchIn2dMatrix {

    // public static boolean binarySearch(ArrayList<Integer> mat, int target){
    //     int left = 0;
    //     int right = mat.size()-1;

    //     while(left <= right){
    //         int mid = left + (right - left) / 2;

    //         if(mat.get(mid) == target) return true;
    //         else if(mat.get(mid) < target) left = mid + 1;
    //         else right = mid - 1;
    //     }
        
    //     return false;
    // }
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        int r = mat.size();
        int c = mat.get(0).size();

        if(target < mat.get(0).get(0)) return false;
        if(target > mat.get(r-1).get(c-1)) return false;

        // int i = 0;
        // while(i < r && target >= mat.get(i).get(0)) i++;
        // return binarySearch(mat.get(i-1), target);

        int low = 0;
        int high = r*c - 1;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(mat.get(mid/c).get(mid%c) == target) return true;
            else if(mat.get(mid/c).get(mid%c) < target) low = mid+1;
            else high = mid-1;
        }
        
        return false;
    }
}
