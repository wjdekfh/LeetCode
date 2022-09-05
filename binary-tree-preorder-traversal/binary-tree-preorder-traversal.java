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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> values = new ArrayList();
        
        if(root !=null) traversal(root, values);
        
        return values;
    }
    
    public void traversal(TreeNode node, List<Integer> values) {
        values.add(node.val);
        
        if(node.left != null) {
            traversal(node.left, values);
        }
    
        if(node.right != null) {
            traversal(node.right, values);
        }
    }
}