class Node{
    int key;
    int val;
    Node next;
    Node prev;
    Node(){
        this.key=-1;
        this.val=-1;
        this.next=null;
        this.prev=null;
    }

    Node(int k,int v){
        this.key=k;
        this.val=v;
        this.next=null;
        this.prev=null;
    }
}

class LRUCache {
    int size;
    Node head;
    Node tail;
    Map<Integer,Node> hash= new HashMap<>();

    public LRUCache(int capacity) {
        head= new Node();
        tail=new Node();

        head.next=tail;
        tail.prev=head;
        this.size=capacity;
    }
    
    public int get(int key) {
        Node temp=hash.get(key);
        if(temp==null){
            return -1;
        }
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;
        temp.next=head.next;
       head.next=temp;
       temp.next.prev=temp;
       temp.prev=head;


        return temp.val;
    }
    
    public void put(int key, int value) {
      
        Node temp=null;
       if(hash.containsKey(key)){
            temp=hash.get(key);
            temp.val=value;
            temp.prev.next=temp.next;
            temp.next.prev=temp.prev;
            

       }
       else{
        if(hash.size()>=this.size){
            Node tailprev=tail.prev;
            tailprev.prev.next=tailprev.next;
            tailprev.next.prev=tailprev.prev;
            hash.remove(tailprev.key);
        }
         temp=new Node(key,value);
        hash.put(key,temp);
     

       }
     
       

       temp.next=head.next;
       head.next=temp;
       temp.next.prev=temp;
       temp.prev=head;
       

    }
}
