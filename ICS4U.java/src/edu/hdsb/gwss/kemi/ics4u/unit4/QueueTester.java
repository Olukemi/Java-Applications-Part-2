/*
 */
package edu.hdsb.gwss.kemi.ics4u.unit4;

/**
 */
public class QueueTester {

    /**
     */
    public static void main( String[] args ) {

        // PLEASE TURN ASSERTIONS ON
        // Right-Click on your Netbean Projects
        // Select:  Properties --> Run
        // VM Options Box:
        //   -ea
        
        
        // EXAMPLE
        int initialCapcaity = 26;
        Queue q = new Queue( initialCapcaity );

        // TEST CASE #1 - EMPTY STACK
//        assert ( q.size() == 0 );
//        assert ( q.isEmpty() == true );
//        assert ( q.isFull() == false );
//        System.out.println( "CASE 1: DEQUEUE EMPTY" );
//        assert ( q.dequeue() == null );
//        System.out.println( q.toString() );
//       
//        // TEST CASE #2 - ADD ONE ITEM ON STACK
//        q.enqueue( "A" );
//        assert( q.isEmpty() == false );                 // queue has one value
//        assert( q.isFull() == false );                  // queue is not full
//        assert( q.size() == 1 );                        // one value added
//        assert( q.capacity() == initialCapcaity );      // default size is still 26
//        assert( q.front().equals( "A" ) );              // a A is the only element
//        System.out.println( q.toString() );
//        
//        
//        // TEST CASE #3 - FULL STACK
//        q.enqueue("A");
//        q.enqueue("B");
//        q.enqueue("C");
//        q.enqueue("D");
//        q.enqueue("E");
//        q.enqueue("F");
//        q.enqueue("G");
//        q.enqueue("H");
//        q.enqueue("I");
//        q.enqueue("J");
//        q.enqueue("K");
//        q.enqueue("L");
//        q.enqueue("M");
//        q.enqueue("N");
//        q.enqueue("O");
//        q.enqueue("P");
//        q.enqueue("Q");
//        q.enqueue("R");
//        q.enqueue("S");
//        q.enqueue("T");
//        q.enqueue("U");
//        q.enqueue("V");
//        q.enqueue("W");
//        q.enqueue("X");
//        q.enqueue("Y");
//        q.enqueue("Z");
//        assert ( q.isEmpty() == false );
//        assert ( q.isFull() == true );
//        assert( q.size() == 26 );
//        assert( q.capacity() == initialCapcaity );
//        System.out.println( q.toString() );
//        
//        // TEST CASE #4 - REMOVE ITEM
//        q.enqueue("A");
//        q.enqueue("B");
//        q.enqueue("C");
//        q.enqueue("D");
//        assert ( q.isEmpty() == false );
//        assert ( q.isFull() == false );
//        assert ( q.dequeue() != null);
//        System.out.println( q.toString() );
//        
//        // TEST CASE #5 - MAKE QUEUE EMPTY
//        q.enqueue( "A" );
//        q.enqueue("B");
//        q.enqueue("C");
//        assert( q.isEmpty() == false );                 
//        assert( q.isFull() == false );                  
//        assert( q.size() == 3 );                        
//        assert( q.capacity() == initialCapcaity );                  
//        System.out.println( q.toString() );
//        q.makeEmpty();
//        System.out.println( q.toString() );
//
//        // TEST CASE #6 - CHECK FRONT
//        q.enqueue( "A" );
//        q.enqueue("B");
//        q.enqueue("C");
//        assert( q.isEmpty() == false );                 
//        assert( q.isFull() == false );                  
//        assert( q.size() == 3 );                        
//        assert( q.capacity() == initialCapcaity );                  
//        System.out.println( q.toString() );
//        q.front();
//        
//        // TEST CASE #7 - CHECK BACK
//        q.enqueue( "A" );
//        q.enqueue("B");
//        q.enqueue("C");
//        assert( q.isEmpty() == false );                 
//        assert( q.isFull() == false );                  
//        assert( q.size() == 3 );                        
//        assert( q.capacity() == initialCapcaity );                  
//        System.out.println( q.toString() );
//        q.end();
        
        // TEST CASE #8 - REMOVE NON EXISTING ITEM
//        assert ( q.isEmpty() == true );
//        q.dequeue();
//        System.out.println( q.toString() );
//        
        // TEST CASE #9 - ADD TO FULL QUEUE
        q.enqueue("A");
        q.enqueue("B");
        q.enqueue("C");
        q.enqueue("D");
        q.enqueue("E");
        q.enqueue("F");
        q.enqueue("G");
        q.enqueue("H");
        q.enqueue("I");
        q.enqueue("J");
        q.enqueue("K");
        q.enqueue("L");
        q.enqueue("M");
        q.enqueue("N");
        q.enqueue("O");
        q.enqueue("P");
        q.enqueue("Q");
        q.enqueue("R");
        q.enqueue("S");
        q.enqueue("T");
        q.enqueue("U");
        q.enqueue("V");
        q.enqueue("W");
        q.enqueue("X");
        q.enqueue("Y");
        q.enqueue("Z");
        assert ( q.isEmpty() == false );
        assert ( q.isFull() == true );
        assert( q.size() == 26 );
        assert( q.capacity() == initialCapcaity );
        System.out.println( q.toString() );
        q.enqueue("AA");
        System.out.println( q.toString() );
    }

}
