
package com.mycompany.dllists_stacks_queues.Stack;

/**
 *
 * @author MoaathAlrajab
 */
class Node {
   public int data;
   public Node next;

   public Node(int initialData) {
      data = initialData;
      next = null;
   }
}

class LinkedList {
   private Node head;
   private Node tail;
   private int size;
    
   public LinkedList() {
      head = null;
      tail = null;
      size = 0;
   }
    
   public void append(Node newNode) {
      if (head == null) {
         head = newNode;
         tail = newNode;
      }
      else {
         tail.next = newNode;
         tail = newNode;
      }
      size++;
   }
   
   public void prepend(Node newNode) {
      if (head == null) {
         head = newNode;
         tail = newNode;
      }
      else {
         newNode.next = head;
         head = newNode;
      }
      size++;
   }
   
   public void printList() {
      Node node = head;
      while (node != null) {
         System.out.print(node.data + " ");
         node = node.next;
      }
      System.out.println();
   }
   
   public void insertAfter(Node currentNode, Node newNode) {
      if (head == null) {
         head = newNode;
         tail = newNode;
      }
      else if (currentNode == tail) {
         tail.next = newNode;
         tail = newNode;
      }
      else {
         newNode.next = currentNode.next;
         currentNode.next = newNode;
      }
      size++;
   }
   
   public void removeAfter(Node currentNode) {
      if (currentNode == null && head != null) {
         // Special case: remove head
         Node succeedingNode = head.next;
         head = succeedingNode;
         if (succeedingNode == null) {
             // Last item was removed
             tail = null;
         }
      }
      else if (currentNode.next != null) {
         Node succeedingNode = currentNode.next.next;
         currentNode.next = succeedingNode;
         if (succeedingNode == null) {
            // Remove tail
            tail = currentNode;
         }
      }
      size--;
   }
   
   
   // Added for Stack/Queue section
   public int getHeadData() {
      return head.data;
   }

   public int getSize(){
      return size;
   }
}