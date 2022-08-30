/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        boolean output = false;
        
        if(head == null) return output;
        
        List<ListNode> list = new ArrayList();
        list.add(head);
        
        ListNode nextNode = head;
        while((nextNode = nextNode.next) != null) {       
            if(list.contains(nextNode)) {
                output = true;
                break;
            }else {
                list.add(nextNode);
            }
        } 
        
        return output;
    }
}