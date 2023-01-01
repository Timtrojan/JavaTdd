package chapterFour;

import java.util.Scanner;

public class GradeCalcNew {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int grade=0;
        int gradeSum=0;
        int counter=0;
        System.out.print("Enter scores: ");
        grade= scanner.nextInt();


        while (grade!=-1){

            gradeSum=gradeSum+grade;
            counter++;

            System.out.print("Enter scores: ");
            grade= scanner.nextInt();




        }

        System.out.println(counter);
        System.out.println(gradeSum);
        System.out.println((double)gradeSum/counter);
    }
}
