package tdd.HealthPackage;

import java.util.Scanner;

public class HealthProfileApp {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Kindly input your first name: ");
        String firstName=input.nextLine();

        System.out.print("Kindly input your last name: ");
        String lastName = input.nextLine();

        System.out.print("Kindly input your gender: ");
        String gender = input.nextLine();

        System.out.print("Kindly input your Day of birth: ");
        int birthDay=input.nextInt();

        System.out.print("Kindly input your Month of birth: ");
        int monthOfBirth=input.nextInt();

        System.out.print("Kindly input your Year of birth: ");
        int yearOfBirth=input.nextInt();

        System.out.print("Kindly input your Height in Centimeters: ");
        double height=input.nextDouble();

        System.out.print("Kindly input your weight in Kg: ");
        double weight=input.nextDouble();

        HealthProfile patient=new HealthProfile(firstName,lastName,gender, birthDay,monthOfBirth,yearOfBirth, height, weight );
        System.out.printf("First Name: %s%nLast name: %s%n", patient.getFirstName(), patient.getLastName());
        System.out.printf("You are a %s%n", gender);
        System.out.printf("You are  %d years old %n", patient.displayPatientAge());
        System.out.printf("Your maximum heart rate is %d beats per minute %n", patient.displayPatientMaximumHeartRate());
        System.out.printf("Your target heart rate range is %s%n", patient.displayPatientTargetHeartRate());
        System.out.print(patient.bodyMassIndex());
    }

}
