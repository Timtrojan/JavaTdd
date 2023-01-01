package chapterFour;

import java.util.Scanner;

public class GradeCalculations {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int counter = 0;
        int passTestResultCounter=0;
        int failTestResultCounter=0;
        while (counter <10){
            System.out.print("Enter test results: ");
            int testResults=scanner.nextInt();
            if (testResults==1) passTestResultCounter++;
            else if (testResults==2) failTestResultCounter++;

            counter++;

            }
        System.out.println(passTestResultCounter);
        System.out.println(failTestResultCounter);
        System.out.println(counter);
        System.out.println("The number of students who passed is "+ passTestResultCounter);
        System.out.println("The number of students that failed is "+failTestResultCounter);
        if (passTestResultCounter>8) System.out.println("Bonus to instructor");


        }


    }

