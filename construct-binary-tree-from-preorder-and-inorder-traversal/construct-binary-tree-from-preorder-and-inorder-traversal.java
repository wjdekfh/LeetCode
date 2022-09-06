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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return setNode(preorder, inorder);
    }
    
    public TreeNode setNode(int[] preorder, int[] inorder) {
        if(preorder.length == 0 || inorder.length == 0) return null;
        
        int nodeSize = inorder.length;
        int topVal = preorder[0];
        
        int centerIdx = -1;
        for(int i=0; i<nodeSize; i++) {
            if(inorder[i] == topVal) {
                centerIdx = i;
                break;
            }
        }
        
        TreeNode node = new TreeNode(topVal);
        
        int[] leftPre = Arrays.copyOfRange(preorder, 1, centerIdx+1);
        int[] leftInor = Arrays.copyOfRange(inorder, 0, centerIdx);
        
        // System.out.println(Arrays.toString(leftPre));
        // System.out.println(Arrays.toString(leftInor));
        
        node.left = setNode(leftPre, leftInor);
        
        int[] rightPre = Arrays.copyOfRange(preorder, centerIdx+1, nodeSize);
        int[] rightInor = Arrays.copyOfRange(inorder, centerIdx+1, nodeSize);
       
        // System.out.println(Arrays.toString(rightPre));
        // System.out.println(Arrays.toString(rightInor));
        
        node.right = setNode(rightPre, rightInor);
        
        return node;
    }
}