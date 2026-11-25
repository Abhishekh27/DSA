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
        // ListNode dummy = new Listnode(0);
        ListNode slow = head;
        ListNode fast = head;
        // ListNode second = dummy;
        int max = 0;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // slow = tail;
       
        // ListNode current = head;
        // ListNode secCur = slow.next;
       ListNode prev = null;
ListNode current = slow;
while (current != null) {
    ListNode next = current.next;
    current.next = prev;
    prev = current;
    current = next;
}
int sum = 0;
ListNode cur = head;
ListNode second = prev;

while(second != null){
    sum = second.val + cur.val;
    max = Math.max(sum,max);
    second = second.next;
    cur = cur.next;
}
return max;
    }
}