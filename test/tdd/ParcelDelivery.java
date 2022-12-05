package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ParcelDelivery {
    @Test
    public void thatParcelBonusClassCanBeCreated() {
        ParcelBonus gig = new ParcelBonus();
        assertNotNull(gig);
    }

    @Test
    public void bonusCalculationTest() {
        ParcelBonus gig = new ParcelBonus();
        gig.bonusCalculation(60, 100);
        assertEquals(12000, gig.checkBonus());


    }

    @Test
    public void bonusCalculationForFiftyToFiftyNineTest() {
        ParcelBonus gig = new ParcelBonus();
        gig.bonusCalculation(5, 100);
        assertEquals(0, gig.checkBonus());
    }
}
