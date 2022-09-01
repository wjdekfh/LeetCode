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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return head;
        
        List<ListNode> nodeList = new ArrayList();
    
        while (head != null){
            nodeList.add(head);
            head = head.next;
        }
        
        int nodeSize = nodeList.size();
        k = k % nodeSize;
        if(k == 0) return nodeList.get(0);
        
        ListNode reHead = nodeList.get(nodeSize-k); // 새로운 head

        nodeList.get(nodeSize-1).next = nodeList.get(0); // 종료지점과 새로운 head를 연결
        nodeList.get(nodeSize-k-1).next = null; // 새로운 head 앞부분 next를 끊는다.

    return reHead;
    }
  
}