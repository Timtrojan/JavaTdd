package tdd.Car;

import tdd.Car.Car;

public class CarApplication {
    public static void main(String[] args) {
        Car benz= new Car("C300", "2022", 50000.00);
        Car toyota = new Car("Camry", "2022", 50000.00);
        System.out.println(benz.checkPrice());
        System.out.println(toyota.checkPrice());

        benz.applyDiscount(5);
        toyota.applyDiscount(7);

        System.out.println(benz.checkPrice());
        System.out.println(toyota.checkPrice());



    }
}
