package tdd.AutomaticBike;

public class AutomaticBike {
    private boolean switchState;
    private int speed;
    private int gear;

    public void turnOnBike(boolean switchOn) {
        switchState = switchOn;
        int gearOne = 1;
        gear = gearOne;
    }

    public boolean checkSwitchState() {
        return switchState;
    }

    public void turnOffBike(boolean switchOff) {
        switchState = switchOff;
    }


    public void accelerateBike(int lastSpeed, int gearValue) {
        if (gearValue == 1) {
            gear = gearValue;
            speed = lastSpeed + gear;
        } else if (gearValue == 2) {
            gear = gearValue;
            speed = lastSpeed + gear;
        } else if (gearValue == 3) {
            gear = gearValue;
            speed = lastSpeed + gear;

        } else if (gearValue == 4) {
            gear = gearValue;
            speed = lastSpeed + gear;

        } else speed = lastSpeed;
    }

    public int checkCurrentBikeSpeed() {
        return speed;
    }

    public void decelerateBike(int lastSpeed, int gearValue) {
        if (gearValue == 1) {
            gear = gearValue;
            speed = lastSpeed - 1;
        } else if (gearValue == 2) {
            gear = gearValue;
            speed = lastSpeed - 2;
        } else if (gearValue == 3) {
            gear = gearValue;
            speed = lastSpeed - 3;
        } else if (gearValue == 4) {
            gear = gearValue;
            speed = lastSpeed - 4;
        } else speed = lastSpeed;


    }

    public void switchGear(int checkCurrentBikeSpeed) {
   if (checkCurrentBikeSpeed>=0 && checkCurrentBikeSpeed<=20) {gear=1;}
   else if (checkCurrentBikeSpeed>=21 && checkCurrentBikeSpeed<=30) {
       gear=2;
   }
   else if (checkCurrentBikeSpeed>=31 && checkCurrentBikeSpeed<=40) {
       gear=3;
   }
   else gear=4;

    }

    public int currentGearState() {
        return gear;
    }
}