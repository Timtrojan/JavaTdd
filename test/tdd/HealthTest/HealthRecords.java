package tdd.HealthTest;

import org.junit.jupiter.api.Test;
import tdd.HealthPackage.HealthProfile;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HealthRecords {
    @Test
    public void thatHealthProfileRecordsCanBeCreatedTest(){
        HealthProfile monitor= new  HealthProfile("Timothy", "Adegbasa", "male", 1, 27, 1994, 175, 90.1);
        assertNotNull(monitor);

    }
    @Test
    public void thatHealthProfileRecordsCanSetFirstNameTest(){
        HealthProfile monitor= new  HealthProfile("Timothy", "Adegbasa", "male", 1, 27, 1994, 175, 90.1);
        monitor.setFirstName("Simisola");
        assertEquals("Simisola", monitor.getFirstName() );


    }
    @Test
    public void thatHealthProfileRecordsCanSetLastNameTest(){
        HealthProfile monitor= new  HealthProfile("Timothy", "Adegbasa", "male", 1, 27, 1994, 175, 90.1);
        monitor.setLastName("Owopetu");
        assertEquals("Owopetu", monitor.getLastName() );


    }

    @Test
    public void thatHealthProfileRecordsCanSetDayOfBirthTest(){
        HealthProfile monitor= new  HealthProfile("Timothy", "Adegbasa", "male", 1, 27, 1994, 175, 90.1);
        monitor.setBirthDay(5);
        assertEquals(5, monitor.getBirthDay() );


    }

    @Test
    public void thatHealthProfileRecordsCanSetBirthMonthTest(){
        HealthProfile monitor= new  HealthProfile("Timothy", "Adegbasa", "male", 1, 27, 1994, 175, 90.1);
        monitor.setBirthMonth(5);
        assertEquals(5, monitor.getBirthMonth() );


    }

    @Test
    public void thatHealthProfileRecordsCanSetYearOfBirthTest(){
        HealthProfile monitor= new  HealthProfile("Timothy", "Adegbasa", "male", 1, 27, 1994, 175, 90.1);
        monitor.setBirthYear(2000);
        assertEquals(2000, monitor.getBirthYear() );


    }
    @Test
    public void thatHealthProfileRecordsCanSetHeightTest(){
        HealthProfile monitor= new  HealthProfile("Timothy", "Adegbasa", "male", 1, 27, 1994, 175, 90.1);
        monitor.setPatientHeight(178);
        assertEquals(178, monitor.getPatientHeight() );


    }
    @Test
    public void thatHealthProfileRecordsCanSetWeightTest(){
        HealthProfile monitor= new  HealthProfile("Timothy", "Adegbasa", "male", 1, 27, 1994, 175, 90.1);
        monitor.setPatientWeight(90.78);
        assertEquals(90.78, monitor.getPatientWeight() );


    }
    @Test
    public void thatHeartRateCalculatorCanCalculateAge(){
        HealthProfile monitor= new  HealthProfile("Timothy", "Adegbasa", "male", 1, 27, 1994, 175, 90.1);

        assertEquals(28, monitor.displayPatientAge() );


    }
    @Test
    public void maximumHeartRateTest(){
        HealthProfile monitor= new  HealthProfile("Timothy", "Adegbasa", "male", 1, 27, 1994, 175, 90.1);

        assertEquals(192,monitor.displayPatientMaximumHeartRate());
    }

    @Test
    public void targetHeartRateTest(){
        HealthProfile monitor= new  HealthProfile("Timothy", "Adegbasa", "male", 1, 27, 1994, 175, 90.1);

        assertEquals("96.0--163.2",monitor.displayPatientTargetHeartRate());
    }

    @Test
    public  void bodyMassIndexTest(){
        HealthProfile monitor= new  HealthProfile("Timothy", "Adegbasa", "male", 1, 27, 1994, 175, 90.1);
        assertEquals("You are overweight and your Body Mass Index is 29.42",monitor.bodyMassIndex());



    }
}


