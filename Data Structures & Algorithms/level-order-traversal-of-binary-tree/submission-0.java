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
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        if(root ==null){
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
             List<Integer> currentLevel = new ArrayList<>(levelSize);
            for(int i = 0 ; i < levelSize ; i++){
                TreeNode Current = queue.poll();
                currentLevel.add(Current.val);
                if(Current.left != null){
                queue.offer(Current.left);
                }
                if(Current.right != null){
                queue.offer(Current.right);
                }
            }

            result.add(currentLevel);
        }

        return result;
        
    }
}
