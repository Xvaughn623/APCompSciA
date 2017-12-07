
package hangman;

import java.util.ArrayList;
import java.util.Random;
public class Hangman {

   
    public static void main(String[] args) {
        
        String CarrybotA[] = { "Bobsled", "Bodybuilder", "RowBoat", "Steampunk", "Donkey", "Juvy", "Union", "Rainbow", "Racecar"};
        int Wordget;
        
        Random CarrybotR = new Random();
        Wordget = CarrybotR.nextInt(9);
        System.out.println("Hello User! My name is Carrybot, and Tonight we are playing hangman!");
        String ChosenWord = CarrybotA[Wordget];
        
        ArrayList<String> CarrybotAL = new ArrayList<String>();
        
        System.out.println(ChosenWord);
        
        
        
    }
    
}
