package CreditCardValidatorApp;

import java.util.ArrayList;
import java.util.Scanner;

public class CreditCardValidator {

    private static int[] cardNumberArray;

    public static void setCardNumberArray() {
        CreditCardValidator.cardNumberArray = populateArraylist();
    }


    public  static  void displayCardDetailsToUser(){
        setCardNumberArray();
        System.out.println("******************************************");
        typeOfCard();
        System.out.print("**Credit Card Number: ");
        cardNumber();
        System.out.println();
        cardLength();
        checkIfCardIsValid();
        System.out.println();
        System.out.println("******************************************");

    }

   public static int [] populateArraylist(){
    Scanner scanner= new Scanner(System.in);

    System.out.println("Enter Card Number: ");
    String cardInput= scanner.nextLine();
    int [] cardNumber=new int[cardInput.length()];

    for (int i=0; i< cardNumber.length;i++){
        cardNumber[i]=Integer.parseInt(cardInput.substring(i,i+1));
    }
    return cardNumber;

}
   public static int addValuesFromBack(){

        //CreditCardValidator.cardNumberArray=cardNumberArray;

        ArrayList<Integer>numbersToAdd=new ArrayList<>();
        int sumOfNumbers=0;


        for(int i= cardNumberArray.length-2; 0<=i;i-=2 ){
            int squaredNumber= cardNumberArray[i]*2;
            if (squaredNumber>9){
                int newNumber=(squaredNumber/10)+(squaredNumber%10);

                numbersToAdd.add(newNumber);}
            else numbersToAdd.add(squaredNumber);

        }



        for (int number: numbersToAdd){
            sumOfNumbers+=number;
        }
      return sumOfNumbers;
}
   public static int addOddPositionNumbersFromTheBack(){

    int sumOfOddNumbers=0;
        for (int i=cardNumberArray.length-1; 0<=i; i-=2){
            sumOfOddNumbers+=cardNumberArray[i];

        }
        return sumOfOddNumbers;
}
   public static void checkIfCardIsValid(){

        int sum=addValuesFromBack()+addOddPositionNumbersFromTheBack();
        if (sum%10==0) System.out.print("**Credit Card Validity Status: Valid");
        else System.out.print("**Credit Card Validity Status: Invalid");

   }
   public static void cardLength(){
       System.out.println("**Credit Card Digit Length: "+cardNumberArray.length);
   }

   public static void cardNumber(){


        for (int i=0;i<cardNumberArray.length;i++){
            System.out.print(cardNumberArray[i]);
        }
   }

   public static void typeOfCard(){


            if(cardNumberArray[0]==4) System.out.println("**Credit Card Type: VISA ");
            else if (cardNumberArray[0]==5) {
                System.out.println("**Credit Card Type: MasterCard ");
            }
            else if (cardNumberArray[0]==6) {
                System.out.println("**Credit Card Type: Discover ");

            }
            else if (cardNumberArray[0]==3) {
                if(cardNumberArray[1]==7) System.out.println("**Credit Card Type: AMEX ");

            }
            else System.out.println("**Credit Card Type: Invalid Card ");



   }
}

