//Daniel DePaul
//hw 03

// this program is to be used as a timer
//it asks for input from the user,
// it asks for what time it is.. and when dinner is, and tells them how much time they have before dinner


import java.util.Scanner;

public class Timer{
    // main method
    public static void main(String[] args) {
        Scanner myScanner = new Scanner ( System.in); // prep scanner for input
        System.out.print("What time is it now?  "); // ask user for current time
        double cTime = myScanner.nextDouble(); // store value from user input in this double cTime
        double cTimeref = cTime/100; // allows us to separate minutes and hours by a decimal point 
        long icTime = (long)cTimeref; // separate hours from minutes
        double fcTime = (cTimeref-icTime)*100; // isolate minutes in a varibale 
        System.out.print("What time is dinner?  "); // ask user for dinner time
        double dTime = myScanner.nextDouble();
        double dTimeref= dTime/100;
        long idTime =(long)dTimeref;
        double fdTime = (dTimeref-idTime)*100;  // as before separate hours from mintes
        double minutes= fdTime-fcTime;  // and the minutes value we want
        double hours =dTimeref-cTimeref; // now we have the hours value we want
        int hours1= (int)hours;
        System.out.println("The time until dinner is " +hours1+ " hours and " +minutes+ "minutes.");
        // end main method
        

        
        
        
    }
}