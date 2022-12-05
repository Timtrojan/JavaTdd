package tdd.HealthPackage;

import java.util.Scanner;

public class HeartRateApp {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Kindly input your first name: ");
        String firstName=input.nextLine();

        System.out.print("Kindly input your last name: ");
        String lastName = input.nextLine();

        System.out.print("Kindly input your Day of birth: ");
        int dayOfBirth=input.nextInt();

        System.out.print("Kindly input your Month of birth: ");
        int monthOfBirth=input.nextInt();

        System.out.print("Kindly input your Year of birth: ");
        int yearOfBirth=input.nextInt();

        HeartRates omicron=new HeartRates(firstName,lastName,dayOfBirth,monthOfBirth,yearOfBirth);
        System.out.printf("First Name: %s%nLast name: %s%n", omicron.getFirstName(), omicron.getLastName());
        System.out.printf("You are  %d years old %n", omicron.displayAge());
        System.out.printf("Your maximum heart rate is %d beats per minute %n", omicron.displayMaximumHeartRate());
        System.out.printf("Your target heart rate range is %s%n", omicron.displayTargetHeartRate());
    }

}
