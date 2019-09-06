package test.com.company;

import com.company.Senior;
import org.junit.Test;

import static org.junit.Assert.*;

public class SeniorTest {
    private Senior senior = new Senior();

    //Array is given with numbers need to understand is it sorted or not ?
    @Test
    public void isArraySorted() {
        assertTrue(senior.isArraySorted(new int[]{1, 2, 3, 4, 5}));
        assertTrue(senior.isArraySorted(new int[]{0, 1, 2, 3, 3, 3, 4, 5}));
        assertTrue(senior.isArraySorted(new int[]{7, 3, 2, 1, 1, 1}));
        assertTrue(senior.isArraySorted(new int[]{5, 5, 5}));
        assertTrue(senior.isArraySorted(new int[]{3, 3, 1}));

        assertFalse(senior.isArraySorted(new int[]{3, 1, 3}));
        assertFalse(senior.isArraySorted(new int[]{1, 2, 1}));
    }

    /**
     * Find most common letter (char) in string
     * Given: abbbcd  | Result: b
     * Given: aaadcc  | Result: a
     * Given: ttw     | Result: t;
     */
    @Test
    public void getMostCommonCharInString() {
        assertEquals("k", senior.getMostCommonCharInString("aakkkbc"));
        assertEquals("O", senior.getMostCommonCharInString("aAOkbO"));
        assertEquals("T", senior.getMostCommonCharInString("T"));
        assertEquals("0", senior.getMostCommonCharInString("01234567890"));
    }

}
