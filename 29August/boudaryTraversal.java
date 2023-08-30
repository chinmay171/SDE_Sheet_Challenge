
import java.util.*;
//User function Template for Java

class Node  
{ 
    int data; 
    Node left, right; 
   
    public Node(int d)  
    { 
        data = d; 
        left = right = null; 
    } 
}

class Solution
{
    ArrayList<Integer> res = new ArrayList<>();
    
    public void leftBoundary(Node root){
        if(root == null) return;
        if(root.left == null && root.right == null) return;
        
        res.add(root.data);
        if(root.left != null) leftBoundary(root.left);
        else leftBoundary(root.right);
    }
    
    public void rightBoundary(Node root){
        if(root == null) return;
        if(root.left == null && root.right == null) return;
        
        if(root.right != null) rightBoundary(root.right);
        else rightBoundary(root.left);
        res.add(root.data);
    }
    
    public void dfs(Node root){
        if(root == null) return;
        
        if(root.left == null && root.right == null) res.add(root.data);
        
        dfs(root.left);
        dfs(root.right);
    }
    
	ArrayList <Integer> boundary(Node node)
	{
	    res.add(node.data);
	    leftBoundary(node.left);
	    dfs(node.left);
	    dfs(node.right);
	    rightBoundary(node.right);
	    
	    return res;
	}
}