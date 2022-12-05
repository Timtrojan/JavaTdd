package tdd.HealthTest;

import org.junit.jupiter.api.Test;
import tdd.HealthPackage.HeartRates;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TargetHeartRateMonitor {
    @Test
    public void thatHeartRateCalculatorCanBeCreatedTest(){
        HeartRates monitor= new HeartRates("Timothy", "Adegbasa", 1, 27, 1994);
        assertNotNull(monitor);

    }
    @Test
    public void thatHeartRateCalculatorCanSetFirstNameTest(){
        HeartRates monitor= new HeartRates("Timothy", "Adegbasa", 1, 27, 1994);
        monitor.setFirstName("Simisola");
        assertEquals("Simisola", monitor.getFirstName() );


    }
    @Test
    public void thatHeartRateCalculatorCanSetLastNameTest(){
        HeartRates monitor= new HeartRates("Timothy", "Adegbasa", 1, 27, 1994);
        monitor.setLastName("Owopetu");
        assertEquals("Owopetu", monitor.getLastName() );


    }

    @Test
    public void thatHeartRateCalculatorCanSetDayOfBirth(){
        HeartRates monitor= new HeartRates("Timothy", "Adegbasa", 1, 27, 1994);
        monitor.setBirthDay(5);
        assertEquals(5, monitor.getBirthDay() );


    }

    @Test
    public void thatHeartRateCalculatorCanSetMonthOfBirthTest(){
        HeartRates monitor= new HeartRates("Timothy", "Adegbasa", 1, 27, 1994);
        monitor.setBirthMonth(5);
        assertEquals(5, monitor.getBirthMonth() );


    }

    @Test
    public void thatHeartRateCalculatorCanSetYearOfBirthTest(){
        HeartRates monitor= new HeartRates("Timothy", "Adegbasa", 1, 27, 1994);
        monitor.setBirthYear(2000);
        assertEquals(2000, monitor.getBirthYear() );


    }

    @Test
        public void thatHeartRateCalculatorCanCalculateAge(){
        HeartRates monitor= new HeartRates("Timothy", "Adegbasa", 1, 27, 1994);

        assertEquals(28, monitor.displayAge() );


    }
    @Test
    public void maximumHeartRateTest(){
        HeartRates monitor= new HeartRates("Timothy", "Adegbasa", 1, 27, 1994);

        assertEquals(192,monitor.displayMaximumHeartRate());
    }

    @Test
    public void targetHeartRateTest(){
        HeartRates monitor= new HeartRates("Timothy", "Adegbasa", 1, 27, 1994);

        assertEquals("96.0--163.2",monitor.displayTargetHeartRate());
    }
}
