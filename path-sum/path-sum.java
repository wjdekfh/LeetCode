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
    private boolean isSearch = false;
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // Top-Down
        search(root, 0, targetSum);
        
        return isSearch;
    }
    
    public void search(TreeNode root, int sum, int target) {
        if(root == null) {
            return;    
        }
        
        sum += root.val;
        
        if(root.left == null && root.right == null && sum == target) {
            isSearch = true;
            return;
        }else {
            search(root.left, sum, target);
            search(root.right, sum, target);
        }
    }
}