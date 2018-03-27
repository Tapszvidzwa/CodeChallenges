//Hackerrank

/* Given a reference to the head of a doubly-linked list and an integer, , create a new Node object having data value  and insert it into a sorted linked list. */



/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

Node SortedInsert(Node head,int data) {
    
   if(head == null) {
       head = createNode(data);
       return head;
   }
    
   Node current = head;
    
    //traverse to the insertion point
    while(current.next != null) {
        if(current.next.data < data) {
               current = current.next;
               continue;
        } else {
            break;
        }
    }
    
    insert(current, createNode(data));
    
    return head;
    
}

private void insert(Node lstNode, Node newNode) {
    
    //perfom insertion
    
    //newNode next becomes lastNode next
    newNode.next = lstNode.next;
    
    //lastNode next becomes newNode
    lstNode.next = newNode;
    
    //newNode prev becomes lastNode
    newNode.prev = lstNode;
    
    if(newNode.next != null) {
    //newNode next, prev becomes newNode
    newNode.next.prev = newNode;
    }
    
}

private Node createNode(int data) {
    
    Node newNode = new Node();
    
    newNode.data = data;
    newNode.next = null;
    newNode.prev = null;
    
    return newNode;
}

