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
    public boolean isSymmetric(TreeNode root) {
        boolean isMirror = true;
        
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root.left);
        queue.add(root.right);
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            int[] vals = new int[size];
            
            for(int i=0; i<size; i++) {
                TreeNode node = queue.poll();
                vals[i] = node == null ? -999 : node.val;
                
                if(node != null) {
                    queue.add(node.left);
                    queue.add(node.right);
                }
            }

            if(vals.length % 2 == 0) {
                for(int i=0; i<size/2; i++) {
                    System.out.println(Arrays.toString(vals));
                    if(vals[i] != vals[(size-1)-i]) {
                        isMirror = false;
                        break;
                    }
                }
            }else {
                isMirror = false;
                break;
            }
        }
        
        
        return isMirror;
    }
}