//Daniel DePaul
//hw03
// this program is used to determine the volume of a block and the surface area of the a block
// the dimensions will be given by the user
// the volume and surface area will be printed to the screen

import java.util.Scanner;
public class Block {// normal class method start
    
public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);// prep scanner for input
    System.out.print(" Enter the length of the block:");  //ask for length
    double length = myScanner.nextDouble();
    System.out.print(" Enter the width of the block:");  //ask for length
    double width = myScanner.nextDouble();
    System.out.print(" Enter the height of the block:");  //ask for length
    double height = myScanner.nextDouble();
    double volume = length*width*height;
    double SA= (2*width*height)+(2*length*height)+(2*height*width);
    System.out.println("the volume of the block is " +volume+ "");
    System.out.println("the surface area of the block is  " +SA+ "");
    
    
}
}