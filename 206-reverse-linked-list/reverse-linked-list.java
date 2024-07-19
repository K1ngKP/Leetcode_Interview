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
    public ListNode reverseList(ListNode head) {
        return reverse(head, null);
    }

    public ListNode reverse(ListNode head, ListNode temp)
    {
        if(head==null)
        return temp;

        ListNode temp_next = head.next;
        head.next = temp;
        temp = head;
        head = temp_next;
        return reverse(head, temp);
    }
}