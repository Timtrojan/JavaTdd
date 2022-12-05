package tdd.HealthPackage;

public class HealthProfile {
    private String firstName;
    private String lastName;
    private String gender;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private double height;
    private double weight;

    public HealthProfile(String firstName, String lastName, String gender, int dayOfBirth, int monthOfBirth, int yearOfBirth, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.height = height;
        this.weight = weight;
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

    public void setBirthDay(int birthDay) {
        dayOfBirth=birthDay;
    }

    public int getBirthDay() {
        return dayOfBirth;
    }

    public void setBirthMonth(int birthMonth) {
        monthOfBirth=birthMonth;

    }

    public int getBirthMonth() {
        return monthOfBirth;
    }

    public void setBirthYear(int birthYear) {
        yearOfBirth=birthYear;
    }

    public int getBirthYear() {
        return yearOfBirth;
    }

    public int displayPatientAge() {
        int ageInYears= 2022-yearOfBirth;
        return ageInYears;

    }

    public int displayPatientMaximumHeartRate() {
        int MaximumHeartRate= 220-displayPatientAge();
        return MaximumHeartRate;
    }

    public String displayPatientTargetHeartRate() {
        double lowerBoundHeartRateTarget= (50.00/100.00)*displayPatientMaximumHeartRate();

        double higherBoundHeartRateTarget=(85.00/100.00)*displayPatientMaximumHeartRate();

        String targetHeartRate= String.valueOf(lowerBoundHeartRateTarget)+"--"+String.valueOf(higherBoundHeartRateTarget);

        return targetHeartRate;
    }

    public void setPatientHeight(double height) {
        this.height=height;
    }

    public double getPatientHeight() {
        return height;
    }

    public void setPatientWeight(double weight) {
        this.weight=weight;
    }

    public double getPatientWeight() {
        return weight;
    }

    public String bodyMassIndex() {

        double bodyMassIndexOne = weight/Math.pow((height/100), 2) ;
        double bodyMassIndex= Math.round(bodyMassIndexOne*100.0)/100.0;
                String valueOfBodyMassIndex = "";

        if (bodyMassIndex < 18.5) valueOfBodyMassIndex= "You are underweight and your Body Mass Index is "+ String.valueOf(bodyMassIndex);
        else if (bodyMassIndex >= 30) valueOfBodyMassIndex= "You are Obsessed and your Body Mass Index is "+ String.valueOf(bodyMassIndex);
        else if (bodyMassIndex >= 18.5&&bodyMassIndex <=24.9) valueOfBodyMassIndex= "You weight is normal and your Body Mass Index is "+ String.valueOf(bodyMassIndex);
        else if (bodyMassIndex >= 25 &&bodyMassIndex <=29.9) valueOfBodyMassIndex= "You are overweight and your Body Mass Index is "+ String.valueOf(bodyMassIndex);
            return valueOfBodyMassIndex;


    }
}
