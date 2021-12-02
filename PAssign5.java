/*
 * Matt Keplinger, CSCI 1301
 * 25June2018, PAssign5.java
 * User-entered string information with string manipulation
 */
package passign5;

import java.util.Scanner;

public class PAssign5 {

    public static void main(String[] args) {

        //declare variables for choice of operator, character of operator, and the inputs and result
        String userInput = "", userChoice = "";
        int count = 0;
        Scanner input = new Scanner(System.in);
        while (count < 100) {

        //gather and store user input for string
        System.out.print("Enter a string: ");
        userInput = input.next();

        //Build choice menu
        System.out.printf("\nInformation about %s: \n", userInput);
        System.out.printf("(L)ength\n");
        System.out.printf("(F)irst Letter\n");
        System.out.printf("L(a)st Letter\n");
        System.out.printf("\"(M)iddle\" Letter\n");
        System.out.printf("Choice: ");
        userChoice = input.next();
       
        
        //first, last, and length are fairly straightforward, middle letter using Math.floor to establish lower bound, and math.floor + 1 for upper bound. 
        //assigned the userInput substring with established beginIndex and endIndex to string midLetter for String.format 
        if (userChoice.charAt(0) == 'l' || userChoice.charAt(0) == 'L'){
             System.out.print("\nLength of " + userInput + ": " + userInput.length() + "\n");          
        } else if (userChoice.charAt(0) == 'a' || userChoice.charAt(0) == 'A') {
            System.out.print("\nLast Letter of " + userInput + ": " + userInput.substring(userInput.length() - 1) + "\n");
        } else if (userChoice.charAt(0) == 'f' || userChoice.charAt(0) == 'F'){
             System.out.print("\nFirst Letter of " + userInput + ": " + userInput.charAt(0)+ " \n");
        } else if (userChoice.charAt(0) == 'm' || userChoice.charAt(0) == 'M'){
            int midL = (int)Math.floor(userInput.length()/2);
            String midLetter = userInput.substring(midL, midL + 1);
            System.out.printf("\n\"Middle\" Letter of %s: %s\n",userInput,midLetter);       
        }else{
            System.out.println("\nInvalid choice");
            }
        }
    }
}
