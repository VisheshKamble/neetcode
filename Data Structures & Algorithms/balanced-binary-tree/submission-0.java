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
    public boolean isBalanced(TreeNode root) {
        return balancedHelper(root);
    }

   boolean balancedHelper(TreeNode node){
    if(node == null){
        return true ;
    }
    return Math.abs(height(node.left) - height(node.right)) <= 1 && balancedHelper(node.left) && balancedHelper(node.right);
   }

   public int height(TreeNode node){
    if(node == null){
        return 0;
    }

    int left = height(node.left);
    int right = height(node.right);

    return Math.max(left , right) + 1 ;
   }
}