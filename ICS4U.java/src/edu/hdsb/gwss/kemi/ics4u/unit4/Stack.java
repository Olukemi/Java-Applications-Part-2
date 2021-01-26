/**
 * Stack of Integers.
 *
 * @author Wm.Muir
 * @version 2020.S2
 */
package edu.hdsb.gwss.kemi.ics4u.unit4;

public class Stack {

    public static final int DEFAULT_SIZE = 11;

    // DATA
    private Integer[] data;

    // POINTER TO THE TOP OF THE STACK
    private int top;

    /**
     * Stack Constructor; done for you
     */
    public Stack() {
        this(DEFAULT_SIZE);
    }

    /**
     * Stack Constructor; done for you
     */
    public Stack(int initialCapacity) {
        this.top = -1;
        this.data = new Integer[initialCapacity];
    }

    /**
     * Looks at the Integer object at the top of this stack without removing it
     * from the stack.
     *
     * @return the Integer at the top of this stack, or NULL if stack is empty.
     */
    public Integer peek() {
        if (isEmpty() == true) {
            return null;
        } else {
            System.out.println(data[top]);
            return data[top];
        }
    }

    /**
     * Removes the Integer object at the top of this stack and returns the
     * Integer Object.
     *
     * @return the Integer at the top of this stack, or NULL if the stack is
     * empty.
     */
    public Integer pop() {
        if (isEmpty() == true) {
            return null;
        } else {
            System.out.println(data[top] + " was removed from the stack");
            top-= 1;
            System.out.println(data[top] + " is at the top of stack");
            return data[top];
        }
    }

    /**
     * Pushes the Integer onto the top of this stack.
     */
    public void push(Integer value) {
        if (isFull() == false) {
            top+= 1;
            data[top] = value;
        } 

    }

    /**
     * Returns the number of Integers on the stack.
     *
     * @return
     */
    public int size() {
        return top+1;
    }

    /**
     * Returns the current capacity of the Stack.
     *
     * @return
     */
    public int capacity() {
        return 11;
    }

    /**
     * Tests if this stack is empty.
     *
     * @return
     */
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Tests if the Stack is full.
     *
     * @return
     */
    public boolean isFull() {
        if (top == data.length -1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * The Stack will be empty after this call.
     */
    public void makeEmpty() {
        top = -1;
        System.out.println("Stack is now empty");

    }

}
