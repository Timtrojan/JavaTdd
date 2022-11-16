package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PostUtmeTest {

    @Test

    public void oneToFourCopiesSale(){
        PostUtme sales = new PostUtme();
        int salesPrice = sales.priceValueForCopies(1);
        assertEquals(2000, salesPrice);

    }
    @Test
    public void fiveToNineCopiesSale(){
        PostUtme sales = new PostUtme();
        int salesPrice= sales.priceValueForCopies(5);
        assertEquals(9000,salesPrice);

    }
    @Test
    public void tenToTwentyNineCopies(){
        PostUtme sales = new PostUtme();
        int salesPrice= sales.priceValueForCopies(10);
        assertEquals(16000, salesPrice);
    }
    @Test
    public void thirtyToFourtyNineCopies(){
        PostUtme sales= new PostUtme();
        int salesPrice= sales.priceValueForCopies(30);
        assertEquals(45000, salesPrice);

    }
    @Test
    public void fiftyToNinetyNineCopies(){
        PostUtme sales= new PostUtme();
        int salesPrice= sales.priceValueForCopies(50);
        assertEquals(65000, salesPrice);
    }
    @Test
    public void HundredToOneNinetyNineCopies(){
        PostUtme sales= new PostUtme();
        int salesPrice= sales.priceValueForCopies(100);
        assertEquals(120000, salesPrice);

    }
    @Test
    public void twoHundredToFourNinetyNineCopies(){
        PostUtme sales= new PostUtme();
        int salesPrice= sales.priceValueForCopies(200);
        assertEquals(220000, salesPrice);

    }
    @Test
    public void FiveHundredAndAboveCopies(){
        PostUtme sales= new PostUtme();
        int salesPrice= sales.priceValueForCopies(900);
        assertEquals(900000, salesPrice);

    }
}
