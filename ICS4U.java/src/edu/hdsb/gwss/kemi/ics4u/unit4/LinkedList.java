/**
 * Linked List of String Nodes
 *
 * @author Wm.Muir
 * @version 2020.S2
 */
package edu.hdsb.gwss.kemi.ics4u.unit4;

/**
 * Linked List Interface
 *
 * @author Wm.Muir
 * @version 2018-19.S2
 */
public class LinkedList {

    // HEAD & TAIL
    private Node head;
    private Node tail;
    private Node newNode;
    private Node next;

    /**
     * Linked List Constructor; done for you
     */
    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    /**
     * Adds the String to the front of the linked list.
     *
     * @param str
     */
    public void addAtFront(String str) {
        newNode = new Node(str);
        next = newNode.getNext();
        head = newNode;
    }

    /**
     * Adds the String to the end of the linked list.
     *
     * @param str
     */
    public void addAtEnd(String str) {
        newNode = new Node(str);
        newNode = tail;
        tail = null;
    }

    /**
     * Removes the first occurrence of the given string.
     *
     * @param str
     */
    public void remove(String str) {

    }

    public String removeHead() {
        if (isEmpty() == false) {
            head = head.getNext();
            return head.getData();
        } else {
            return null;
        }
    }

    public String removeTail() {
        if (isEmpty() == false) {
            tail = tail.getNext();
            return tail.getData();
        } else {
            return null;
        }
    }

    /**
     * Retrieves, but does not remove, the head of this Linked List, or returns
     * null if this Linked List is empty.
     */
    public String head() {
        if (isEmpty() == false) {
            return head.getData();
        } else {
            return null;
        }
    }

    /**
     * Retrieves, but does not remove, the tail of this Linked List, or returns
     * null if this Linked List is empty.
     */
    public String tail() {
        if (isEmpty() == false) {
            return head.getData();
        } else {
            return null;
        }
    }

    /**
     * Returns the number of Strings in the Linked List.
     *
     * @return
     */
    public int size() {
        if (head == null) {
            return 0;
        } else {
            int size = 0;
            while (head.getNext() != null) {
                head = head.getNext();
                size++;
            }
            return size;
        }
    }

    /**
     * Tests if this Linked List is empty.
     *
     * @return
     */
    public boolean isEmpty() {
        if (head == null && tail == null) {
            System.out.println("This list is empty");
            return true;
        } else {
            return false;
        }
    }

    /**
     * The Linked List will be empty after this call returns.
     */
    public void makeEmpty() {
        System.out.println("List is now empty");
        head = null;
        tail = null;

    }

    /**
     * Creates a String that lists the nodes of the linked list.
     *
     * Head --> A --> B -- > C --> Tail
     *
     * @return string
     */
    public String toString() {
        if (head == null && tail == null) {
            return null;
        } else if (head.getNext() == null) {
            return head.getData();
        } else {
            while (head.getNext() != null) {
                head = head.getNext();
                System.out.println(head.getData());
            }
            return head.getData();
        }


    }

}
