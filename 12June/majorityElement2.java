import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class majorityElement2 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        // HashMap<Integer, Integer> map = new HashMap<>();
        // ArrayList<Integer> ans = new ArrayList<>();
        // for(int i = 0; i < arr.size(); ++i)
        //     map.put(arr.get(i), map.getOrDefault(arr.get(i), 0) + 1);    
        // for(int key : map.keySet()) if(map.get(key) > floor) ans.add(key);
        // return ans;
        
        int e1 = -1, e2 = -1;
        int c1 = 0, c2 = 0;
        int n = arr.size();

        for(int i = 0; i < n; ++i){
            if(c1 == 0 && e2 != arr.get(i)){
                e1 = arr.get(i);
                c1 = 1;
            }else if(c2 == 0 && e1 != arr.get(i)){
                e2 = arr.get(i);
                c2 = 1;
            }else if(arr.get(i) == e1) c1++;
            else if(arr.get(i) == e2) c2++;
            else{
                c1--; c2--;
            }
        }

        c1 = 0; c2 = 0;
        for(int i = 0; i < n; ++i){
            if(arr.get(i) == e1) c1++;
            else if(arr.get(i) == e2) c2++;
        }
        int floor = (int)(n/3) + 1;
        ArrayList<Integer> ans = new ArrayList<>();
        if(c1 >= floor) ans.add(e1);
        if(c2 >= floor) ans.add(e2);
        return ans;
    }
}