/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Queue<Node> queue = new LinkedList();
        queue.add(root);
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            
            Node node = queue.poll();
            if(node != null) queue.add(node.left);
            if(node != null) queue.add(node.right);
            
            for(int i=0; i<size-1; i++) {
                Node nextNode = queue.poll();
                if(nextNode != null) {
                    queue.add(nextNode.left);
                    queue.add(nextNode.right);
                    
                    
                    if(node != null) node.next = nextNode;
                    node = nextNode;
                }
            }

            if(node != null) node.next = null;
        }
        
        return root;
    }
}