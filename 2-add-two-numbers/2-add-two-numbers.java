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
        ListNode MasterNode = new ListNode(0);
        ListNode result = MasterNode;

        ListNode left = l1;
        ListNode right = l2;

        boolean isCarry = false;
        while(left != null || right != null || isCarry) {
            int leftValue = 0;
            int rightValue = 0;

            if(Objects.nonNull(left)) {
                leftValue = left.val;
                left = left.next;
            }

            if(Objects.nonNull(right)) {
                rightValue = right.val;
                right = right.next;
            }

            int sum = leftValue + rightValue + (isCarry ? 1:0);
            isCarry = false;

            if(sum >= 10) {
                isCarry = true;
                sum -= 10;
            }

            ListNode newNode = new ListNode(sum);
            result.next = newNode;
            result = newNode;
        }

        return MasterNode.next;
    }
}