import java.util.Scanner;

public class AreaOfATriangle {


        public static void main(String [] args){

            Scanner value= new Scanner(System.in);

            System.out.print("Enter the coordinates for the triangle : ");

            double x1 = value.nextDouble();
            double y1 = value.nextDouble();
            double x2 = value.nextDouble();
            double y2 = value.nextDouble();
            double x3 = value.nextDouble();
            double y3 = value.nextDouble();

            double sideAB= x1*(y2-y3);
            double sideAC= x2*(y3-y1);
            double sideBC= x3*(y1-y2);

            double areaRaw= (sideAB+sideAC+sideBC)/2;
            double area= Math.abs(areaRaw);
            System.out.printf("The area is %f", area );
        }






    }

