//Daniel DePaul
//hw08
//this program will ask the user for what shape they want the area of, and then the paramters of the shape
// we will use a series of methods to accomplish this

import java.util.Scanner;

public class areas {
    public static void main(String[] args){
       Scanner myScanner= new Scanner(System.in);
       System.out.println("Shall we proceed? (press n or N to stop, press any key to continue) ");  // intial statement to contine or exit
        String X = myScanner.next();
    
    while(!(X.equals("n") || X.equals("N"))){  // lets us leave if user wants
        System.out.println("What shape do you want? enter 1,2 or 3 for a circle, rectangle , and trapezoid respectively");
        int choose= myScanner.nextInt();  //
        if (choose==1){ // we will use an if statement to help us specify and select which method we want to use 
            System.out.println("Please tell me the radius");  // here we look for the circle choice
            double radius = myScanner.nextInt(); // scan for input
            double goal = area(radius); // here we call the method
            System.out.println("The area of the circle " +goal); // print area
System.out.println("Shall we proceed? (press n or N to stop, press any key to continue) ");  // exit statement for loop
    X = myScanner.next();
            
        }
        else if(choose==2){
            System.out.println("Please let me know the length and width");  // if statement for rectangle
            System.out.println("Length? ");
            int length = myScanner.nextInt(); // grab inputs from user for length and width
            System.out.println("Width? ");
            int width = myScanner.nextInt();
            int goal2= area(length, width); // call rectangle method
            System.out.println("The area of the rectangle " +goal2);  // print area
            
            System.out.println("Shall we proceed? (press n or N to stop, press any key to continue) "); // exit statement for loop
    X = myScanner.next();
        }
        else if(choose==3){
            System.out.println("Please let me know what base1, base 2, and the height are");  // trapezoid if statement
            System.out.println("base1? "); // select base1, base2, and height from user
            double base1 = myScanner.nextInt();
            System.out.println("base2? ");
            double base2 = myScanner.nextInt();
            System.out.println("height? ");
            double height = myScanner.nextInt();
            double goal3= area(base1, base2, height);  // call method, we need a double in case we divide an odd number by 2 so we can get a decimal
            System.out.println("The area of the trapezoid " +goal3); // print area
            
            System.out.println("Shall we proceed? (press n or N to stop, press any key to continue) "); // exit statement for loop
    X = myScanner.next();

        }
        else {
            System.out.println("hey.... I said to pick 1,2, or 3... not cool");
            
            System.out.println("Shall we proceed? (press n or N to stop, press any key to continue) ");
    X = myScanner.next();
        }
        
    }
    }
    public static double area(double a){  // here are our methods, for the circle, rectangle, and trapezoid respectively
        System.out.println("you picked circle");
        return a*2*3.14;
    }
    public static int area(int length, int width){
        System.out.println("you picked rectangle");
        return  length*width;
    }
    public static double area(double base1, double base2, double height){
        System.out.println("you picked trapezoid ");
        return .5*(base1+base2)*height;
    }
}