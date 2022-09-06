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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return setNode(inorder, postorder);
    }
    
    public TreeNode setNode(int[] inorder, int[] postorder) {
        if(inorder.length == 0 || postorder.length == 0) return null;
        
        int nodeSize = inorder.length;
        int topVal = postorder[nodeSize-1];
        
        int centerIdx = -1;
        for(int i=0; i<nodeSize; i++) {
            if(inorder[i] == topVal) {
                centerIdx = i;
                break;
            }
        }
        
        TreeNode node = new TreeNode(topVal);
        
        node.left = centerIdx == 0 ? null : setNode(Arrays.copyOfRange(inorder, 0, centerIdx), 
                            Arrays.copyOfRange(postorder, 0, centerIdx));

        node.right = setNode(Arrays.copyOfRange(inorder, centerIdx+1, nodeSize), 
                            Arrays.copyOfRange(postorder, centerIdx, nodeSize-1));
        
        return node;
    }
    
}