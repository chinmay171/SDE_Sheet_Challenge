import java.util.* ;
import java.io.*; 
public class printPermutations {
    // public static void helper(int idx, String s, String curr, List<String> ans){
    //     if(idx == s.length()){
    //         ans.add(curr);
    //         return;
    //     }

    //     for(int i = 0; i < s.length(); ++i){
    //         if(curr.indexOf(s.charAt(i)) != -1) continue;
    //         // curr += s.charAt(i);
    //         String temp = curr + s.charAt(i);
    //         helper(idx+1, s, temp, ans);
    //         // curr.substring(0, curr.length() - 1);
    //     }
    // }
    public static void helper(String s, String curr, List<String> ans){
        if(s.length() == 0){
            ans.add(curr);
            return;
        }

        for(int i = 0; i < s.length(); ++i){
            char ch = s.charAt(i);
            String left = s.substring(0, i);
            String right = s.substring(i+1);
            helper(left + right, ch + curr, ans);
        }
    }
    public static List<String> findPermutations(String s) {
        List<String> ans = new ArrayList<>();
        // helper(0, s, "", ans);
        // return  ans;
        helper(s, "", ans);
        return ans;
    }
}