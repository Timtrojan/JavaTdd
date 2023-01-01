package tdd;

import java.util.Scanner;

public class StudentGradeAnalyzer {
    private String cohortName;
    private int[][] grades;

    public StudentGradeAnalyzer(String cohortName) {
        this.cohortName = cohortName;
    }


    public String getClassName() {
        return cohortName;
    }

    public void setCohort(String cohortName) {
        this.cohortName = cohortName;
    }





    public void calculateTotal(int[] gradeInput){

        int total=0;
        for (int grade:gradeInput){
            total=+grade;
        }
    }



    public  void setGrades(){
        int[][] gradeSheet=inputValidatedScoresFromUser();
        grades=gradeSheet;


    }
    public int[][] getGrades() {
        return grades;
    }


    public static int[][] inputValidatedScoresFromUser(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many students do you have: ");
        int totalStudents = scanner.nextInt();

        System.out.print("How many subject did they do: ");
        int totalSubjects = scanner.nextInt();

        spacing();

        int[][] gradeSheet = new int[totalStudents][totalSubjects];

        for (int eachStudent=0; eachStudent< gradeSheet.length; eachStudent++ ) {
            int currentStudent=eachStudent+1;

            System.out.println("Entering scores for student "+ currentStudent+" "+"....✔");
            spacing();

            for (int eachSubject = 0; eachSubject<gradeSheet[eachStudent].length;eachSubject++){
                int currentSubject=eachSubject+1;

                spacing();


                System.out.print("Enter score for subject "+currentSubject+": ");
                int score=scanner.nextInt();
                while (score<0||score>100) {
                    System.out.println("Not a valid entry");
                    System.out.print("Enter a valid score for subject "+currentSubject+": ");
                    score=scanner.nextInt();}

                gradeSheet[eachStudent][eachSubject]=score;


            }
            spacing();
        }

        return gradeSheet;

    }



    public  void lineBordersForPresentation(){
        System.out.print("============");

        for(int subject=0;subject<grades[0].length;subject++){
            System.out.print("=========");

        }

        System.out.println("====================================");

    }



    public void headerView(){

        lineBordersForPresentation();

        System.out.print("STUDENT"+"\t"+"\t");

        for(int subject=0; subject<grades[0].length; subject++)
        {System.out.printf("SUB %d    ",subject+1);}

        System.out.print("TOT   ");
        System.out.print("AVE   ");
        System.out.println("POS");
        lineBordersForPresentation();

    }

    public void outputToUser(){
        headerView();

        for(int student=0;student< grades.length;student++){

            System.out.printf("Student %d", student+1);


            for (int score:grades[student]){

                System.out.printf("%8d",score);
            }
            int total= getTotal(grades[student]);
            System.out.printf("%8d%n",total);

        }


        System.out.println();


    }

    public int getTotal(int[] studentGrades){

        int total=0;
        for (int grade: studentGrades){total+=grade;}
        return total;



    }
public static void spacing(){

    System.out.println();
}

}
