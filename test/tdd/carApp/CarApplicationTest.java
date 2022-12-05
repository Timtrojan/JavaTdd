package tdd.carApp;

import org.junit.jupiter.api.Test;
import tdd.Car.Car;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CarApplicationTest {
    @Test
    public void thatCarCanBeCreated(){

        Car benz = new Car("G-Wagon", "2022", 50000);
         assertNotNull(benz);

    }
    @Test

    public void  testThatCarAttributesAreProperlyInitialized(){
        Car benz = new Car("G-Wagon", "2022", 50000.00);
        assertEquals("G-Wagon", benz.checkCarModel());
        assertEquals("2022", benz.checkCarYear());
        assertEquals(50000.00,benz.checkPrice());


    }
    @Test
    public void testThatOnlyPositivePriceCanBeSet(){
        Car benz = new Car("G-Wagon", "2022", 50000.00);
        benz.setPrice(-20000);
        assertEquals(50000,benz.checkPrice());


    }
    @Test
    public void testDiscount(){
        Car benz = new Car("G-Wagon", "2022", 50000.00);
        benz.applyDiscount(10);
        assertEquals(45000,benz.checkPrice());

    }
    @Test
    public void carNameRetrievalTest(){
        Car benz = new Car("G-Wagon", "2022", 50000.00);
        String carName= benz.checkCarModel();
        assertEquals("G-Wagon", carName);



    }
    @Test
    public void setCarModelTest(){
        Car benz = new Car("G-Wagon", "2022", 50000.00);
        benz.setCarModel("GLE-450");
        assertEquals("GLE-450", benz.checkCarModel());

    }
    @Test
    public void setCarYearTest(){
        Car benz = new Car("G-Wagon", "2022", 50000.00);
        benz.setCarYear("2021");
        assertEquals("2021", benz.checkCarYear());



    }


}
