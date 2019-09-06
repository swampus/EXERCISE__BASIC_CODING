package test.com.company;

import com.company.Lead;
import com.company.classes.Adenosine;
import com.company.classes.Cytosine;
import com.company.classes.Guanine;
import com.company.classes.Methyladenine;
import org.junit.Test;

import static org.junit.Assert.*;

public class LeadTest {

    private Lead lead = new Lead();

    @Test
    public void replaceInArrayEachGivenElementWith() {
        assertArrayEquals(new String[]{"1", "XX", "3"}, lead.replaceInArrayEachGivenElementWith(new String[]{"1", "2", "3"}, "2", "XX"));
        assertArrayEquals(new String[]{"1", "XX", "XX"}, lead.replaceInArrayEachGivenElementWith(new String[]{"1", "2", "2"}, "2", "XX"));
        assertArrayEquals(new String[]{"1", "1", "1"}, lead.replaceInArrayEachGivenElementWith(new String[]{"0", "0", "0"}, "0", "1"));
        assertArrayEquals(new String[]{"1", "1", "1"}, lead.replaceInArrayEachGivenElementWith(new String[]{"1", "1", "1"}, "2", "1"));
    }

    /**
     * Number is given. need to find most close natural number that gives in POW(2) ( sqrt of it) natural number
     * GIVEN: 2 RESULT: 1
     * GIVEN: 3 RESULT: 1
     * GIVEN: 4 RESULT: 2
     * GIVEN: 5 RESULT: 2
     * GIVEN: 6 RESULT: 2
     */
    @Test
    public void findClosedNaturalRoundDownToSQRTof() {
        assertEquals(1, lead.findClosedNaturalRoundDownToSQRTof(2));
        assertEquals(1, lead.findClosedNaturalRoundDownToSQRTof(3));
        assertEquals(2, lead.findClosedNaturalRoundDownToSQRTof(4));
        assertEquals(2, lead.findClosedNaturalRoundDownToSQRTof(5));
        assertEquals(8, lead.findClosedNaturalRoundDownToSQRTof(64));
        assertEquals(8, lead.findClosedNaturalRoundDownToSQRTof(65));
    }

    /**
     * Create TWO Demensional Array numberXnumber (google) and fill it with number provided
     * Given 3 Result: {3,3,3}, {3,3,3}, {3,3,3}
     * Given 2 Result: {2,2}, {2,2}
     * <p>
     * 3 3 3
     * 3 3 3
     * 3 3 3
     * <p>
     * 2 2
     * 2 2
     */
    @Test
    public void createTwoDimensionalArrayAndFillItWithNumberProvided() {
        assertArrayEquals(new int[][]{
                {3, 3, 3},
                {3, 3, 3},
                {3, 3, 3},
        }, lead.createTwoDimensionalArrayAndFillItWithNumberProvided(3));

        assertArrayEquals(new int[][]{
                {1},
        }, lead.createTwoDimensionalArrayAndFillItWithNumberProvided(1));

        assertArrayEquals(new int[][]{
                {2, 2},
                {2, 2},
        }, lead.createTwoDimensionalArrayAndFillItWithNumberProvided(2));
    }


    //given number. Return array that have first N fibbonachi numbers
    // https://en.wikipedia.org/wiki/Fibonacci_number
    @Test
    public void getNFirstFibonacciNumbersInArray() {
        assertArrayEquals(new int[]{1, 1, 2, 3, 5}, lead.getNFirstFibonacciNumbersInArray(5));
        assertArrayEquals(new int[]{1, 1, 2, 3, 5, 8}, lead.getNFirstFibonacciNumbersInArray(6));
        assertArrayEquals(new int[]{1, 1, 2, 3, 5, 8, 13}, lead.getNFirstFibonacciNumbersInArray(7));
        assertArrayEquals(new int[]{1, 1, 2, 3, 5, 8, 13, 21}, lead.getNFirstFibonacciNumbersInArray(8));
        assertArrayEquals(new int[]{1, 1, 2, 3, 5, 8, 13, 21, 34}, lead.getNFirstFibonacciNumbersInArray(9));
    }


    /**
     * Return class by provided string or if key (provided string) are unknown then return Adenosine instance
     * A = Adenosine
     * C = Cytosine
     * G = Guanine
     * M = Methyladenine
     */
    @Test
    public void switchBecauseNoHashMap() {
        assertTrue(lead.switchBecauseNoHashMap("A") instanceof Adenosine);
        assertTrue(lead.switchBecauseNoHashMap("C") instanceof Cytosine);
        assertTrue(lead.switchBecauseNoHashMap("G") instanceof Guanine);
        assertTrue(lead.switchBecauseNoHashMap("M") instanceof Methyladenine);
    }
}
