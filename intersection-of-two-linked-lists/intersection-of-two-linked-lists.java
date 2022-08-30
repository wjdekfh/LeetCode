/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        
        while(a != b) {
            if(a.next == null && b.next == null) break;
            
            a = (a.next != null) ? a.next : headB;
            b = (b.next != null) ? b.next : headA;
        }
        
        if(a == b) {
            return a;
        }else {
            return null;
        }
    }
}