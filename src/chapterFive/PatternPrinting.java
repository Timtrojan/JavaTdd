package chapterFive;

public class PatternPrinting {
    public static void main(String[] args) {

        for (int i=1; i<=10;i++){

            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int i=1; i<=10;i++){
            for (int j=10; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int i=1; i<=10;i++){

            for (int k=2; k<=i; k++ )
                System.out.print(" ");
            for (int j=10; j>=i;j--)
                System.out.print("*");

            System.out.println();




        }
        System.out.println();
        for (int i=1; i<=10;i++){
            for (int j=9; j>=i; j--) System.out.print(" ");
            for (int k=1; k<=i;k++) System.out.print("*");
            System.out.println();



        }

        for (int i=1;i<=5;i++){
            for (int j=4; j>=i; j--) System.out.print(" ");
            for (int k=1;k<=2*i-1;k++) System.out.print("*");
            System.out.println();
        }
        for (int i=1;i<=4;i++){
            for (int k=2; k<=i; k++) System.out.print(" ");
            for(int j =9; j>=2*i-1;j--) System.out.print("*");
            System.out.println();



        }




        }

    }

