/*
 * Matt Keplinger, CSCI 1301
 * Weighted average calculator for grades
 * PAssign2.java, 11 June 2018
 */
package passign2;

import java.util.Scanner;

public class PAssign2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //declare floats for weighted values
        double revelW = .15, liveLabW = .2, exam1W = .1, exam2W = .15, exam3W = .15, finalExamW = .25;
        //declare doubles for grade values
        double revel = 0, liveLab = 0, exam1 = 0, exam2 = 0, exam3 = 0, finalExam = 0;
        //declare variable i for counter, increment operation
        int i = 0; 
        //declare double for storing overall grade average
        double finalAverage = 0;
       
        
        //user input grade values, counter keeps track of grades entered
        System.out.print("Enter a grade value for Revel: ");
        revel = input.nextDouble();
        i++;
        
        System.out.print("Enter a grade value for LiveLab: ");
        liveLab = input.nextDouble();
        i++;
        
        System.out.print("Enter a grade value for Exam 1: ");
        exam1 = input.nextDouble();
        i++;
        
        System.out.print("Enter a grade value for Exam 2: ");
        exam2 = input.nextDouble();
        i++;
        
        System.out.print("Enter a grade value for Exam 3: ");
        exam3 = input.nextDouble();
        i++;
        
        System.out.print("Enter a grade value for Final Exam: ");
        finalExam = input.nextDouble();
        i++;
        
        
        //formula for calculating average on finalAverage variable
        finalAverage = (revel * revelW + liveLab * liveLabW + exam1 * exam1W + exam2 * exam2W + exam3 * exam3W + finalExam * finalExamW) * 1;
        
        //output display of counter, finalAverage
        System.out.println("There were " + i + " grades entered.");
        System.out.println("The final grade for this course is " + finalAverage + ".");
    }
    
}
