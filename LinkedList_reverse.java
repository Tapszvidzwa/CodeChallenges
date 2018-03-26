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

 
 Node Reverse(Node lst) {

  //if there is only one element in the list, return
  if(lst.next == null || lst == null) {
    return lst;
  }

  Node current = lst;
  Node holder = current;
  Node nextNode = current;

  while(current != null) {
    holder = current;
    nextNode = current.next;
    swapPointers(current);
    current = nextNode;
  }

 return holder;
 
}



//Given a Node it swaps the directions with which next and prev
//are pointing to
void swapPointers( Node current) {

  Node nextNode = current.next;
  Node prevNode = current.prev;

  current.next = prevNode;
  current.prev = nextNode;
}
  