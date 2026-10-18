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
    public ListNode sortList(ListNode head) {
        // Base case: empty list or one node
        if (head == null || head.next == null) {
            return head;
        }
        // 1. Find the middle
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // 2. Split into two halves
        ListNode second = slow.next;
        slow.next = null;
        // 3. Recursively sort both halves
        ListNode left = sortList(head);
        ListNode right = sortList(second);
        // 4. Merge the sorted halves
        return merge(left, right);
    }
    private ListNode merge(ListNode left, ListNode right) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while (left != null && right != null) {
            if (left.val <= right.val) {
                current.next = left;
                left = left.next;
            } else {
                current.next = right;
                right = right.next;
            }
            current = current.next;
        }
        // Attach any remaining nodes
        if (left != null) {
            current.next = left;
        } else {
            current.next = right;
        }
        return dummy.next;
    }
}
