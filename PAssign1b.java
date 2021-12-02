/*
 * Matt Keplinger, CSCI 1301
 * PAssign1b, calculate triangle area given base and height, display output to user
 * 10 JUN 2018
 */
package passign1;

import java.util.Scanner;

public class PAssign1b {
        public static void main (String[] args) {

     //initialize scanner object
    Scanner scanner = new Scanner(System.in);

    //determine user input for base
    System.out.println("Enter a value for the base of the triangle: ");
    double base = scanner.nextDouble();
    
    //determine user input for height
    System.out.println("Enter a value for the height of the triangle: ");
    double height = scanner.nextDouble();
    
    //calculate area of triangle based on user inputs (base * height) /2
    double area = (base * height) / 2;
    System.out.println("A triangle with base of " + base + " and height of "
            + height + " has an area of " + area + ".");
  }        
}
