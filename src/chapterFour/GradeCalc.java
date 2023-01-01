package chapterFour;

import java.util.Scanner;

public class GradeCalc {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int counter =0 ;
        int scoreSum=0;

        while (counter<10){

            System.out.print("Enter the scores: ");
            int scores=scanner.nextInt();
            scoreSum= scoreSum+scores;
            counter++;

        }
        System.out.println(counter);
        System.out.println(scoreSum);
        System.out.println((double) scoreSum/counter);
    }
}
