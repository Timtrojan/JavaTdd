package chapterFour;

import java.util.Scanner;

public class QuickProgramTwo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number : ");
        float input= scanner.nextFloat();
        float count=1;
        float total=0;
        while (count<=input){
             total+= (1/count);


            count+=1;

        }
        System.out.println(total);

    }
}
