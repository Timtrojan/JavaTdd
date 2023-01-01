package chapterFour;

import java.util.Scanner;

public class RightAngledTriangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter length of base: ");

        int baseOfTriangle= scanner.nextInt();

        if (baseOfTriangle>0 && baseOfTriangle<=10) {


            int counter = 1;
            while (counter <= baseOfTriangle) {
                for (int i = 1; i <= counter; i++) {
                    System.out.print("* ");
                }

                System.out.println();

                counter++;

            }
        }
        else System.out.println("not valid");
    }
}
