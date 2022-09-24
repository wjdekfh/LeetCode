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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<TreeNode> stack = new Stack();
        stack.push(p);
        stack.push(q);
        
        while(stack.size() > 0) {
            TreeNode a = stack.pop();
            TreeNode b = stack.pop();
            
            if(a != null && b != null) {
                if(a.val != b.val) {
                    return false;
                }
                
                stack.push(a.left);
                stack.push(b.left);
                stack.push(a.right);
                stack.push(b.right);
            } else if(a == null && b == null) {
                // pass
            } else {
                return false;
            }
        }

        return true;
    }
}