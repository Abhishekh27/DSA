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
    public ListNode partition(ListNode head, int x) {

        ListNode lessDummy = new ListNode(0);
        ListNode gtrDummy = new ListNode(0);
        ListNode less = lessDummy;
        ListNode gtr = gtrDummy;
        if(head == null || head.next == null){
            return head;
        } 
        ListNode current = head;
        while(current != null){
            if(current.val < x){
                less.next = current;
                less= less.next;
            }
            else{
                gtr.next = current;
                gtr = gtr.next;
            }
            current = current.next;
        }
        gtr.next = null;
        less.next = gtrDummy.next;
        return lessDummy.next;

    }
}