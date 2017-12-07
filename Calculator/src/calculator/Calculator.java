/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculator;
import java.util.Scanner;

/**
 *
 * @author 2019282
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double X; // Variable for first number used
        double Y; // Variable for Second number used
        int C; // Variable for which operation the user wants
        String Name; // Variable for user's name
        
        
        
        System.out.println("Hello User, my name is carrybot. what is yours?"); // Start of code, introductory code
        Scanner Carrybot = new Scanner(System.in); // Creating a new Scanner, import is above
        Name = Carrybot.next(); // Getting Name
        System.out.println("Hello " + Name + " as a calculator i can do 4 things, I can add(1), I can Subtract(2), I can Multiply(3), and I can Divide(4) Please select what you would operation you would like to preform.");
        C = Carrybot.nextInt(); // Getting the Operation the user wishes to preform
        
        if (C == 1){ // Addition Part
          System.out.println(Name + " Please input the First number you would like me to add to the nearest decimal place.");
                X = Carrybot.nextDouble(); // Getting first number
            System.out.println(Name + " Please input the Second number you would like me to add to the nearest decimal place.");
                Y = Carrybot.nextDouble(); // Getting Second Number
            double Add = Add(X , Y); // Declaring an Operation and Making it exist within the program
            System.out.println(Add(X , Y)); // Sending an order to preform an operation and plug it in here
        }
            else if (C == 2){
            System.out.println(Name + " Please input the First number you would like me to Subtract to the nearest decimal place.");
                 X = Carrybot.nextDouble();
            System.out.println(Name + " Please input the Second number you would like me to add to the nearest decimal place.");
                 Y = Carrybot.nextDouble();
                 double Subtract = Subtract (X , Y);
                 System.out.println(Subtract(X, Y));
        
                         }
            else if (C == 3){
                System.out.println(Name + " Please input the First number you would like me to Multiply to the nearest decimal place.");
                   X = Carrybot.nextDouble();
                System.out.println(Name + " Please input the Second number you would like me to Multiply to the nearest decimal place.");
                   Y = Carrybot.nextDouble();
                double Multiply = Multiply (X , Y);
                        System.out.println(Multiply(X , Y));
            }
            else if (C == 4){
                System.out.println(Name + " Please input the First number you would like me to Divide to the nearest decimal place.");
                   X = Carrybot.nextDouble();
                System.out.println(Name + " Please input the Second number you would like me to Divide to the nearest decimal place.");
                   Y = Carrybot.nextDouble();
                   double Division = Division(X , Y);
                   System.out.println(Division(X , Y));
            }
            else{
                System.out.println("I am sorry, that was not one of the values I gave to you, please Restart the Program and try again.");
            }       
                         
        // TODO code application logic here
            }
    
public static double Add(double X, double Y) {
    double Z;
    Z = (X + Y);
      return Z;
    
}

public static double Subtract(double X, double Y){
     double Z;   
        Z = (X - Y);
return Z;
}


public static double Multiply(double X, double Y){
    double Z;
Z = (X * Y);
return Z;

}
public static double Division(double X, double Y){

    double Z;
Z = (X / Y);
return Z;

}
}