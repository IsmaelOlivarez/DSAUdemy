public class Main{
    public static void main(String[] args) {
        /*
         * LinkedList are basically arrays that don't have predefined space allocation and
         * must be traversed in the order that they are created and that their nodes point to
         * That being said, this means that they are more inneficient when
         * it comes to accessing an object within it
         * This means that Arrays are far supierior when it comes to accessing
         * something in its ownership.
         * 
         */

         //Four types of Linked List

         /*
          * Singly Linked List - One continuous Linked List that ends with a tail.
          * Circular Signly Linked List - One continuous Linked List that has no tail and the last 
          * element points to the first element in it.
          * Singly Linked List can only point forward while Doubly can point forward and backwards.
          * Doubly Linked List - 
          * Circular Doubly Linked List
          */
        SinglyLinkedList sLL = new SinglyLinkedList();
        sLL.createSinglyLinkedList(18);
        System.out.println(sLL.head.next);

    }
}