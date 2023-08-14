class Solution {
    // 111221
    // 
    public String countAndSay(int n) {
        String ans = "1";
        for(int i = 1; i < n; ++i){
            String curr = "";
            for(int j = 0; j < ans.length(); ++j){
                char ch = ans.charAt(j);
                int freq = 1;
                while(j < ans.length()-1 && ch == ans.charAt(j+1)){
                    freq++;
                    j++;
                }
                curr += freq + "" + ch;
            }
            ans = curr;
        }
        return ans;
    }
}