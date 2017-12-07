/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package battleship;
import java.util.Arrays;
import java.util.Scanner;
/**
*
* @author Xvaug
*/
public class Battleship {

/**
* @param args the command line arguments
*/
public static void main(String[] args) {
int UserX = 6;
int UserY = 6; 
// Just initialization of variables 


int Y = 0;
int TotalHits = 0; // total Hits
int TotalMisses = 0; // Total Misses
String [][] Battleship = 
{{ "Miss", "Miss", "Hit", "Hit", "Hit"},
{ "Miss", "Miss", "Miss", "Miss", "Miss"},
{ "Miss", "Hit", "Hit", "Hit", "Hit"},
{ "Miss", "Miss", "Miss", "Miss", "Miss"},
{ "Miss", "Miss", "Miss", "Miss", "Miss"}};
// Creates a 2d Array

for ( int i = 0; i < 5; i++){ 
//This just runs the code 5 times
System.out.println("Please select the spaces you would like to hit like so [X,X]. The grid starts at 0.");
Scanner Carrybot = new Scanner(System.in);
UserX = Carrybot.nextInt(); // Getting your Row Number
UserY = Carrybot.nextInt(); // Getting your column number
int row1 = 0; 
int col1 = 0;
// row and column initialized inside for loop so they reset every time a new turn Starts
// If not for this it just keeps on adding the current number in the next turn and uses too big a number

for (int row = 0; row < UserX; row++){ 
row1 +=1;
}
// Gets row
for (int col = 0; col < UserY; col++){
col1 +=1;
} 
// Gets Column
System.out.println(Battleship[row1][col1]); 
if (Battleship[row1][col1].equalsIgnoreCase("Hit")){
TotalHits+=1;
}
// Checks if the String at that point is equal to Hit then adds to a Total Hit counter
else {
TotalMisses+=1;
}
// Otherwise it is added to this

}

System.out.println("Your Total amount of hits were " + TotalHits);
System.out.println("Your Total amount of Misses were " + TotalMisses);
// Just prints out total hits and misses
}




// TODO code application logic here
}