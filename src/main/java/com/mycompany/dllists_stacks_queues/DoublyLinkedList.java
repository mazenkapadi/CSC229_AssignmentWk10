
package com.mycompany.dllists_stacks_queues;

/**
 *
 * @author MoaathAlrajab
 */
class Node {
   public int data;
   public Node next;
   public Node previous;

   public Node(int initialData) {
      data = initialData;
      next = null;
      previous = null;
   }
}

public class DoublyLinkedList {
   private Node head;
   private Node tail;

   private int size;
    
   public DoublyLinkedList() {
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
         newNode.previous = tail;
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
         head.previous = newNode;
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
         newNode.previous = tail;
         tail = newNode;
      }
      else {
         Node successor = currentNode.next;
         newNode.next = successor;
         newNode.previous = currentNode;
         currentNode.next = newNode;
         successor.previous = newNode;
      }
      size++;
   }
   
   public void remove(Node currentNode) {
      Node successor = currentNode.next;
      Node predecessor = currentNode.previous;
      
      if (successor != null)
         successor.previous = predecessor;
         
      if (predecessor != null)
         predecessor.next = successor;
         
      if (currentNode == head)
         head = successor;
         
      if (currentNode == tail)
         tail = predecessor;
      size--;
   }

   public int size(){
      return size;
   }
   public void printRevList() {
      Node node = tail;
      while (node != null) {
         System.out.print(node.data + " ");
         node = node.previous;
      }
      System.out.println();
   }
   public int max(){
      Node nd = head;
      int max = nd.data;
      while (nd!=null){
         if(nd.data>max){
            max=nd.data;
         }
         nd=nd.next;
      }
      return max;
   }
   public int min(){
      Node nd = head;
      int min = nd.data;
      while (nd!=null){
         if(nd.data<min){
            min=nd.data;
         }
         nd=nd.next;
      }
      return min;
   }

   public int[] toArray(){
      int index =0;
      int[] arr = new int[size];
      Node current = head;
      while (current != null) {
         arr[index++] = current.data;
         current = current.next;
      }
      return arr;
   }

   public int indexOf(int x){
      int index =0;
      Node current = head;
      while(current != null){
         if(x== current.data)
            return index;
         current = current.next;
         index++;
      }
      return -1;
   }



}
