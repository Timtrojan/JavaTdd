package chapterThree;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int count = 1;
        int sum = 0;

        while (count <=10) {

            switch (count) {

                case 1:
                    System.out.print("Enter 1st grade: ");

                    int grade = scanner.nextInt();
                    sum = sum + grade;
                    break;

                case 2:
                    System.out.print("Enter 2nd grade: ");

                    grade = scanner.nextInt();
                    sum = sum + grade;
                    break;

                case 3:
                    System.out.print("Enter 3rd grade: ");
                    grade = scanner.nextInt();
                    sum = sum + grade;
                    break;


                case 4:
                    System.out.print("Enter 4th grade: ");
                    grade = scanner.nextInt();
                    sum = sum + grade;
                    break;


                case 5:
                    System.out.print("Enter 5th grade: ");
                    grade = scanner.nextInt();
                    sum = sum + grade;
                    break;
                case 6:
                    System.out.print("Enter 6th grade: ");
                    grade = scanner.nextInt();
                    sum = sum + grade;
                    break;
                case 7:
                    System.out.print("Enter 7th grade: ");
                    grade = scanner.nextInt();
                    sum = sum + grade;
                    break;
                case 8:
                    System.out.print("Enter 8th grade: ");
                    grade = scanner.nextInt();
                    sum = sum + grade;
                    break;
                case 9:
                    System.out.print("Enter 9th grade: ");
                    grade = scanner.nextInt();
                    sum = sum + grade;
                    break;
                case 10:
                    System.out.print("Enter 10th grade: ");
                    grade = scanner.nextInt();
                    sum = sum + grade;

                    break;

            }

            count += 1;
        }
        System.out.println(sum);
        System.out.println(count);
        System.out.println("Average score is" + " " + (sum /( count-1)));

    }
}
