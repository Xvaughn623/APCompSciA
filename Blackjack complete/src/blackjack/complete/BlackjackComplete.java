package x.s.blackjack;

import java.util.Scanner;
import java.util.Random;
// Importing Scanner and Random
/**
*
* @author 2019282
*/
public class XSBlackJack {

/**
* @param args the command line arguments
*/
public static void main(String[] args) {
Scanner CarrybotS = new Scanner(System.in);

int PTotal = 0; // Player Total
int PTemp = 0; // Basically The Value of the Player's Card
int DTotal = 0; // Dealer's Total
int DTemp = 0; // Value of the Dealer's Card
String Name; // Name of Player
String CardName = "JESTER"; // Temporary Name for Players Card
String DCardName = "JASTER"; // Temporary Name for Dealer's Card
String OptionS = "No"; 
String Hit = "Yes";
String UHit = "Ok";
// Declaring Variables to use later on in code

System.out.println("Hello, My name is Carrybot, what is yours? ");
Name = CarrybotS.next();
System.out.println("Okay " + Name + " today we are playing BlackJack!");
// Asking for name of player, adds Depth
do{

System.out.println("Type Yes to Start and type No to wait a bit.");
// Asking user whether to start game or to "Gussy up" before challenging such a hard program
OptionS = CarrybotS.next();




try {
Thread.sleep(1000);

}
catch(InterruptedException ex){
Thread.currentThread().interrupt();
}
// pause





} while(OptionS.equalsIgnoreCase("No"));
// Activates if not ready

do{ //(1)
// I shall Label these by numbers, the same number means its a part of the same do while, theres a lot nestled into one another
// runs program due to preset OK, when you select that you are ready
PTemp = CNB(PTemp);
CardName = CN(PTemp);
PTemp = PC(PTemp);

PTotal = PTemp + PTotal;

System.out.println("Your first Card is " + CardName );
System.out.println("Your total is " + PTotal);
// First Card automatically Drawn for player



try {
Thread.sleep(3000);

}
catch(InterruptedException ex){
Thread.currentThread().interrupt();
}




// Slow down program to make it more playable and seeable
PTemp = CNB(PTemp);
CardName = CN(PTemp);
PTemp = PC(PTemp);
PTotal = PTemp + PTotal;
System.out.println("Your Second Card is " + CardName );
System.out.println("Your total is " + PTotal);
// Second Card automatically Drawn for player



try {
Thread.sleep(3000);

}
catch(InterruptedException ex){
Thread.currentThread().interrupt();
}
// Pause




// again, sleep
DTemp = DNB(DTemp);
DCardName = DCN(DTemp);
DTemp = DPC(DTemp, DTotal);
DTotal = DTemp + DTotal;
System.out.println(" The dealer's first card seems to be a " + DCardName + " while his mysterious second card remains hidden to you");
System.out.println("The Dealer's current total is " + DTotal);
// Dealer's first Card

DTemp = DNB(DTemp);
DCardName = DCN(DTemp);
DTemp = DPC(DTemp, DTotal);
DTotal = DTemp + DTotal;
// Dealer's Second card

// Sets up Dealer's first and second Cards


do{ // Asks if user Wants to continue to hit or stay 
if (PTotal > 21){
System.out.println("YOU BUST!");
System.exit(0);
}
else {

}
do{
System.out.println("Would you like to Hit or stay?");
Hit = CarrybotS.next();

} while ( !Hit.equalsIgnoreCase("Hit") && !Hit.equalsIgnoreCase("Stay"));
// asking if user wants to hit or keep cards


if (Hit.equalsIgnoreCase("Hit")){
PTemp = CNB(PTemp);
CardName = DCN(PTemp); // Process of getting a new Card
PTemp = PC(PTemp);
PTotal = PTemp + PTotal;
System.out.println("Your Card is " + CardName );
System.out.println("Your total is " + PTotal);
Hit = "No Hit"; // this is what sets the parameters for unlocking the process to hit or stay
// Resets it so it asks again
continue; // goes on to check parameters of continuing
}
else {


break; // breaks when you say "Stay"
}

} while(OptionS.equalsIgnoreCase("Yes"));

UHit = "Carrybot = Illuminati"; // If you dont say stay or lose, this is what cycles the whole process again
} while ( UHit.equalsIgnoreCase("OK")); // (1)
System.out.println("Looks like the Dealer's hidden second card was a " + DCardName);
System.out.println("While his current total is " + DTotal);
DTotal = DTotal;
System.out.println(DTotal);
// Reveals hidden card if you dont bust
do{


DTemp = DNB(DTemp);
DCardName = DCN(DTemp);
DTemp = DPC(DTemp, DTotal);
DTotal = DTemp + DTotal;
System.out.println(" The Dealer Drew a " + DCardName + "!");
System.out.println("Making his new total " + DTotal);

}while (DTotal < 16);
// this whole process makes it so the dealer always gets a new card if his total is less than 16
System.out.println("Your total is " + PTotal); // says your total
System.out.println("The Dealer's total is " + DTotal); // says dealer's total
if (DTotal > 21){
System.out.println("DEALER BUSTED! YOU WIN!");
}
else if (PTotal > DTotal){
System.out.println("Congratulations! You beat the Dealer!");
}
else if (PTotal < DTotal){
System.out.println("AWW, Better Luck next time, you lost!");
}
else if (PTotal == DTotal){
System.out.println("You tied with the Dealer! Unfortunately, that means you lost! better Luck next time!");
}
// All the possible pathways to the endings


System.out.print("FIN");
// Fancy way to say end
}

public static int PC(int PTemp){
Scanner CarrybotS = new Scanner(System.in);

switch (PTemp) {
case 12:
PTemp = 10;
break;
case 13:
PTemp = 10;
break;
case 14:
PTemp = 10;
break;
case 11:
System.out.println("Would you like to have an 11 or a 1 for that Ace?");
PTemp = CarrybotS.nextInt();
break;
default:
PTemp = PTemp;
break;
}
return PTemp;
} // sets player face cards equal to 10 and asks what you'd like your Ace to be

public static String CN(int PTemp){
String CardName;
CardName = String.valueOf(PTemp);
switch (PTemp) {
case 1:
CardName = "\n|--------------------|\n"
+ "| |\n"
+ "| |\n"
+ "| 1 |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "|--------------------|";
break;
case 2:
CardName = "\n|--------------------|\n"
+ "| |\n"
+ "| |\n"
+ "| 2 |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "|--------------------|";
break;
case 3:
CardName = "\n|--------------------|\n"
+ "| |\n"
+ "| |\n"
+ "| 3 |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "|--------------------|";
break;
case 4:
CardName = "\n|--------------------|\n"
+ "| |\n"
+ "| |\n"
+ "| 4 |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "|--------------------|";
break;
case 5:
CardName = "\n|--------------------|\n"
+ "| |\n"
+ "| |\n"
+ "| 5 |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "|--------------------|";
break;
case 6:
CardName = "\n|--------------------|\n"
+ "| |\n"
+ "| |\n"
+ "| 6 |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "|--------------------|";
break;
case 7:
CardName = "\n|--------------------|\n"
+ "| |\n"
+ "| |\n"
+ "| 7 |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "|--------------------|";
break;
case 8:
CardName = "\n|--------------------|\n"
+ "| |\n"
+ "| |\n"
+ "| 8 |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "|--------------------|";
break;
case 9:
CardName = "\n|--------------------|\n"
+ "| |\n"
+ "| |\n"
+ "| 9 |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "|--------------------|";
break;
case 10:
CardName = "\n|--------------------|\n"
+ "| |\n"
+ "| |\n"
+ "| 10 |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "|--------------------|";
break;

case 12:
CardName = "\n|--------------------|\n"
+ "| |\n"
+ "| |\n"
+ "| Jack |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "|--------------------|";
break;
case 13:
CardName = "\n|--------------------|\n"
+ "| |\n"
+ "| |\n"
+ "| Queen |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "|--------------------|";
break;
case 14:
CardName = "\n|--------------------|\n"
+ "| |\n"
+ "| |\n"
+ "| King |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "|--------------------|";
break;
case 11:
CardName = "\n|--------------------|\n"
+ "| |\n"
+ "| |\n"
+ "| Ace |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "|--------------------|";
break;
default:
break;
// Basically the Graphics for all the cards the player has
}
return CardName;


}
public static int CNB(int PTemp){

Random CarrybotR = new Random();

PTemp = CarrybotR.nextInt(14) + 1;
return PTemp;
// Gets all the Randoms for the Player
}

public static int DNB(int DTemp){
Random CarrybotR = new Random();

DTemp = CarrybotR.nextInt(14) + 1;
return DTemp;
}
// Gets all the randoms for the Dealer

public static String DCN(int DTemp){
String DCardName;
DCardName = String.valueOf(DTemp);
switch (DTemp) {
case 1:
DCardName = "\n|--------------------|\n"
+ "| |\n"
+ "| |\n"
+ "| 1 |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "|--------------------|";
break;
case 2:
DCardName = "\n|--------------------|\n"
+ "| |\n"
+ "| |\n"
+ "| 2 |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "|--------------------|";
break;
case 3:
DCardName = "\n|--------------------|\n"
+ "| |\n"
+ "| |\n"
+ "| 3 |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "|--------------------|";
break;
case 4:
DCardName = "\n|--------------------|\n"
+ "| |\n"
+ "| |\n"
+ "| 4 |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "|--------------------|";
break;
case 5:
DCardName = "\n|--------------------|\n"
+ "| |\n"
+ "| |\n"
+ "| 5 |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "|--------------------|";
break;
case 6:
DCardName = "\n|--------------------|\n"
+ "| |\n"
+ "| |\n"
+ "| 6 |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "|--------------------|";
break;
case 7:
DCardName = "\n|--------------------|\n"
+ "| |\n"
+ "| |\n"
+ "| 7 |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "|--------------------|";
break;
case 8:
DCardName = "\n|--------------------|\n"
+ "| |\n"
+ "| |\n"
+ "| 8 |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "|--------------------|";
break;
case 9:
DCardName = "\n|--------------------|\n"
+ "| |\n"
+ "| |\n"
+ "| 9 |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "|--------------------|";
break;
case 10:
DCardName = "\n|--------------------|\n"
+ "| |\n"
+ "| |\n"
+ "| 10 |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "|--------------------|";
break;

case 12:
DCardName = "\n|--------------------|\n"
+ "| |\n"
+ "| |\n"
+ "| Jack |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "|--------------------|";
break;
case 13:
DCardName = "\n|--------------------|\n"
+ "| |\n"
+ "| |\n"
+ "| Queen |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "|--------------------|";
break;
case 14:
DCardName = "\n|--------------------|\n"
+ "| |\n"
+ "| |\n"
+ "| King |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "|--------------------|";
break;
case 11:
DCardName = "\n|--------------------|\n"
+ "| |\n"
+ "| |\n"
+ "| Ace |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "| |\n"
+ "|--------------------|";
break;
default:
break;
// Basically the Graphics for all the cards the Dealer has
}
return DCardName;
}
public static int DPC(int DTemp, int DTotal){
Scanner CarrybotS = new Scanner(System.in);

switch (DTemp) {
case 12:
DTemp = 10;
break;
case 13:
DTemp = 10;
break;
case 14:
DTemp = 10;
break;
case 11:
if (DTotal <= 10){
DTemp = 11;
}
else{
DTemp = 1;
}
break;
default:
DTemp = DTemp;
break;
}
return DTemp;
}

// Extra measures for the dealer, sets the face cards equal to 10 and Ace equal to whatever

 

 

 

 

 


}