package tdd.GasStation;

import java.util.Scanner;

public class PetrolPurchaseDriver {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        PetrolPurchase pinnacle= new PetrolPurchase("Yaba","pms",190,186.0,6.0);
        System.out.print("Enter quantity of petrol: ");
        pinnacle.setPetrolQuantity(input.nextInt());
       double total= pinnacle.getPurchaseAmount();
        System.out.println(pinnacle.getPetrolQuantity());
        System.out.println(total);

    }
}
