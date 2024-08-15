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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null)
        return null;
        ListNode fast = head;
        ListNode slow = head;
        ListNode dummy = head;

        while(fast!=null && fast.next!=null )
        {
            dummy = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        dummy.next = dummy.next.next;
        slow.next = null;
        return head;
    }
}