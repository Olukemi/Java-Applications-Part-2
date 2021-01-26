/**
 * String Nodes
 *
 * @author Wm.Muir
 * @version 2020.S2
 */
package edu.hdsb.gwss.kemi.ics4u.unit4;

/**
 * Lesson: 4.03 - a Node
 */
public class Node {

    private String data;
    private Node next;

    public Node( String newData ) {
        this.data = newData;
        this.next = null;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext( Node nextNode ) {
        this.next = nextNode;
    }

    public String getData() {
        return this.data;
    }

}
