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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode l3 = new ListNode();
        ListNode temp3 = null;
        int carry = 0;

        while (temp1 != null && temp2 != null) {
            int val = temp1.val + temp2.val + carry;

            int ld = val % 10;
            int nextDig = val / 10;
            carry = nextDig;

            if (temp1 == l1 || temp2 == l2) {
                l3.val = ld;
                temp3 = l3;
                temp1 = temp1.next;
                temp2 = temp2.next;
                continue;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;

            temp3.next = new ListNode(ld);
            temp3 = temp3.next;
        }
        while (temp1 != null) {
            int val = temp1.val + carry;

            int ld = val % 10;
            int nextDig = val / 10;
            carry = nextDig;
            temp1 = temp1.next;

            temp3.next = new ListNode(ld);
            temp3 = temp3.next;
        }
        while (temp2 != null) {
            int val = temp2.val + carry;

            int ld = val % 10;
            int nextDig = val / 10;
            carry = nextDig;
            temp2 = temp2.next;

            temp3.next = new ListNode(ld);
            temp3 = temp3.next;
        }

        if (carry > 0) {
            temp3.next = new ListNode(carry);
            temp3 = temp3.next;
        }

        return l3;
    }
}
