import java.util.Scanner;

public class LargestSmallest{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        double largestNumber=Double.NEGATIVE_INFINITY;
        double  smallestNumber= Double.POSITIVE_INFINITY;


        System.out.print("Do you want to enter a number, yes or enter end to stop: ");

        String condition = input.nextLine();


        while (condition.equals("end") !=true) {

            System.out.print("Enter a number : ");
            int number = input.nextInt();

            if (number > largestNumber) {
                largestNumber = number;
            }
            if (number < smallestNumber) {
                smallestNumber = number;

            }

            input.nextLine();

            System.out.print("Do you want to enter a number, yes or enter end to stop : ");

            condition = input.nextLine();



        }



        System.out.printf("the largest number is %f%n", largestNumber);
        System.out.printf("the smallest number is %f%n" , smallestNumber);



    }


}