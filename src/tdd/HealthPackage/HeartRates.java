package tdd.HealthPackage;

public class HeartRates {

    private String firstName;
    private String lastName;
    private int day;
    private int month;
    private int year;

    public HeartRates(String firstName, String lastName, int day, int month, int year) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setFirstName(String firstName) {
        this.firstName=firstName;


    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName=lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setBirthDay(int day) {
        this.day=day;
    }

    public int getBirthDay() {
        return day;
    }

    public int getBirthMonth() {
        return month;
    }


    public void setBirthMonth(int month) {
        this.month=month;
    }

    public void setBirthYear(int year) {
        this.year=year;

    }

    public int getBirthYear() {
        return year;
    }

    public int displayAge() {

        int ageInYears= 2022-year;
        return ageInYears;


    }

    public int displayMaximumHeartRate() {
        int MaximumHeartRate= 220-displayAge();
        return MaximumHeartRate;
    }

    public String displayTargetHeartRate() {

        double lowerBoundHeartRateTarget= (50.00/100.00)*displayMaximumHeartRate();

        double higherBoundHeartRateTarget=(85.00/100.00)*displayMaximumHeartRate();

        String targetHeartRate= String.valueOf(lowerBoundHeartRateTarget)+"--"+String.valueOf(higherBoundHeartRateTarget);

        return targetHeartRate;
    }
}
