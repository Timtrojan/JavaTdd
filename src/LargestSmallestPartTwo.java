import java.util.Scanner;

public class LargestSmallestPartTwo {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.print("Input a number : ");
        int number= in.nextInt();

        int largest= number ;
        int smallest = number;



        while (number!= 0) {






            if (number > largest) largest = number;
            if (number < smallest) smallest = number;

            System.out.print("Input another number : ");
            number= in.nextInt();



        }
        System.out.println(largest);
        System.out.println(smallest);

    }

}
