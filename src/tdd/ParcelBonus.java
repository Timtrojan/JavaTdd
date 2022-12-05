package tdd;

public class ParcelBonus {
    private double bonus;





    public double checkBonus(){
        return bonus;
    }


    public void bonusCalculation(double delivered, double scanned) {
        double collectionRate = 100* (delivered/scanned);
        if (collectionRate>=50 && collectionRate<=59)
            bonus= collectionRate*200;
        else if (collectionRate>=60 && collectionRate<=69)
            bonus= collectionRate*250;
        else if (collectionRate>=70)
            bonus= collectionRate*500;
        else if (collectionRate>0&&collectionRate<50)
            bonus= collectionRate*0;

    }
}