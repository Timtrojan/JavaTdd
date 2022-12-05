package tdd.ClockDisplay;

public class ClockDriver {
    public static void main(String[] args) {

        ClockCode apple= new ClockCode(10,20,80);
        String currentTimeAtCreation;
        System.out.println(currentTimeAtCreation=apple.displayTime());

        apple.setHour(0);
        apple.setMinute(9);
        apple.setSecond(8);
        System.out.println(currentTimeAtCreation=apple.displayTime());







    }
}
