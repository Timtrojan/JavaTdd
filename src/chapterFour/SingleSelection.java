package chapterFour;

import java.util.Scanner;

public class SingleSelection {
    public static void main(String[] args) {
        //collect input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int userInput= input.nextInt();
        //check input
        if (userInput > 10) {
            System.out.println("out of range");
        }
        else { if (userInput%2==0)
            System.out.println("this is even");
            else {
            System.out.println("this is odd");
        }
        }

    }
}