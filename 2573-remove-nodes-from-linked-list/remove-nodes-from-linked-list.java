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
    public ListNode removeNodes(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode temp = head;

        while(temp!=null)
        {
            
            while(!st.isEmpty() && temp.val > st.peek())
            {
                st.pop();
            }
            if(st.isEmpty() || st.peek()>=temp.val)
            st.push(temp.val);
            temp = temp.next;
        }
        System.out.print(st);

        ListNode curr = null;
        ListNode prev= null;

        while(!st.isEmpty())
        {
            int curr_val = st.pop();
            curr = new ListNode(curr_val);
            curr.next = prev;
            prev = curr;

        }

        return curr;

    }
}