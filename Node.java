// package whatever; // don't place package name!

import java.io.*;

 
class Node {
    int data;
     Node next;
     Node prev;
  


static Node Reverse(Node head) {
  Node list=head;
  Node runner=list;
  Node prevNode=null;
  Node nextNode=null;
  
  if(runner.next!=null){
  nextNode=runner.next;
  }
  
  head.next=list.prev;
  System.out.println("head.next changed");
  head.prev=list.next;
  System.out.println("head.prev changed");
  runner=nextNode;
  
  
  return list;
}



public static void main(String [] args){
   Node major=new Node();
   Node major1=new Node();
   Node major2=new Node();
   Node major3=new Node();
   Node major4=new Node();
   Node major5=new Node();
   Node major6=new Node();
   Node major7=new Node();
   Node major8=new Node();
   Node major9=new Node();
   Node major10=new Node();
  
  major.data=1;
  major1.data=2;
  major2.data=3;
  major3.data=4;
  major4.data=5;
  major5.data=6;
  major6.data=7;
  major7.data=8;
  
  major.next=major1;
  major1.next=major2;
  major2.next=major3;
  major3.next=major4;
  major4.next=major5;
  major5.next=major6;
  major6.next=major7;
  
  major1.prev = major;
  major2.prev = major1;
  major3.prev = major2;
  major4.prev = major3;
  major5.prev = major4;
  major6.prev = major5;
  major7.prev = major6;
  
  

  
  Node runner=Reverse(major);
  
  
  
  while(runner!=null){
    System.out.println(runner.data);
    if(runner.next != null){
    System.out.println("next = "+ runner.next.data);
    }
    if (runner.prev != null){
    System.out.println("prev = "+ runner.prev.data);
    }
    runner=runner.prev;
  }
  
  
  
  
  
}
}