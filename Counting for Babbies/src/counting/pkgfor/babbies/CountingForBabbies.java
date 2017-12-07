/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package counting.pkgfor.babbies;
import java.util.Scanner;

/**
 *
 * @author 2019282
 */
public class CountingForBabbies {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Carrybot = new Scanner(System.in);
        int X; 
        int Y;
        int Z;
        String Name;
        System.out.println("Hello User, My name is Carrybot, what is yours?");
        Name = Carrybot.next();
        if(Name.equalsIgnoreCase("Jimmy")) { //Easter eggs!
            System.out.println("You are a loser");
            return;
        } else 
            System.out.println("Okay " + Name + " Today we are learning how to count! Please input What number you would wish to start at.");
        X = Carrybot.nextInt();
        System.out.println("To which number would you like to count to?");
        Y = Carrybot.nextInt();
        System.out.println("By how many numbers would you like to count?");
        Z = Carrybot.nextInt();
         
        for (; X <= Y; X+=Z)
             System.out.print(X + " ");
   
    }
    }
        // TODO code application logic here
    
    

