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
        int count=0;
        ListNode temp=head;

        while(temp!=null){
            count++;
            temp=temp.next;
        }

        int front=count-n+1;
        if(front==1){
            return head.next;
        }

        count=0;
        temp=head;
        ListNode prev=null;

        while(temp!=null){
            count++;
            if(count==front){
                
                prev.next=temp.next;
            }
            prev=temp;
            temp=temp.next;
        }

        return head;
    }
}
