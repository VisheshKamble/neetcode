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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return null;
        }

        ListNode temp = head ;
        ListNode prev = new ListNode(0);

        for(int i = 0 ; i < n ; i++){
            prev = temp;
            temp = temp.next;
        }

        prev.next = temp.next;

        return head;


    }
}
