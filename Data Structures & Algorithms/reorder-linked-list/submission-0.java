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
    public void reorderList(ListNode head) {
        Stack<ListNode> st= new Stack<>();

        ListNode temp=head;

        while(temp!=null){
            st.push(temp);
            temp=temp.next;
        }

        ListNode temp2=head;
        while(temp2!=st.peek()){
            if(temp2.next==st.peek()){
                break;
            }
            ListNode nextEl=temp2.next;
            temp2.next=st.peek();
            temp2.next.next=nextEl;
            st.pop();
            st.peek().next=null;
            temp2=temp2.next.next;
        }

        return ;
    }
}
