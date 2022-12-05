package chapterFour;

import chapterThree.Switch;

import java.util.Scanner;

public class NokiaKeys {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print(""" 
                        
                        
                        1.Phone book
                        2.Messages
                        3.Chat
                        4.Call register
                        5.Tones
                        6.Settings
                        7.Call divert
                        8.Games
                        9.Calculators
                        10.Reminders 
                        11.Clock
                        12.Profiles
                        13.SIM services
   
                        Pick an option below:  
                        """);


        int keyOption= input.nextInt();


        switch (keyOption){

            case 1:
                System.out.println("""
                       
                        1.Search
                        2.Service Nos.
                        3.Add name
                        4.Erase
                        5.Edit
                        6.Assign Tone
                        7.Send b'card
                        8.Options 
                           1. Type of view
                           2.Memory Status
                        9.Speed dials
                        10.Voice tags
                        """);



                System.out.println("Enter a number to continue: ");

                int subOptions=input.nextInt();
                switch (subOptions){

                    case 1:
                        System.out.println("Search");
                        break;
                    case 2:
                        System.out.println("Service nos.");
                        break;
                    case 3:
                        System.out.println("Add name");
                        break;

                }

                break;
            case 2:
                System.out.println("""
                        1.Write messages
                        2.Inbox
                        3.Outbox
                        4.Picture messages
                        5.;ll, 
                        
                        
                        
                        
                        """);
                break;


        }

    }
}
