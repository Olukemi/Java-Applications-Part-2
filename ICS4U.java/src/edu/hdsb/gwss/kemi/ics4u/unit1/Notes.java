/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.kemi.ics4u.unit1;

import java.math.BigInteger;

/**
 *
 * @author 4UKemi
 */
public class Notes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //NUMERIC 
       //bias 2^(k-1) - 1  
//       8 bits 3
//      16 bits 5
//      32 bits 8    
//      63 biits 11
//      all above are the k value
//

//2.625
// 10.101        * 2 ^1 == 1.**0101**
//0.625 * 2 = 1.25
//0.25 * 2 = 0.5
//0.50 * 2 = 1.0
//0.00 * 2 = 0(don't have to write 0 down)
//"Normalized"

//      0 1 0 0 0 1 0 1
//      **0** is the sign

//take exponent of 2 ^ 1
//exp =1 
//bias = 3( 2^(k-1) - 1 )
//exp + bias ==4 base 10 = **100**(4 in binary)
        
// Steps
// 1. first bit tells you if it postive or negative
// 2. convert first number to binary
// 3. 



//

BigInteger x = new BigInteger("1");
BigInteger y = new BigInteger("2");
x = x.add(y);
    }
    
}
