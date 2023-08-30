/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int ans;
    void rec(TreeNode* root, int curr){
        if(root == NULL) return;
        ans = max(ans, curr);
        if(root->left != NULL) rec(root->left, curr+1);
        if(root->right != NULL) rec(root->right, curr+1);
    }
    int maxDepth(TreeNode* root) {
        ans = 0;
        rec(root, 1);
        return ans;
    }
};