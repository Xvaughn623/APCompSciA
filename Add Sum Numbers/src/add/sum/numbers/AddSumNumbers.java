/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package add.sum.numbers;

import java.util.Scanner;

/**
 *
 * @author 2019282
 */
public class AddSumNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter any number between 1 and 1,000: "); // Phrase to input
        Scanner Carrybot = new Scanner(System.in); // Make a new Scanner
        int m, n, sum = 0;
        m = Carrybot.nextInt(); // Input
        while(m > 0) // Cant be 0, only between 1 and 1000
                {
                    n = m%10; // You divide and put the modulo in storage
                    sum = sum + n; // Adds the new number to the sum
                    m = m / 10; //Resets a new m to restart the operations
                }
        
                System.out.println("sum of the digits is " + sum + (".")); // The message
                
                
        
        
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
