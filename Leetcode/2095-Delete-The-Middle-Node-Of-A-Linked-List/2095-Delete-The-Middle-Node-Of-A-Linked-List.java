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
        ListNode previous = head,
            slow = head,
            fast = head;

        if (head.next == null) {
            return null;
        }

        while (fast != null && fast.next != null) {
            previous = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        previous.next = slow.next;

        return head;
    }
}
