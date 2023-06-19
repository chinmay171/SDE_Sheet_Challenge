import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class findDuplicateInArray{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        // 1st approach
        // Collections.sort(arr);
        // for(int i = 0; i < n-1; ++i) if(arr.get(i) == arr.get(i+1)) return arr.get(i);
        // return 0;

        // 2nd approach
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n; ++i){
            if(set.contains(arr.get(i)) == true) return arr.get(i);
            set.add(arr.get(i));
        }
        return 0;
    }
}
