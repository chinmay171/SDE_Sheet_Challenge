import java.util.ArrayList;
public class singleElementInSortedList{
    public static int singleNonDuplicate(ArrayList<Integer> nums){
        int low = 0;
        int high = nums.size() - 2;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            if (mid % 2 == 0) {
                if (nums.get(mid) != nums.get(mid + 1)) high = mid - 1; 
                else low = mid + 1; 
            } else {
                if (nums.get(mid) == nums.get(mid + 1)) high = mid - 1; 
                else low = mid + 1; 
            }
        }
        return nums.get(low);
    }
}