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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode main = new ListNode(0);

        ListNode appendNode = main;
        ListNode left = list1;
        ListNode right = list2;

        while(left != null || right !=null) {
            if(Objects.nonNull(left) && Objects.nonNull(right)) {
                if(left.val == right.val) {
                    appendNode.next = left;
                    left = left.next;
                    appendNode.next.next = right;
                    appendNode = right;
                    right = right.next;
                }else if(left.val > right.val) {
                    appendNode.next = right;
                    appendNode = right;
                    right = right.next;
                }else {
                    appendNode.next = left;
                    appendNode = left;
                    left = left.next;
                }
            }else {
                if(Objects.nonNull(left)) {
                    appendNode.next = left;
                    appendNode = left;
                    left = left.next;
                }else {
                    appendNode.next = right;
                    appendNode = right;
                    right = right.next;
                }
            }
        }

        return main.next;
    }
}