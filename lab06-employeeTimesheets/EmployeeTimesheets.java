// Daniel J DePaul
// lab 06
// this program accepts much user input
// user will input pay for workers and hours worked for each employee, and number of employees
// the program will output the total pay 

import java.util.Scanner;

public class EmployeeTimesheets {
    public static void main(String[] args){  // normal starting method
    Scanner myScanner= new Scanner(System.in);
    System.out.println("enter the number of employees up in here ");
    int nEmp= myScanner.nextInt(); // number of employees
    double pay; // pay for the working being input for
    double hours;// time worked by employee for a given day
    double totalhours=0; // sum of hours for an employee
    double totalcost=0;
    double totalpay=0;// total pay for worker
    double truefinal=0; // cost to employer
    for (int i=0; i<nEmp; i++){ // employee loop
       for (int j=0; j<1; j++){ // compute pay loop runs once per employee
        System.out.println("How much he makin? ") ;
        pay= myScanner.nextDouble();
        totalpay=0;
        totalhours=0;
            for(int z=0; z<5; z++){  // days of week loop runs 5 times 
            System.out.println("how long he working? (enter 1 value for each day, Monday to Friday)");
            hours=myScanner.nextDouble();
            totalhours=totalhours +hours; // total time worked
            
            }
        totalpay=totalhours*pay;// total pay of individual employee
        
        }
        truefinal= truefinal+totalpay;// compile final pay cost to employer
    }
    System.out.println(" total employee pay is: " +truefinal); // print final cost to employer
    
    
   
    
        
    }
}