package tdd;

import org.junit.jupiter.api.Test;
import tdd.AirCondition.AirCondition;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionTest {
    @Test
    public void switchTestOn(){
        AirCondition hisense = new AirCondition();
        hisense.switchAirconditioner(true);
        boolean hisenseCurrentState = hisense.checkSwitchState();
        assertEquals(true, hisenseCurrentState);

    }
    @Test
    public void switchTestOff(){
        AirCondition hisense = new AirCondition();
        hisense.switchAirconditioner(false);
        boolean hisenseCurrentState= hisense.checkSwitchState();
        assertEquals(false, hisenseCurrentState );
    }
    @Test
    public void TemperatureSetTest(){
        AirCondition hisense = new AirCondition();
        hisense.switchAirconditioner(true);
        hisense.setTemperature(16);
        int currentTemperature = hisense.checkTemperature();
        assertEquals(16, currentTemperature);

    }
    @Test
    public void TemperatureIncreaseTest(){
        AirCondition hisense = new AirCondition();
        hisense.switchAirconditioner(true);
        hisense.setTemperature(16);
        hisense.increaseTemperature(18);
        int currentTemperature= hisense.checkTemperature();
        assertEquals(18, currentTemperature );

    }
    @Test
    public void TemperatureDecreaseTest(){
        AirCondition hisense = new AirCondition();
        hisense.switchAirconditioner(true);
        hisense.setTemperature(18);
        hisense.decreaseTemperature(16);
        int currentTemperature= hisense.checkTemperature();
        assertEquals(16, currentTemperature );

    }
    @Test
    public void TemperatureDecreaseTestLimit() {
        AirCondition hisense = new AirCondition();
        hisense.switchAirconditioner(true);
        hisense.setTemperature(20);
        hisense.decreaseTemperature(1);
        int currentTemperature = hisense.checkTemperature();
        assertEquals(16, currentTemperature);

    }
    @Test
    public void TemperatureIncreaseTestLimit() {
        AirCondition hisense = new AirCondition();
        hisense.switchAirconditioner(true);
        hisense.setTemperature(20);
        hisense.increaseTemperature(333);
        int currentTemperature = hisense.checkTemperature();
        assertEquals(30, currentTemperature);
    }

}
