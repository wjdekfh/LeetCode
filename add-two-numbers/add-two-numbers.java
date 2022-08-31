/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode first = l1;
        ListNode second = l2;
        
        ListNode nextNode = result;
        int carry = 0;
        while(first != null || second != null || carry > 0) {
            int a = first != null ? first.val : 0;
            int b = second != null ? second.val : 0;
            
            int sum = a+b+carry;
            carry = 0;
            
            if(sum >= 10) {
                sum -= 10;
                carry = 1;
            }
            
            first = first != null ? first.next : null;
            second = second != null ? second.next : null;
            
            nextNode.next = new ListNode(sum);
            nextNode = nextNode.next;
        }
        
        return result.next;
    }
}