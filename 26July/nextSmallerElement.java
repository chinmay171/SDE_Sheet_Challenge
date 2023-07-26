import java.util.*;
import java.io.*;

public class nextSmallerElement{
    static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n){
        // ArrayList<Integer> ans = new ArrayList<>();
        // for(int i = 0; i < n; i++){
        //     int j = i+1;
        //     while(j < n){
        //         if(arr.get(i) > arr.get(j)){
        //             ans.add(arr.get(j));
        //             break;
        //         }
        //         j++;
        //     }
        //     if(j == n) ans.add(-1);
        // }
        // return ans;
        Stack<Integer> stk = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = n-1; i >= 0; i--){
            if(stk.size() > 0){
                while(stk.size() > 0 && stk.peek() >= arr.get(i))
                    stk.pop();
                if(stk.size() == 0) ans.add(0, -1);
                else ans.add(0, stk.peek());
            }else ans.add(0, -1);
            stk.push(arr.get(i));
        }
        return ans;
    }
}