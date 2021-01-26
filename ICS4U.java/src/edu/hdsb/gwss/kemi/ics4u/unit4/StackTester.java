/**
 * Stack Tester.
 *
 * @author Wm.Muir
 * @version 2020.S2
 */
package edu.hdsb.gwss.kemi.ics4u.unit4;

/**
 * @author Wm.Muir
 */
public class StackTester {

    public static void main( String[] args ) {
        
        int initialCapcaity = 11;
        Stack stack = new Stack();
        
        // PLEASE TURN ASSERTIONS ON
        // Right-Click on your Netbean Projects
        // Select:  Properties --> Run
        // VM Options Box:
        //   -ea
        
        // EXAMPLE
        //
        // TEST CASE #1 - Empty Stack
//        assert( stack.isEmpty() == true );                  // stack must be empty
//        assert( stack.isFull() == false );                  // stack is empty, so not full
//        assert( stack.size() == 0 );                        // nothing on the stack
//        assert( stack.capacity() == initialCapcaity );      // default size is 11
//        assert( stack.peek() == null );                     // stack is empty, nothing on top
//        assert( stack.pop() == null );                      // stack is empty, nothing to remove
//        
//        // TEST CASE #2 - ADD ONE ITEM ON STACK
//        stack.push( 0  );
//        assert( stack.isEmpty() == false );                 // stack has one value
//        assert( stack.isFull() == false );                  // stack is not full
//        assert( stack.size() == 1 );                        // one value added
//        assert( stack.capacity() == initialCapcaity );      // default size is still 11
//        assert( stack.peek() == 0 );                        // a ZERO is the only element
//        
//        // TEST CASE #3 - REMOVE ONE ITEM ON STACK
//        stack.push( 1 );
//        stack.push( 2 );
//        assert( stack.isEmpty() == false );                 // stack has two value
//        assert( stack.isFull() == false );                  // stack is not full
//        assert( stack.size() == 2 );                        // two values added
//        assert( stack.capacity() == initialCapcaity );      // default size is still 11
//        assert( stack.pop() == 1 );                         // remove one value
//        
//        // TEST CASE #4 - FULL STACK
//        stack.push( 1 );
//        stack.push( 2 );
//        stack.push( 3 );
//        stack.push( 4 );
//        stack.push( 5 );
//        stack.push( 6 );
//        stack.push( 7 );
//        stack.push( 8 );
//        stack.push( 9 );
//        stack.push( 10 );
//        stack.push( 11 );
//        assert( stack.isEmpty() == false );                
//        assert( stack.isFull() == true );                  
//        assert( stack.size() == 11 );                       
//        assert( stack.capacity() == initialCapcaity );      
//        
//        // TEST CASE #5 - MAKE STACK EMPTY
//        stack.push(3);
//        assert( stack.isEmpty() == false );                 
//        assert( stack.isFull() == false );                  
//        assert( stack.size() == 1 );                        
//        assert( stack.capacity() == initialCapcaity );     
//        stack.makeEmpty();
//        assert( stack.isEmpty() == true );
//        assert( stack.size() == 0 );   
//        
//        // TEST CASE #6 - PEEK
//        stack.push( 1 );
//        stack.push( 2 );
//        assert( stack.isEmpty() == false );                 
//        assert( stack.isFull() == false );                  
//        assert( stack.size() == 2 );                     
//        assert( stack.capacity() == initialCapcaity );    
//        stack.peek();   
                
        // TEST CASE #7 - REMOVE NON EXISTING ITEM
//        assert( stack.isEmpty() == true );
//        stack.pop();
        
        // TEST CASE #8 - ADD TO FULL STACK
        stack.push( 1 );
        stack.push( 2 );
        stack.push( 3 );
        stack.push( 4 );
        stack.push( 5 );
        stack.push( 6 );
        stack.push( 7 );
        stack.push( 8 );
        stack.push( 9 );
        stack.push( 10 );
        stack.push( 11 );
        assert( stack.isEmpty() == false );                
        assert( stack.isFull() == true );                  
        assert( stack.size() == 11 );                       
        assert( stack.capacity() == initialCapcaity ); 
        stack.pop();
        
    }
    
}
