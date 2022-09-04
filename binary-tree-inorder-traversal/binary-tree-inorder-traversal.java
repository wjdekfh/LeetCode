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
    List<Integer> orderValue = new ArrayList();
    
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root != null) {
            inorderTree(root);
        }
        
        return orderValue;
    }
    
    public void inorderTree(TreeNode node) {
        if(node.left != null) {
            inorderTree(node.left);
        }
        
        orderValue.add(node.val);
        
        if(node.right != null) {
            inorderTree(node.right);
        }
    
    }
}