package chapterThree;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("Input a number between 1 to 11: ");
        int input=scanner.nextInt();

        switch (input){

            case 1 :
                System.out.println("you are a goalkeeper");
                break;

            case 2:

            case 3:



            case 4:


            case 5:
                System.out.println("you are a defender");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("you are a midfielder");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("you are an attacker");
                break;
            default:
                System.out.println("you are a farmer");


        }
    }
}
