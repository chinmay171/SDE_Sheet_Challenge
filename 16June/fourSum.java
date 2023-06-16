import java.io.*;
import java.util.* ;

public class fourSum {
  public static String fourSum(int[] arr, int target, int n) {
      // for(int i = 0; i < n; ++i){
      //   for(int j = i+1; j < n; ++j){
      //     HashSet<Integer> set = new HashSet<>();
      //     for(int k = j+1; k < n; ++k){
      //       if(set.contains(target - (arr[i] + arr[j] + arr[k]))){
      //         return "Yes";
      //       }
      //       set.add(arr[k]);
      //     }
      //   }
      // }

      // return "No";
      Arrays.sort(arr);
      int i = 0;
      while(i < n-3){
        if(i > 0 && arr[i] == arr[i-1]){
          i++;
          continue;
        }
        int j = i + 1;
        while(j < n-2){
          if(j > i+1 && arr[j] == arr[j-1]){
            j++;
            continue;
          }
          int twoSum = arr[i] + arr[j];
          int left = j+1;
          int right = n-1;
          while(left < right){
            int fourS = twoSum + arr[left] + arr[right];
            if(target == fourS) return "Yes";
            else if(target < fourS) right--;
            else left++;
          }
          j++;
        }
        i++;
      }
      return "No";
  }
}
