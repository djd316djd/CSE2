//Daniel DePaul
// hw06
// this program prompts the user to input an integer, 
// it then prints a pyramid of stars, the number of layers being equal to the integer entered


import java.util.Scanner;

public class Pyramid {
    public static void main(String [] args){
        Scanner myScanner= new Scanner(System.in);
         System.out.println(" Enter the number of layers for a pyramid and I will create it  ");  // greeting
    double layers= myScanner.nextDouble();// declare layer number for later use
    
    double c1; // used to count layers in loop
    double c2; // used to determine number of stars to print
    double c3; // used for main loop
    
    for (c1=0; c1<layers; c1++){  // intial loop will allow us to count the layers
        for(c2=0; c2<layers-c1-1; c2++){
            System.out.print(" "); // prints spaces, this loop will print spaces before the stars
        }
        for(c3=layers-c1; c3<=layers; c3++){ // this loop is used to print part of the stars, since stars increase by 2 stars per level,
            System.out.print("*");  // this allows us to print the correct number of stars -1 star, the next loop will handle the last star
            
        }
        for(c3=layers-c1; c3<layers; c3++){
            System.out.print("*"); // lets us print the last star
        }
        for(c2=0; c2<layers-c1; c2++){
            System.out.print(" "); // print spaces after stars
            
        }
        System.out.print("\n"); // go to new line
        
    }
    
    }// end main loop
    
}