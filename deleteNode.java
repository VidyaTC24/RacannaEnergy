class node{
    int data;
    Node next;
    Node(int val){
        data=val;
        next=null;
    }
}
class LinkedList{
    Node head;
    void deleteNodeWithoutHead(Node pos){
    if(pos==null)
      return;
    else{
      if(pos.next==null){
        System.out.println("Last node\n");
        return;
      }
    }
    pos.data=pos.next.data;
    pos.next=pos.next.next;
    }
  public static void main(String args[])
{
    LinkedList llist = new LinkedList();
    llist.deleteNodeWithoutHead(del);
}
}