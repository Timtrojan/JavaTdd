package chapterFour;

public class TabularOutput {
    public static void main(String[] args) {

        System.out.println("N"+"\t"+"N2"+"\t"+"N3"+"\t"+"N4");
        int counter=1;

        while(counter<=5){

            System.out.println(counter+"\t"+counter*counter+"\t"+counter*counter*counter+"\t"+counter*counter*counter*counter);
            counter++;




        }
    }
}
