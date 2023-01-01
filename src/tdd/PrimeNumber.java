package tdd;

import java.awt.desktop.PreferencesEvent;

public class PrimeNumber {

    public static String PrimeFunction(int number){
        String response = "";
        for (int i = 2; i <= number/2; i++) {
            if(number%i==0) response= "no";
            else response="yes";

        }
        return response;

        }







}
