package tdd.clockDisplayTest;

import org.junit.jupiter.api.Test;
import tdd.ClockDisplay.ClockCode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ClockTesting {
    @Test
    public void clockCreationTest(){
        ClockCode apple = new ClockCode(10,23,45);
        assertNotNull(apple);


    }
    @Test
    public void checkThatHourCanBeSetTest(){
        ClockCode apple = new ClockCode(10,23,45);
        apple.setHour(22);
        int hoursTime = apple.getHour();
        assertEquals(22, hoursTime);



    }
    @Test
    public void checkThatMinuteCanBeSetTest() {
        ClockCode apple = new ClockCode(10, 23, 45);
        apple.setMinute(22);
        int hoursTime = apple.getMinute();
        assertEquals(22, hoursTime);
    }

    @Test
    public void checkThatSecondCanBeSetTest() {
        ClockCode apple = new ClockCode(10, 23, 45);
        apple.setSecond(22);
        int hoursTime = apple.getSecond();
        assertEquals(22, hoursTime);
    }
    @Test
    public void hourCanNotBeSetAboveTwentyThreeTest(){
        ClockCode apple = new ClockCode(10,23,45);
        apple.setHour(-45);
        int hoursTime = apple.getHour();
        assertEquals(0, hoursTime);

    }
    @Test
    public void checkThatMinuteCanNotBeSetAboveFiftyNineTest() {
        ClockCode apple = new ClockCode(10, 23, 45);
        apple.setMinute(700);
        int minuteStatus = apple.getMinute();
        assertEquals(0, minuteStatus);
    }
    @Test
    public void checkThatSecondCanNotBeSetAboveFiftyNineTest() {
        ClockCode apple = new ClockCode(10, 23, 45);
        apple.setSecond(800);
        int secondStatus = apple.getSecond();
        assertEquals(0, secondStatus);
    }
    @Test
    public void checkThatTimeIsDisplayedCorrectlyTest() {
        ClockCode apple = new ClockCode(1, 2, 90);
        String time = apple.displayTime();
        assertEquals("01:02:00", time);

    }
}
