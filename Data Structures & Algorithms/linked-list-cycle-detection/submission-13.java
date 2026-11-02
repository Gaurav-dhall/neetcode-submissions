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
    public boolean hasCycle(ListNode head) {
        ListNode temp = head;
        if(temp==null||temp.next==null){
            return false;
        }
        ListNode prev = null;

        while (temp != null) {
            if(temp.next==null){
                return false;
            }
            if (temp == prev ) {
                return true;
            }
            if(temp.next!=null)temp = temp.next.next;
            if(prev==null){ 
                prev=head;
            }
           else{ prev = prev.next;}
        }

        return false;
    }
}
