package tdd.petrolBuy;

import org.junit.jupiter.api.Test;
import tdd.GasStation.PetrolPurchase;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PetrolTest {
    @Test
    public void PetrolStationCanBeCreatedTest(){

        PetrolPurchase petroCam= new PetrolPurchase("lekki", "pms", 90, 176.0, 7.0);
        assertNotNull(petroCam);
    }

    @Test
    public void getLocationTest(){
        PetrolPurchase petroCam= new PetrolPurchase("lekki", "pms", 90, 176.0, 7.0);
        String gasStationLocation=petroCam.getLocation();
        assertEquals("lekki",gasStationLocation );



    }
    @Test
    public void setLocationTest(){
        PetrolPurchase petroCam= new PetrolPurchase("lekki", "pms", 90, 176.0, 7.0);
        petroCam.setNewLocation("Victoria Island");
        assertEquals("Victoria Island", petroCam.getLocation());


    }
    @Test
    public void getPetrolTypeTest(){
        PetrolPurchase petroCam= new PetrolPurchase("lekki", "pms", 90, 176.0, 7.0);
        String petrolType = petroCam.getPetrolType();
        assertEquals("pms", petrolType );



    }
    @Test
    public void setPetrolTypeTest(){
        PetrolPurchase petroCam= new PetrolPurchase("lekki", "pms", 90, 176.0, 7.0);
        petroCam.setPetrolType("gasoline");
        String petrolType = petroCam.getPetrolType();
        assertEquals("gasoline", petrolType );



    }
    @Test
    public void getQuantityTest() {
        PetrolPurchase petroCam = new PetrolPurchase("lekki", "pms", 90, 176.0, 7.0);
        int petrolQuantity = petroCam.getPetrolQuantity();
        assertEquals(90, petrolQuantity);
    }
    @Test
    public void setQuantityTest(){
        PetrolPurchase petroCam= new PetrolPurchase("lekki", "pms", 90, 176.0, 7.0);
        petroCam.setPetrolQuantity(98);
        int  petrolQuantity = petroCam.getPetrolQuantity();
        assertEquals(98, petrolQuantity );



    }
    @Test
    public void getPricePerLitreTest() {
        PetrolPurchase petroCam = new PetrolPurchase("lekki", "pms", 90, 176.0, 7.0);
        double petrolPricePerLitre = petroCam.getPricePerLitre();
        assertEquals(176.0, petrolPricePerLitre);
    }

    @Test
    public void setPricePerLitreTest() {
        PetrolPurchase petroCam = new PetrolPurchase("lekki", "pms", 90, 176.0, 7.0);
        petroCam.setPricePerLitre(98.0);
        double petrolPrice = petroCam.getPricePerLitre();
        assertEquals(98.0, petrolPrice);
    }
    @Test
    public void discountTypeTest(){
        PetrolPurchase petroCam = new PetrolPurchase("lekki", "pms", 90, 176.0, 7.0);
        petroCam.applyDiscount(10.0);
        assertEquals(10.0, petroCam.getDiscount());

    }
   @Test
    public void getTotalPurchaseAmountTest(){
        PetrolPurchase petroCam = new PetrolPurchase("lekki", "pms", 90, 176.0, 7.0);
        double totalPurchaseAmount= petroCam.getPurchaseAmount();
        assertEquals(14731.20, totalPurchaseAmount );

   }
}
