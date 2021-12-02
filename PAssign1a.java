/*
 * Matt Keplinger, CSCI 1301
 * PAssign1a, calculate total cost of user input numbers of beverages and sandwiches, with fixed prices
 * then output total cost to user with beverage and sandwich quantity displayed
 * 10 JUN 2018
 */
package passign1;

import java.util.Scanner;

public class PAssign1a {
        public static void main (String[] args) {

     //initialize scanner object
    Scanner scanner = new Scanner(System.in);
  
    //declare variables for cost of beverages and sandwiches to be used in total cost calculation
    double beverageCost = .5;
    double sandwichCost = 2.75;
    
    //determine user input for number of beverages
    System.out.println("Enter a quantity for beverages: ");
    double beverages = scanner.nextDouble();
    
    //determine user input for number of sandwiches
    System.out.println("Enter a quantity for number of sandwiches: ");
    double sandwiches = scanner.nextDouble();
    
    //calculate total cost of beverages and sandwiches with fixed prices (.50 for beverage, 2.75 for sandwich) 
    
    double totalCost = (beverages * beverageCost) + (sandwiches * sandwichCost);
    
    //display output to user of total cost of beverages and sandwiches
        System.out.println("The total of " + beverages + " beverages and " +   sandwiches + " sandwiches is $" + totalCost + ".");

  }        
}