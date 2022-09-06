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
        return depth(root, 0);
    }
    
    public int depth(TreeNode root, int depth) {
        if(root == null) return depth;
        
        depth = Math.max(depth(root.left, depth), depth(root.right, depth)) + 1;
        
        return depth;
    }
}