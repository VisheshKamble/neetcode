/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int maxDepth(TreeNode root) {
        return helper(root , 0);
        
    }

    int helper(TreeNode node , int count){
        if(node == null){
            return count;
        }
        
        int left = helper(node.left , count + 1);
        int right = helper(node.right , count + 1);
    
        return Math.max(left , right);

    }
}
