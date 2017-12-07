/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package coolness.factor;
import java.util.Scanner;

/**
 *
 * @author 2019282
 */
public class CoolnessFactor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int X;
        String Name;
       
        System.out.println("Hello User, my name is Carrybot. What is yours?");
        Scanner Carrybot = new Scanner(System.in);
        Name = Carrybot.next();
        if(Name.equalsIgnoreCase("Jimmy")) // Easter eggs!
            System.out.println("You are a loser");
        else 
         System.out.println("Okay " + Name + " On a scale of 1-10 How cool are you?");
        X = Carrybot.nextInt();
        
        for (int Y = 0; Y < X;  Y+=1){
            System.out.println(Name + " is cool");
  
        }
        
                
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}



