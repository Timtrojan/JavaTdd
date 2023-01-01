package chapterFour;

import java.util.Scanner;

public class CheckerBoardPattern {
    public static void main(String[] args) {

        int counter = 1;
        while (counter<=8){
            for (int i =1; i<=8; i++){
                System.out.print("* ");
            }
            for (int j =1; j<=8;j++){
                if (j==2)
                System.out.print(" ");
                break;

            }

            System.out.println();
            counter++;



        }







    }
}
