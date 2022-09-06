/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
/*
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null) return "";
        
        List<String> list = new ArrayList();
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        
        while(!queue.isEmpty()) {
            int size = queue.size();

            TreeNode[] t = new TreeNode[size*2];
            boolean create = false;
            for(int i=0; i<size*2; i+=2) {
                TreeNode node = queue.poll();
                if(node != null) {
                    list.add(node.val+"");
                    
                    if(node.left != null || node.right != null) create = true;
                    
                    t[i] = node.left;
                    t[i+1] = node.right;   
                }else {
                    list.add("null");
                }
            }
            
            if(create) {
                for(TreeNode n : t) {
                    queue.add(n);
                }
            }
        }
        
        return String.join(",", list);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.length() <= 0) return null;
        
        String[] nodes = data.split(",");
        System.out.println(Arrays.toString(nodes));
        
        TreeNode mainNode = new TreeNode(Integer.parseInt(nodes[0]));
        
        Queue<TreeNode> queue = new LinkedList();
        queue.add(mainNode);
        
        int nodeIdx = 1;
        while(!queue.isEmpty()) {
            if(nodeIdx == nodes.length) break;
            
            // System.out.println(queue);
            
            int size = queue.size();
            
            for(int i=0; i<size; i++) {
                TreeNode node = queue.poll();
                String left = nodes[nodeIdx++];
                String right = nodes[nodeIdx++];

                TreeNode leftNode = left.equals("null") ? null : 
                                        new TreeNode(Integer.parseInt(left));
                TreeNode rightNode = right.equals("null") ? null : 
                                        new TreeNode(Integer.parseInt(right));

                if(node != null) {
                    node.left = leftNode;
                    node.right = rightNode;    
                }

                queue.add(leftNode);
                queue.add(rightNode);    
            }
        }
        
        return mainNode;
    }
    */
    
    public String serialize(TreeNode root) {
        if(root == null) return "";
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        StringBuilder sb = new StringBuilder();
        while(!q.isEmpty()){
            TreeNode t = q.poll();
            if(t == null){
                sb.append("n ");
                continue;
            }
            sb.append(t.val + " ");
            q.add(t.left);
            q.add(t.right);
        }
        return sb.toString();
    }
    
    public TreeNode deserialize(String data) {
        if(data == "") return null;
        Queue<TreeNode> q = new LinkedList<>();
        String []arr= data.split(" ");
        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        q.add(root);
        for(int i = 1; i < arr.length; i++){
            TreeNode par = q.poll();
            if(!arr[i].equals("n")){
                TreeNode l = new TreeNode(Integer.parseInt(arr[i]));
                par.left = l;
                q.add(l);
            }
            if(!arr[++i].equals("n")){
                TreeNode r = new TreeNode(Integer.parseInt(arr[i]));
                par.right = r;
                q.add(r);
            }
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));