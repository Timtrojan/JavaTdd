package chapterFour;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input a number: ");
        int number = input.nextInt();
        int counter = 1;
        int largestNumber = number;
        int secondLargest=0;
        while (counter < 10) {

            System.out.print("input a number: ");
            number = input.nextInt();

            if (number > largestNumber) {
                secondLargest=largestNumber;
                largestNumber = number;}





            counter++;
        }
        System.out.println("the total count is "+counter);
        System.out.println("the last entered number is "+number);
        System.out.println("The second largest number is "+secondLargest);
        System.out.println("The largest number is "+largestNumber);
    }
}
