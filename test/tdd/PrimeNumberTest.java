package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PrimeNumberTest {
    @Test

    public void testThatPrimeNumberAppExists(){
        PrimeNumber primes= new PrimeNumber();
        assertNotNull(primes);
    }
    @Test

    public void testThatPrimeFunctionWorks(){
        String result= PrimeNumber.PrimeFunction(3);
        assertEquals("yes",result);


    }
}
