/*
 * Matt Keplinger, CSCI 1301
 * PAssign3.java, Zero QTY disallow on beverage/sandwich program from PAssign1a
 * 17 June 2018, 
 */
package passign3;

import java.util.Scanner;

public class PAssign3 {

    public static void main(String[] args) {

        //initialize scanner object
        Scanner scanner = new Scanner(System.in);

        //declare variables for cost of beverages and sandwiches to be used in total cost calculation
        double beverageCost = .5;
        double sandwichCost = 2.75;
        double beverages = 0, sandwiches = 0;
        double totalCost = 0;

        //determine user input for number of beverages
        System.out.println("Enter a quantity for beverages: ");
        beverages = scanner.nextDouble();
        if (beverages <= 0) {
            System.out.println("Your order total could not be calculated due to a zero quantity for an item.");
            System.out.println("Enter a quantity for beverages: ");
            beverages = scanner.nextDouble();
            System.out.println("Enter a quantity for number of sandwiches: ");
            sandwiches = scanner.nextDouble();
        } else if (sandwiches <= 0 && beverages < 0) {
            System.out.println("Your order total could not be calculated due to a zero quantity for an item.");
            //System.out.println("Enter a quantity for beverages: ");
            //beverages = scanner.nextDouble();
            System.out.println("Enter a quantity for number of sandwiches: ");
            sandwiches = scanner.nextDouble();
        } else if (sandwiches <= 0 && beverages >= 1) {
            System.out.println("Your order total could not be calculated due to a zero quantity for an item.");
            System.out.println("Enter a quantity for number of sandwiches: ");
            sandwiches = scanner.nextDouble();
        } else if (sandwiches == 0 && beverages == 0) {
            System.out.println("Your order total could not be calculated due to a zero quantity for an item.");
//        } else if (sandwiches > 0 && beverages > 0) {
//            //calculate total cost of beverages and sandwiches with fixed prices (.50 for beverage, 2.75 for sandwich) 
//            totalCost = (beverages * beverageCost) + (sandwiches * sandwichCost);
//            System.out.println("The total of " + beverages + " beverages and " + sandwiches + " sandwiches is $" + totalCost + ".");
        } else {
            //calculate total cost of beverages and sandwiches with fixed prices (.50 for beverage, 2.75 for sandwich) 
            totalCost = (beverages * beverageCost) + (sandwiches * sandwichCost);
            System.out.println("The total of " + beverages + " beverages and " + sandwiches + " sandwiches is $" + totalCost + ".");

        }
    }
}
