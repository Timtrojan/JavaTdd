package tdd.Car;

public class Car {
    private String model;
    private String year;
    private double price;
    public Car(String model, String year, double price) {
        this.model=model;
        this.year=year;
        this.price=price;


    }



    public double checkPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price>0) this.price=price;
    }

    public void applyDiscount(double DiscountRate) {

        this.price=this.price*(1-(DiscountRate/100));
    }

    public String checkCarModel() {
        return model;
    }


    public void setCarModel(String model) {
        this.model=model;
    }

    public void setCarYear(String year) {
        this.year=year;
    }

    public String checkCarYear() {
        return year;
    }
}
