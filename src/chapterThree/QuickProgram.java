package chapterThree;

import java.util.Scanner;

public class QuickProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input first number: ");
        float firstNumber = scanner.nextFloat();
        System.out.print("input second number: ");
        float secondNumber = scanner.nextFloat();
        int count = 1;
        float power = firstNumber;

        while (count < secondNumber) {


            power = power * firstNumber;

            count += 1;

        }

        System.out.println(power);
    }

    private static void negativeExponent(float firstNumber, float secondNumber) {
        float power = firstNumber;
        int count = 1;
        while (count < secondNumber) {


            power = power * firstNumber;

            count += 1;


        }


    }
}

