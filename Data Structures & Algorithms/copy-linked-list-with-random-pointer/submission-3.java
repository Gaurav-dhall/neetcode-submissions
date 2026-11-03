/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null){
            return null;
        }
        Node temp= head;
        int i=0;
        Node head2=new Node(head.val);
        Node temp2=head2;

        Map<Node,Integer> hash1=new HashMap<>();
        Map<Integer,Node> hash2= new HashMap<>();

        while(temp!=null){
            hash1.put(temp,i);
            hash2.put(i,temp2);
            if(temp.next==null){
                break;
            }
            temp2.next=new Node(temp.next.val);
            temp2=temp2.next;
            temp=temp.next;
            i++;
        }

        temp=head;
        temp2=head2;

        while(temp!=null){
            if(temp.random==null){
                 temp2=temp2.next;
            temp=temp.next;
            continue;
            }
            temp2.random=hash2.get(hash1.get(temp.random));
            temp2=temp2.next;
            temp=temp.next;
        }

        return head2;
    }
}
