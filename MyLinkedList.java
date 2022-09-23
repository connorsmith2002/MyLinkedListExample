package List;
/**
 * My Small Implementation of a Node based list.
 *
 * @author csmit607
 */
public class MyLinkedList<T extends Comparable<T>> {

    /** size of the linked list */
    private int size;

    /** reference to the head node */
    private LinkedNode head;

    public MyLinkedList() {
        size = 0;
        head = new LinkedNode();
    }

    /**
     * Adds a node to the front of the linked list
     * @param value: the value of the node being added
     */
    public void addFirst(T value) {
        LinkedNode newNode = new LinkedNode(value);
        newNode.next = head.next;
        head.next = newNode;
        size++;
    }

    /**
     * Finds the node at the given "index" of the linked list and returns the value associated with that node
     * @param index: the index of the value to return
     * @return the value of the element at the given index
     */
    public T get(int index) {
        int idx = 0;
        LinkedNode temp = head.next;
        while (idx != index) {
            temp = temp.next;
            idx++;
        }
        return temp.getValue();
    }

    /**
     * Adds a node to the end of the linked list with the given value
     * @param value: value of the node being added at the end of the linked list
     */
    public void addLast(T value) {  
        LinkedNode current = head.next;
        while (current.next != null) {
            current = current.next;
        }
        LinkedNode newNode = new LinkedNode(value);
        current.next = newNode;
        size++;
    }

    /**
     * Returns the size of the linked list
     * @return the size of the linked list
     */
    public int size() { return size; }

    /**
     * Removes a node and the value associated with the node from the linked list
     * @param value: the value that is being removed from the linked list
     */
    public void remove(T value) {
        if (value == head.next.getValue()) {
            head.next = head.next.next;
        } else {
            LinkedNode current = head.next;
            while (current.next.getValue() != value) {
                current = current.next;
            }
            current.next = current.next.next;

        }
        size--;
    }

    /**
     * This is the Node class which forms the building blocks of the linked list. Each node contains
     * a value and a reference to the next node.
     *
     * @author csmit607
     */
    public class LinkedNode {

        /** the value inside each node */
        private T value;

        /** a reference to the next node after the current node */
        LinkedNode next;

        /**
         * Constructs an empty node
         */
        public LinkedNode() {
            this(null);
        }

        /**
         * Constructs a node with an internal value given by the parameter
         * @param value: The value to be stored inside the new node
         */
        public LinkedNode(T value) {
            this.value = value;
            next = null;
        }

        /**
         * Returns the value associated with "this" objects node
         * @return: the value associated with a node
         */
        public T getValue() {
            return value;
        }
    }
}