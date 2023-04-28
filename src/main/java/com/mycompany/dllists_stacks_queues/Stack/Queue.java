
package com.mycompany.dllists_stacks_queues.Stack;

/**
 *
 * @author MoaathAlrajab
 */
class Queue {
   private LinkedList linkedList;

   private int size;
    
   Queue() {
      linkedList = new LinkedList();
   }
   
   public void enqueue(int newData) {
      // Create a new node
      Node newNode = new Node(newData);
       
      // Insert as list tail (end of queue)
      linkedList.append(newNode);
   }
   
   public int dequeue() {
      // Copy list head's data
      int dequeuedItem = linkedList.getHeadData();
      
      // Remove list head
      linkedList.removeAfter(null);
      
      // Return dequeued item
      return dequeuedItem;
   }
   
   public void print() {
      linkedList.printList();
   }
   public boolean isEmpty(){
      if(linkedList.getSize()==0)
         return true;
      return false;

   }

   public int getSize(){
      return linkedList.getSize();
   }
}