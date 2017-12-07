/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bonasee;
import java.util.Scanner;

/**
 *
 * @author 2019282
 */
public class Bonasee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int W; // the number of time the while loops
       int Z; // Input value, or number of values the player wants
       int X; // First number, Fib values
       int Y; // Second number, Fib values
       int P; // Line counter
       boolean N = true; // Alternator
       String Name;
       X = 0;
       Y = 1;
       W = 0;       
       P = 0;
       
        System.out.println("Hello there, My name is Carrybot, what is yours? \n ");
        Scanner Carrybot = new Scanner(System.in);
        Name = Carrybot.next();
        if(Name.equalsIgnoreCase("Jimmy"))
            System.out.println("You are a loser");
        else
        System.out.println("Okay " + Name + " I am here today to spread the news of Fibonacci, the son of Bonacci. Please input however many Numbers you'd like to see in the Fibonacci sequence. ");
            Z = Carrybot.nextInt();
        System.out.println("Ok your son of bonacci sequence is");
        while (W != Z) { 
            if (N == true){
        System.out.print(X + " ");
            X = X + Y;
            P = P + 1;
        N = false;}
                else if (N == false){
                    System.out.print(Y + " ");
                Y = Y + X;
                P = P + 1;
                
        N = true;}        
                      
             W = W + 1;
             
                        if (P % 5 == 0)
            System.out.print("\n");
        }
              
        System.out.println("");
        
        
        
        
        
        // TODO code application logic here
    }
    
}
