/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package champion;
import java.util.Scanner;

/**
 *
 * @author 2019282
 */
public class Champion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please input 3 numbers: ");
        Scanner Carrybot = new Scanner(System.in);
        int N1; // N1 Integer
        int N2; // N2 Integer
        int N3; // N3 Integer
        N1 = Carrybot.nextInt(); // The three numbers consecutively
        N2 = Carrybot.nextInt();
        N3 = Carrybot.nextInt();
        
        if ((N1 >= N2) && (N1 >= N3)) // Deciding whether or not N1 is the biggest number
                System.out.println("Congratulations, the epic number of " + N1 + " is the victor!");
        else if ((N2 > N1) && (N2 >= N3)) // Deciding whether or not N2 is the biggest number
                 System.out.println("Congratulations, the epic number of " + N2 + " is the victor!");
        else if ((N3 > N1) && (N3 > N2)) // Deciding whether or not N3 is the biggest number
                 System.out.println("Congratulations, the epic number of " + N3 + " is the victor!");
                                
                     
            
        
                
        
        
        // TODO code application logic here
    }
    
}
