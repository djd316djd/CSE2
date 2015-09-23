//Daniel J. DePaul
//lab04
//this program is a calculator that prompts the user to enter two integers and what operation they want performed on them
// this program makes use of the switch statment 


import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
    Scanner myScanner = new Scanner(System.in);
    System.out.print(" Enter an integer to be operated on: ");  //ask for A
    double first = myScanner.nextDouble();
    System.out.print(" Enter a second integer that will be operating");  //ask for B
    double second = myScanner.nextDouble();
    System.out.print(" Enter the operation");  //ask for what operation to perform
    char Q = myScanner.next().charAt(0);  // we will scan for 4 specific chars, the operators, anything else will give invalid
    
     switch(Q){// start our switch statement, we will check what operation was stored in q and then display results when a switch is hit
     case '+':
          System.out.println("Addition of A and B"); // we have shown the case
          double Addition= first+second;    // operation
          System.out.println(" A+B= " +Addition+ " "); // print
          


     break;
     case '-':
        System.out.println("Subtraction of A and B");  // case shown
        double Subtraction = first-second; // operation 
               System.out.println(" A-B= " +Subtraction+ " "); //print output
   break;
   case '*':
        System.out.println("Multiplication of A and B");
        double Multiplication= first*second;
               System.out.println(" A*B= " +Multiplication+ " ");
   break;
   case '/':
        System.out.println("Division of A and B");
        double Division= first/second;
               System.out.println(" A/B= " +Division+ " ");
    break;
    default:
    System.out.println("Invalid Operator!");  // in case of trolls
    break;
}
}
}