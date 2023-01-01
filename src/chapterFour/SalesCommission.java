package chapterFour;

import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSales=0;
        double commission=0;
        System.out.print("Enter the sales or -1 to end entry: ");
        int sales = scanner.nextInt();

        while (sales!=-1){

            totalSales=totalSales+sales;

            commission =200+ totalSales*0.09;

            System.out.print("Enter the sales or -1 to end entry: ");
            sales = scanner.nextInt();






        }

        System.out.println(totalSales);
        System.out.println("Your commission is "+"$"+commission);
    }
}
