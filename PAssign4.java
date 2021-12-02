/*
 * Matt Keplinger, CSCI 1301
 * PAssign4.java
 * Coordinate point checker, 2-plane (x,y) for user input points inside a rectangle
 * 20 June, 2018
 */
package passign4;

import java.util.Scanner;

public class PAssign4 {

    public static void main(String[] args) {
        int width = 0, height = 0;
        int centerX = 0, centerY = 0;
        int userX = 0, userY = 0;

        Scanner input = new Scanner(System.in);

        //Print outputs of variables for user to verify against inputs
        System.out.print("Enter width for Rectangle: ");
        width = input.nextInt();
        System.out.print("Enter height for Rectangle: ");
        height = input.nextInt();

        if (width <= 0 || height <= 0) {
            System.out.print("Your rectangle must have a positive height and width.");
        } else {

            System.out.print("Enter x value for center point of rectangle: ");
            centerX = input.nextInt();
            System.out.print("Enter y value for center point of rectangle: ");
            centerY = input.nextInt();

            System.out.print("Enter x value for point: ");
            userX = input.nextInt();
            System.out.print("Enter y value for point: ");
            userY = input.nextInt();
            // System.out.println("Point (" + userX + ", " + userY + ") is in the rectangle.");

            //distance X and Y from center
            double distX = Math.pow(userX - centerX, 2);
            double distY = Math.pow(userY - centerY, 2);
            double horizDist = Math.sqrt(distX);
            double vertDist = Math.sqrt(distY);

            if (horizDist <= width / 2 || vertDist <= height / 2) {
                    System.out.println("Point (" + (double) userX + ", " + (double) userY + ") is in the rectangle.");
                } else if (vertDist > height / 2 || horizDist > width / 2) {
                    System.out.println("Point (" + (double) userX + ", " + (double) userY + ") is not in the rectangle.");
                }
            }
        }
    }
