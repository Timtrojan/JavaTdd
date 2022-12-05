package tdd.ClockDisplay;

public class ClockCode {
   private int  hour;
    private int minute;
    private int second;


    public ClockCode(int hour, int minute, int second) {

        if ( hour>=0 && hour<=23) this.hour=hour;
        else this.hour=0;

        if ( minute>=0 && minute<=59) this.minute= minute;
        else this.minute=0;

        if ( second>=0 && second<=59) this.second=second;
        else this.second=0;
    }


    public void setHour(int hour) {
        if ( hour>=0 && hour<=23) this.hour=hour;
        else this.hour=0;

    }

    public int getHour() {

        return hour;
    }

    public void setMinute(int minute) {
        if ( minute>=0 && minute<=59) this.minute= minute;
        else this.minute=0;

    }

    public int getMinute() {
        return minute;
    }

    public void setSecond(int second) {
        if ( second>=0 && second<=59) this.second=second;
        else this.second=0;

    }

    public int getSecond() {
        return second;
    }

    public String displayTime() {


        int hourDisplay = hour;
        int minuteDisplay = minute;
        int secondDisplay = second;

        String hourDisplayNew;
        if (hourDisplay >= 0 && hourDisplay < 10) {
            hourDisplayNew = "0"+Integer.toString(hourDisplay);
        } else hourDisplayNew = Integer.toString(hourDisplay);

        String minuteDisplayNew;
        if (minuteDisplay >= 0 && minuteDisplay < 10) {
            minuteDisplayNew = "0"+Integer.toString(minuteDisplay);
        } else
            minuteDisplayNew = Integer.toString(minuteDisplay);


        String secondDisplayNew;
        if (secondDisplay>=0 && secondDisplay<10){
            secondDisplayNew = "0"+Integer.toString(secondDisplay);
        }

        else
             secondDisplayNew=Integer.toString(secondDisplay);


        return hourDisplayNew + ":" + minuteDisplayNew + ":" + secondDisplayNew;
    }


}
