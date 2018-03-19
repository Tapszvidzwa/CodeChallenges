/*
Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node RemoveDuplicates(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method. 
      
   //special cases
    //list is length one
    //list is length zero  
    Node current = head;
    Node previous = head;
    
    boolean snd_node = false;
    
    if(current == null) {
        return head;
    }
    
    
    while(current != null) {
        
        //if the two adjacent nodes are equal
        if(current.data == previous.data) {
        
            //if current is not on second node, just continue
            if(!snd_node) {
               current = current.next;
               snd_node = true;
               continue;
             } else {
                
            //otherwise, delete current node from linked list
            previous.next = current.next;
            current = current.next;
            continue;        
            }
        }
        
        current = current.next;
        previous = previous.next; 
    }
    
    return head;
}
