package tdd.GasStation;

public class PetrolPurchase {
    private String location;
    private String petrolType;
    private int quantity;
    private double pricePerLitre;
    private double discount;


    public PetrolPurchase(String location, String petrolType, int quantity, double pricePerLitre, double discount) {
        this.location=location;
        this.petrolType=petrolType;
        this.quantity=quantity;
        this.pricePerLitre=pricePerLitre;
        this.discount=discount;
    }


    public void setNewLocation(String newLocation) {
        location=newLocation;
    }

    public String getLocation() {
        return location;
    }

    public String getPetrolType() {
        return petrolType;
    }

    public void setPetrolType(String petrolType) {
        this.petrolType=petrolType;
    }

    public int getPetrolQuantity() {
        return quantity;
    }

    public void setPetrolQuantity(int newQuantity) {
        quantity=newQuantity;

    }

    public double getPricePerLitre() {
        return pricePerLitre;
    }

    public void setPricePerLitre(double litrePrice) {
        if (litrePrice> 0) pricePerLitre=litrePrice;
    }

    public void applyDiscount(double rate) {
        discount= rate;
    }
    public double getDiscount(){
        return discount;
    }

    public double getPurchaseAmount() {
        double discountAmount= pricePerLitre*(1-(discount/100));
                double totalPurchase= discountAmount* quantity;
                return Math.round(totalPurchase*100.0)/100.0;

    }
}
