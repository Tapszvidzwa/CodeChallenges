/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not. 
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int CompareLists(Node headA, Node headB) {
    
    Node cur1 = headA;
    Node cur2 = headB;
    
    while(cur1 != null) {     
        
        //if cur2 list is shorter, return 
        if(cur2 == null) {
            return 0;
        }
        
        //if the data is different, return
        if(cur2.data != cur1.data) {
            return 0;
        }
        
        //continue iterating
        cur2 = cur2.next;
        cur1 = cur1.next;
        
    }
    
    //if cur2 was longer, return
    if(cur2 != null) {
        return 0;
    }
    
    return 1;
}
