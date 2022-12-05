package tdd;

import org.junit.jupiter.api.Test;
import tdd.AutomaticBike.AutomaticBike;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutomaticBikeTest {
    @Test
    public void bikeSwitchOn(){
        AutomaticBike tesla = new AutomaticBike();
        tesla.turnOnBike(true);
        boolean teslaState = tesla.checkSwitchState();
        assertEquals(true, teslaState);

    }
    @Test
    public void bikeSwitchOff(){
        AutomaticBike tesla = new AutomaticBike();
        tesla.turnOnBike(true);
        tesla.turnOffBike(false);
        boolean teslaState = tesla.checkSwitchState();
        assertEquals(false, teslaState);

    }
    @Test
    public void bikeAcceleration() {
        AutomaticBike tesla = new AutomaticBike();
        tesla.turnOnBike(true);
        tesla.accelerateBike(10, 29);
        int currentBikeSpeed = tesla.checkCurrentBikeSpeed();
        assertEquals(10,currentBikeSpeed);
    }
    @Test
    public void accelerationWithGearOne(){
        AutomaticBike tesla = new AutomaticBike();
        tesla.turnOnBike(true);
        tesla.accelerateBike(50, 1);
        int currentBikeSpeed = tesla.checkCurrentBikeSpeed();
        assertEquals(51,currentBikeSpeed);

    }
    @Test
    public void accelerationWithGearTwo(){
        AutomaticBike tesla = new AutomaticBike();
        tesla.turnOnBike(true);
        tesla.accelerateBike(50, 2);
        int currentBikeSpeed = tesla.checkCurrentBikeSpeed();
        assertEquals(52,currentBikeSpeed);
    }
   @Test
    public void accelerationWithGearThree(){
       AutomaticBike tesla = new AutomaticBike();
       tesla.turnOnBike(true);
       tesla.accelerateBike(50, 3);
       int currentBikeSpeed = tesla.checkCurrentBikeSpeed();
       assertEquals(53,currentBikeSpeed);

   }

   @Test
    public void accelerateWithGearFour(){
       AutomaticBike tesla = new AutomaticBike();
       tesla.turnOnBike(true);
       tesla.accelerateBike(50, 4);
       int currentBikeSpeed = tesla.checkCurrentBikeSpeed();
       assertEquals(54,currentBikeSpeed);
   }
   @Test
    public void bikeDeceleration(){
       AutomaticBike tesla = new AutomaticBike();
       tesla.turnOnBike(true);
       tesla.accelerateBike(50, 4);
       int bikeSpeedafterAcceleration= tesla.checkCurrentBikeSpeed();
       tesla.decelerateBike(bikeSpeedafterAcceleration, 4);
       int currentBikeSpeed = tesla.checkCurrentBikeSpeed();
       assertEquals(50,currentBikeSpeed);

   }
    @Test
    public void bikeDecelerationWithGearOne() {
        AutomaticBike tesla = new AutomaticBike();
        tesla.turnOnBike(true);
        tesla.accelerateBike(50,1);
        int lastBikeSpeed = tesla.checkCurrentBikeSpeed();
        tesla.decelerateBike(lastBikeSpeed, 1);
        int currentBikeSpeed = tesla.checkCurrentBikeSpeed();
        assertEquals(50, currentBikeSpeed);
    }
    @Test
    public void bikeDecelerationWithGearTwo() {
        AutomaticBike tesla = new AutomaticBike();
        tesla.turnOnBike(true);
        tesla.accelerateBike(50, 1);
        int lastBikeSpeed = tesla.checkCurrentBikeSpeed();
        tesla.decelerateBike(lastBikeSpeed, 2);
        int currentBikeSpeed = tesla.checkCurrentBikeSpeed();
        assertEquals(49, currentBikeSpeed);
    }
    @Test
    public void bikeDecelerationWithGearThree() {
        AutomaticBike tesla = new AutomaticBike();
        tesla.turnOnBike(true);
        tesla.accelerateBike(50, 1);
        int lastBikeSpeed = tesla.checkCurrentBikeSpeed();
        tesla.decelerateBike(lastBikeSpeed, 3);
        int currentBikeSpeed = tesla.checkCurrentBikeSpeed();
        assertEquals(48, currentBikeSpeed);
    }
    @Test
    public void bikeDecelerationWithGearFour() {
        AutomaticBike tesla = new AutomaticBike();
        tesla.turnOnBike(true);
        tesla.accelerateBike(50, 3);
        int lastBikeSpeed = tesla.checkCurrentBikeSpeed();
        tesla.decelerateBike(lastBikeSpeed, 4);
        int currentBikeSpeed = tesla.checkCurrentBikeSpeed();
        assertEquals(49, currentBikeSpeed);
    }
    @Test
    public void gearOneAccelerationRange() {
        AutomaticBike tesla = new AutomaticBike();
        tesla.turnOnBike(true);
        tesla.accelerateBike(21, 1);
        tesla.switchGear(tesla.checkCurrentBikeSpeed());
        int gearState= tesla.currentGearState();
        assertEquals(2,gearState);


    }
    @Test
    public void gearTwoAccelerationRange() {
        AutomaticBike tesla = new AutomaticBike();
        tesla.turnOnBike(true);
        tesla.accelerateBike(20, 1);
        tesla.switchGear(tesla.checkCurrentBikeSpeed());
        int gearState= tesla.currentGearState();
        assertEquals(2,gearState);


    }
    @Test
    public void gearThreeAccelerationRange() {
        AutomaticBike tesla = new AutomaticBike();
        tesla.turnOnBike(true);
        tesla.accelerateBike(29, 2);
        tesla.switchGear(tesla.checkCurrentBikeSpeed());
        int gearState= tesla.currentGearState();
        assertEquals(3,gearState);


    }
    @Test
    public void gearFourAccelerationRange() {
        AutomaticBike tesla = new AutomaticBike();
        tesla.turnOnBike(true);
        tesla.accelerateBike(90, 1);
        tesla.switchGear(tesla.checkCurrentBikeSpeed());
        int gearState= tesla.currentGearState();
        assertEquals(4,gearState);


    }
    @Test
    public void gearOnedecelerationRange() {
        AutomaticBike tesla = new AutomaticBike();
        tesla.turnOnBike(true);
        tesla.accelerateBike(90, 4);
        tesla.decelerateBike(90, 2);
        tesla.switchGear(tesla.checkCurrentBikeSpeed());
        int gearState= tesla.currentGearState();
        assertEquals(4,gearState);


    }
    @Test
    public void gearTwodecelerationRange() {
        AutomaticBike tesla = new AutomaticBike();
        tesla.turnOnBike(true);
        tesla.decelerateBike(22, 2);
        tesla.switchGear(tesla.checkCurrentBikeSpeed());
        int gearState= tesla.currentGearState();
        assertEquals(1,gearState);


    }







}
