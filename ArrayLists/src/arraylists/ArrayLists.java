/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraylists;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
// importing all my thingamajigs
/**
 *
 * @author 2019282
 */
public class ArrayLists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int UserRequest = 0;
        int Rec = 0;
        int RandomNum = 0;
        int Checker = 0;
        int CheckerA = 0;
        // Declaring all my variables, which just so happen to be integers
        
        System.out.println("Hello, my Name is Carrybot and today we will be testing out Array Lists, here Check out ours that has 25 random integers between 1 and 100");
        ArrayList<Integer> CarrybotA = new ArrayList<>(); // Creates a new array
        Random CarrybotR = new Random(); 
        // Creates a new random
        for (int i = 0; i < 25; i++){
             RandomNum = CarrybotR.nextInt(101);
            CarrybotA.add(RandomNum);
            
        }
        // Gets 25 Random numbers between 0-101 not including 101 I believe
        System.out.println(CarrybotA); // Prints the ArrayList
        System.out.println("Please input what number you would like to check for");
        Scanner Carrybot = new Scanner(System.in); 
        UserRequest = Carrybot.nextInt(); 
        // The number the user would like to check for in the list
        
                for (int i = 0; i < 25; i ++){
                    Checker = CarrybotA.get(CheckerA); 
                    // Checker is the number, CheckerA is its position in the Array
            
                    if (Checker == UserRequest){
                             Rec++; 
                            // Adds the the number of recurrences
                         }
                         else{
                                // Nothing happens, Just cycles through the loop
                                }
                    
                        CheckerA++;
                        // Adds one to the array positional value, checking a different spot
                            }
       
                
                if (Rec == 0){
            System.out.println("There are no recurrences"); 
            // If the value is never there, prints this
         
        }
        
                else{
            System.out.println(" There are " + Rec + " Recurrences");
            // If its there even once, runs this
        }
       
    }
    
    
    
}
