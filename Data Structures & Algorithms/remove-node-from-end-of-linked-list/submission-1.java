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
           if(head == null) return null;

        int length = 1 ;
        ListNode Last = head;

        while (Last.next != null){
            Last = Last.next ;
            length++ ;
        }

        if(n == length){
            return head.next;
        }

        ListNode prev = head ;

        for(int i = 0 ; i < length - n - 1 ; i++){
            prev = prev.next ;
        }

        prev.next = prev.next.next ;
        
        return head ;
        
    }
}
