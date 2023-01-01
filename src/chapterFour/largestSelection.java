package chapterFour;

import java.util.Scanner;

public class largestSelection {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("input a number: ");
        int number= scanner.nextInt();
        int counter =1;
        int largestNumber=number;
        while(counter<10){

            System.out.print("input a number: ");
            number= scanner.nextInt();
            if (number>largestNumber) largestNumber=number;

            System.out.println(counter);
            System.out.println(number);
            System.out.println(largestNumber);

            counter++;


        }




    }
}
