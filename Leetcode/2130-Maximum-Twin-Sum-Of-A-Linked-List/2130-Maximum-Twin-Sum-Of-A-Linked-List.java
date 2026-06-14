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
    public int pairSum(ListNode head) {
        ListNode currNode = head;
        int listLength = 0;

        while (currNode != null) {
            listLength++;
            currNode = currNode.next;
        }

        int halfListLength = (int) (listLength / 2), i = 0;
        int[] twinSum = new int[halfListLength];

        currNode = head;

        while (i < halfListLength) {
            twinSum[i] = currNode.val;
            currNode = currNode.next;
            i++;
        }

        i = halfListLength - 1;

        while (currNode != null) {
            twinSum[i] += currNode.val;
            currNode = currNode.next;
            i--;
        }


        return Arrays.stream(twinSum).max().getAsInt();

    }
}
