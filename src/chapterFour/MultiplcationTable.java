package chapterFour;

import java.util.Scanner;

public class MultiplcationTable {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("input any number to get the multiplication from 1 to 12 :  ");

        int number= input.nextInt();

        int count= 1;


        while (count <= 12){

            int multiplcation = number*count;

            System.out.printf("%d times %d is %d%n", number, count, multiplcation );

            count+=1 ;

        }
    }
}
