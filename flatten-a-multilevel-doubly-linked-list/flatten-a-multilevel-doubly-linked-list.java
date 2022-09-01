/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Stack<Node> depth = new Stack();
        
        Node result = new Node();
        Node t = result;
        
        while(head != null) {
            Node target = head;
            
            if(target.child != null) {
                head = head.child;
                if(target.next != null) depth.push(target.next);
            }else if(target.next == null && depth.size() > 0) {
                head = depth.pop();
            }else {
                head = head.next;
            }
            
            target.child = null;
            t.next = target;
            target.prev = t;
            t = target;
        }
        
        if(result.next != null) {
            result.next.prev=null;
        }
        
        return result.next;
    }
}










