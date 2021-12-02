/*
 * Matt Keplinger, CSCI 1301
 * 28 June, 2018 - PAssign6a.java
 * While-Loop version of grade classification and letter-grade inventory
 */
package passign6;

import java.util.Scanner;

public class PAssign6a {

    public static void main(String[] args) {
        int validGrade = 0, invalidGrade = 0, inputCounter = 0;
        int gradeA = 0, gradeB = 0, gradeC = 0, gradeD = 0, gradeF = 0;
        int userGrade = 0, maxGrade = 0, minGrade = 100, currentMax = 0, currentMin = 0;

        Scanner input = new Scanner(System.in);

        while (inputCounter < 100 && userGrade != -999) {
            System.out.print("Enter a grade from 0-100, -999 to stop: ");
            userGrade = input.nextInt();

            inputCounter++;
            if (userGrade >= 0 && userGrade <= 100 && userGrade != -999) {
                validGrade++;
                inputCounter++;
            } else if (userGrade != -999) {
                System.out.print("Error: That is not a valid Grade: ");
                invalidGrade++;
                inputCounter++;
            }
            if (userGrade >= maxGrade && userGrade < 100 && userGrade != -999) {
                maxGrade = userGrade;
                currentMax = userGrade;
            }
            if (userGrade <= minGrade && userGrade > 0 && userGrade != -999) {
                minGrade = userGrade;
                currentMin = minGrade;
            }
            if (userGrade <= 100 && userGrade >= 90 && userGrade != -999) {
                gradeA++;
            } else if (userGrade < 90 && userGrade >= 80 && userGrade != -999) {
                gradeB++;
            } else if (userGrade < 80 && userGrade >= 70 && userGrade != -999) {
                gradeC++;
            } else if (userGrade < 70 && userGrade >= 60 && userGrade != -999) {
                gradeD++;
            } else if (userGrade != -999) {
                gradeF++;
            }
        }
            //Output generation for valid responses    
            System.out.printf("\nValid grades:\t\t%d\n", validGrade);
            System.out.printf("Invalid grades:\t\t%d\n", invalidGrade);
            System.out.printf("Highest grade:\t\t%.2f\n", (double) maxGrade);
            System.out.printf("Lowest grade:\t\t%.2f\n\n", (double) minGrade);

            System.out.printf("As: %d\n", gradeA);
            System.out.printf("Bs: %d\n", gradeB);
            System.out.printf("Cs: %d\n", gradeC);
            System.out.printf("Ds: %d\n", gradeD);
            System.out.printf("Fs: %d\n", gradeF);
        }
    }

