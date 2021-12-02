/*
 * Matt Keplinger, CSCI 1301
 * PAssign7.java
 * 08 July 2018
 * Pyramid increase/decrease with user input of positive integer
 *
 */
package passign7;

import java.util.Scanner;

public class PAssign7 {

    public static void main(String[] args) {
        int rows = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive maximum value for the pattern: ");
        rows = input.nextInt();
        
        while(rows < 1){
            System.out.print("Please enter a positive value.\n");
            System.out.print("\nEnter a positive maximum value for the pattern: ");
            rows = input.nextInt();
        }

        //start nested loop structures for patterns
        System.out.print("\nPattern A: \n");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.print("\nPattern B: \n");
        for (int i = rows; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.print("\nPattern C: \n");
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.print("\nPattern D: \n");
        for (int i = rows; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

