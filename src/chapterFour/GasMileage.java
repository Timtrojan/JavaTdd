package chapterFour;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);



        double totalMpgPerTrip=0;

        int trip=0;


        while (trip!=-1){
            System.out.print("Enter Travelled Miles: ");
            int  miles= scanner.nextInt();



            System.out.print("Enter fuel used in gallons: ");
            int gallons=scanner.nextInt();

            double mpgPerTrip=miles/gallons;
            System.out.println( mpgPerTrip);
            totalMpgPerTrip=totalMpgPerTrip+mpgPerTrip;
            System.out.println(totalMpgPerTrip);








            System.out.println("Enter -1 to end program or 0 to continue: ");
            trip = scanner.nextInt();





        }




    }
}
