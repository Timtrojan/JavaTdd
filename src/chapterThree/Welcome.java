package chapterThree;

import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        Native timothy= new Native();
        String hisName= timothy.getName();
        System.out.println(hisName);

        Scanner inputCollector= new Scanner(System.in);
        System.out.println("Enter new name : ");
        String newName = inputCollector.nextLine();
        timothy.setName(newName);
        hisName= timothy.getName();
        System.out.println(hisName);
    }
}
