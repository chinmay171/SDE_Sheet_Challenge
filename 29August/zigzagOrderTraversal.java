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
    vector<vector<int>> zigzagLevelOrder(TreeNode* root) {
        queue<TreeNode*> q;
        vector<vector<int> > ans;
        if(root == NULL) return ans;
        q.push(root);
        bool fromR = false;

        while(q.size() > 0){
            vector<int> curr;
            for(int i = q.size(); i > 0; --i){
                TreeNode* front = q.front();
                q.pop();
                curr.push_back(front->val);
                if(front->left != NULL) q.push(front->left);
                if(front->right != NULL) q.push(front->right); 
            }
            if(fromR){
                reverse(curr.begin(), curr.end());
                ans.push_back(curr);
            }else ans.push_back(curr);

            if(fromR == false) fromR = true;
            else fromR = false;
        } 

        return ans;
    }
};