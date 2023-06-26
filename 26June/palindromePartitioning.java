import java.util.* ;
import java.io.*; 
public class palindromePartitioning {
    public static List<List<String>> ans;

    public static boolean isPalindrome(String s, int i, int j){
        while(i <= j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void helper(int i, String s, ArrayList<String> curr){
        if(i == s.length()){
            ans.add(new ArrayList<>(curr));
            return;
        }
        
        for(int partition = i; partition < s.length(); ++partition){
            if(isPalindrome(s, i, partition) == true){
                curr.add(s.substring(i, partition + 1));
                helper(partition + 1, s, curr);
                curr.remove(curr.size() - 1);
            }
        }

    }
    public static List<List<String>> partition(String s) {
        ans = new ArrayList<>();
        helper(0, s, new ArrayList<>());
        return ans;
    }
}