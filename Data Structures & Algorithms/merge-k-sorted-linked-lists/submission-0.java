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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq= new PriorityQueue<>((a,b)->a.val-b.val);

        for(ListNode head:lists){
            ListNode temp=head;
            while(temp!=null){
                pq.offer(temp);
                temp=temp.next;
            }
        }
        ListNode head2= pq.poll();
        ListNode temp2=head2;

        while(!pq.isEmpty()){
            temp2.next=pq.poll();
            temp2=temp2.next;
        }

        return head2;
    }
}
