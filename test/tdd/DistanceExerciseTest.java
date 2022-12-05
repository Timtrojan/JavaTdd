package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DistanceExerciseTest {
    @Test

    public void testThatTwoOnAPlaneRestOnALinePerpendicularToAxis(){
        DistanceExercise measure= new DistanceExercise();
        assertTrue(measure.isPerpendicular(2,4,5,8));


    }
    @Test

    public void testThatTwoOnAPlaneRestOnALinePerpendicularToAxisNot(){
        DistanceExercise measure= new DistanceExercise();
        assertFalse(measure.isPerpendicular(3,3,4,4));


    }




}
