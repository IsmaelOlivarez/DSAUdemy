public class SinglyLinkedList {
    //Head and tail properties
    public Node head;
    public Node tail;
    public int size; //Nice to have for future reference

    public Node createSinglyLinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
        /*
         * [1|0] -> [4|1] -> [9|2] -> [4|3]
         * Data is the first part
         * The "next" is the index and what it points to
         * The head is the node in itself
         * [<Data>|<Next>] <-- The whole thing is the head.
         * 
         */
    }
}
