package chapterFour;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter a number between 10000 and 99999: ");
        int number = scanner.nextInt();

        while (number<10000 || number>99999){
            System.out.println("Not a valid entry");

            System.out.print("Enter a number between 10000 and 99999: ");
            number = scanner.nextInt();

        }



            int firstNumber=number/10000;
            int lastNumber=number%10;
            int secondNumber=(number/1000)%10;
            int secondToTheLastNumber=(number%100)/10;
            if(firstNumber==lastNumber&&secondNumber==secondToTheLastNumber) System.out.println(number+ " is a palindrome");
            else System.out.println(number +" is not a palindrome");







    }
}
