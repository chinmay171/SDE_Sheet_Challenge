import java.util.*;
//  * Definition for a binary tree node.
   class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
//  */
class Solution {
    List<Integer> ans;
    public void helper(TreeNode root){
        if(root == null) return;
        helper(root.left);
        ans.add(root.val);
        helper(root.right);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        ans = new ArrayList<>();
        helper(root);
        return ans;
    }
}