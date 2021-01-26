/**
 * Queue of Strings.
 *
 * @author Wm.Muir
 * @version 2020.S2
 */
package edu.hdsb.gwss.kemi.ics4u.unit4;

public class Queue {

    public static final int DEFAULT_SIZE = 11;

    // DATA
    private String[] data;

    // POINTER TO THE TOP OF THE STACK
    private int front;
    private int back;

    /**
     * Queue Constructor; done for you
     */
    public Queue() {
        this( DEFAULT_SIZE );
    }

    /**
     * Queue Constructor; done for you
     */
    public Queue( int initialCapacity ) {
        this.front = -1;
        this.back = -1;
        this.data = new String[initialCapacity];
    }

    /**
     * Retrieves, but does not remove, the front of this queue, or returns null
     * if this queue is empty.
     *
     * @return the head of this queue.
     */
    public String front() {
        if (isEmpty()== true){
            return null;
        } else {
            System.out.println(data[front] + " is at the front of the array");
            return data[front];
        }
    }

    /**
     * Retrieves, but does not remove, the END of this queue, or returns null if
     * this queue is empty.
     *
     * @return the head of this queue.
     */
    public String end() {
        if (isEmpty()== true){
            return null;
        } else {
            System.out.println(data[back] + " is at the end of the array");
            return data[back];
        }
    }

    /**
     * Inserts the String into this queue, if space is available.
     *
     * @param value
     */
    public void enqueue( String value ) {
        if ( (back + 1) % data.length == front ){
            
        } else if (isEmpty() == true){
            front = 0;
            back = 0;
            data[back] = value;
        } else{
            back = (back+1) % data.length;
            data[back] = value;
        }

    }

    /**
     * Retrieves and removes the String at the FRONT of this queue.
     *
     * @return the head of this queue.
     */
    public String dequeue() {
        if(isEmpty()== true){
            return null;
        } else if (front == back){
            front = -1;
            back = -1;
            return null;
        } else {
            data[front] = null;
            front = (front+1) % data.length;
            return data[front];
        }
    }

    /**
     * Returns the number of Strings in the QUEUE.
     *
     * @return
     */
    public int size() {
        return (Math.abs(back - front)) + 1;
    }

    /**
     * Returns the capacity of the QUEUE.
     *
     * @return
     */
    public int capacity() {
        return 26;
    }

    /**
     * Tests if this QUEUE is empty.
     *
     * @return
     */
    public boolean isEmpty() {
        if (front == -1 && back == -1){
            System.out.println("It's empty");
            return true;
        } else{
            System.out.println("It's not empty");
            return false; 
        }
    }

    /**
     * Tests if the QUEUE is full.
     *
     * @return
     */
    public boolean isFull() {
        if (back == data.length -1){
            System.out.println("It's full");
            return true;
        } else{
            System.out.println("It's not full");
            return false; 
        }

    }

    /**
     * The QUEUE will be empty after this call returns.
     */
    public void makeEmpty() {
        front = -1;
        back = -1;
        System.out.println("The array is now empty");

    }

    /**
     *
     */
    public String toString() {

        String s = "---------------------------------------------\n";
        s = s + "QUEUE: \n";
        for( int i = 0; i < data.length; i++ ) {
            s = s + s.format( "%5s |", data[i] );
        }
        s = s + "\n";
        if( this.front != -1 ) {
            for( int i = 0; i < data.length; i++ ) {
                if( this.front == this.back && this.front == i ) {
                    s = s + s.format( "%5s |", "F / B" );
                } else if( this.front == i ) {
                    s = s + s.format( "%5s |", "  F  " );
                } else if( this.back == i ) {
                    s = s + s.format( "%5s |", "  B  " );
                } else {
                    s = s + s.format( "%5s |", "     " );
                }

            }

        }

        return s;
    }

}
