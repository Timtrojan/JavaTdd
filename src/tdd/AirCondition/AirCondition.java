package tdd.AirCondition;

public class AirCondition {
    private boolean switchState;
    private int temperature;
    public void switchAirconditioner (boolean  state) {
        boolean ON= true;
        boolean OFF= false;

        if (state== true) switchState= ON;
        else switchState = OFF;
    }


    public boolean checkSwitchState() {
         return switchState;

    }


    public void setTemperature(int temperature) {
        this.temperature=temperature;

    }

    public int checkTemperature() {
        return temperature;
    }

    public void increaseTemperature(int temperature) {
        if (temperature<=30) this.temperature=temperature;
        else this.temperature=30;
    }

    public void decreaseTemperature(int temperature) {
        if (temperature>=16 ) this.temperature=temperature;
        else this.temperature=16;

    }
}

