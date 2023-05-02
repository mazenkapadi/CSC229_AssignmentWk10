
package com.mycompany.dllists_stacks_queues.Stack;

/**
 *
 * @author MoaathAlrajab
 */
class Stack {
   private LinkedList linkedList;
   private int size;
    
   Stack() {
      linkedList = new LinkedList();
   }
   
   public void push(int newData) {
      // Create a new node and prepend
      Node newNode = new Node(newData);
      linkedList.prepend(newNode);
   }
   
   public int pop() {
      // Copy list head's data
      int poppedItem = linkedList.getHeadData();
      
      // Remove list head
      linkedList.removeAfter(null);
      
      // Return popped item
      return poppedItem;
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
