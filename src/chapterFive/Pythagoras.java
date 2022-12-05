package chapterFive;

public class Pythagoras {
    public static void main(String[] args) {




        for (int sideC=1; sideC<=500; sideC++){
            for (int sideA=1; sideA<=500;sideA++ ){

                for (int sideB=1;sideB<=500;sideB++){

                    if ((sideC*sideC)==((sideA*sideA)+(sideB*sideB)))
                        System.out.println("("+sideA+","+sideB+","+sideC+")");


                }

            }



        }
    }
}
