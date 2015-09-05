// Daniel J. DePaul
//cyclometer lab 2  
// September 4th 2015

// This program is used to show the use of basic arithmetic operations in java
// we will be simulating the use of a cyclometer
//inputs such as distance and time elapsed will be given and several outputs will be printed to the screen
public class Cyclometer {  //must be done at the start of any program
    public static void main(String [] args) {
    // input data
    int secstrip1=480; // time of trip 1
    int secstrip2=3220; // time of trip 2
    int countstrip1=1561; // counts in trip 1
    int countstrip2=9037; // counts in trip 2
    double wheeldiamter=27.0; // diamter of the wheel, each count represents one rotation of this wheel
    double PI= 3.14159; // constant pi
    int feetpermile=5280; // natural constants vv
    int inchesperfoot=12; //
    int secondsperminute=60;  //..
    double distancetrip1,distancetrip2,TD;// variables used to store distance values
    System.out.println("Trip1 took" + (secstrip1/secondsperminute)+" minutes and had " + countstrip1+ "counts."); // printing values to the screen
    System.out.println("Trip2 took" + (secstrip2/secondsperminute)+" minutes and had " + countstrip2+ "counts."); // ^^
    distancetrip1=countstrip1*wheeldiamter*PI ; // this gives distance in inches, each count is one rotation 
    distancetrip1/=inchesperfoot*feetpermile; // gives distance in miles
    distancetrip2=countstrip2*wheeldiamter*PI/inchesperfoot/feetpermile;
    TD= distancetrip1+distancetrip2;// intialize TD
    System.out.println("Trip1 was "+distancetrip1+" miles."); // print distances to screen
    System.out.println("Trip2 was "+distancetrip2+" miles.");
    System.out.println("The totaldistance was "+TD+" miles"); // print total distance to screen

    }// end of main method
}