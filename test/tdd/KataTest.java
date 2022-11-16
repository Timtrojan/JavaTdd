package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {

    @Test
    public void squareTest(){
       Kata kata = new Kata();
       int result= kata.sqaureOf(100);
       assertEquals(10000, result) ;

    }
    @Test
    public  void addTest(){
        Kata kata = new Kata();
        int sum = Kata.add(12,2);
        assertEquals(14, sum);



    }
}
