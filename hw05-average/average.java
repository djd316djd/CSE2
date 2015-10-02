//Daniel DePaul
// homework 5
// this program averages "grades" given by the user between 0 and 100 and prints the average value of the grades when 999 is enter

// this program will not tolerate inputs below 0 and 100

import java.util.Scanner;

public class average {
    public static void main(String [] args){
         Scanner myScanner = new Scanner(System.in);
    System.out.println(" Enter a value of a grade between 0 and 100 (press 999 to compile average) ");  // intial statement to contine or exit
    double input;// declare inout
            

    double average1;  // declare my variables in outer scope
    double total=0;
    double counter=0;
    

    while ((input= myScanner.nextDouble() ) != 999) {  // begin loop, 999 is exit statement
        if (input  >= 0 && input <= 100) {
             total = total +input; // add inputs to total
            counter++;

            } else  {
            System.out.println ("Not cool man... I specifically said NOT to do that.."); 
}
        
    

        
    }
    average1= total/counter; // how someone gets an average
    System.out.println("the average of the grades is: " +average1);
        System.out.println("See ya mike");


}
    }
