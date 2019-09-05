package test.com.company;

import com.company.Architect;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ArchitectTest {

    private Architect architect = new Architect();

    @Test
    public void recognizeLetter() {
        int[][] T = {
                {1, 1, 1},
                {0, 1, 0},
                {0, 1, 0},
        };

        int[][] HL = {
                {1, 0, 1, 0, 0},
                {1, 1, 1, 0, 0},
                {1, 0, 1, 0, 0},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 1, 1},
        };

        int[][] LL = {
                {0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 0},
                {0, 1, 1, 0, 1, 0},
                {0, 0, 0, 0, 1, 1},
                {0, 0, 0, 0, 0, 0},
        };

        int[][] OOOO = {
                {1, 1, 1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1, 0, 1},
                {1, 1, 1, 0, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 0},
                {1, 1, 1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1, 0, 1},
                {1, 1, 1, 0, 1, 1, 1},
        };

        int[][] COPA = {
                {0, 1, 1, 0, 1, 1, 1},
                {0, 1, 0, 0, 1, 0, 1},
                {0, 1, 1, 0, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 1, 1, 0, 0, 1, 0},
                {0, 1, 1, 0, 1, 1, 1},
                {0, 1, 0, 0, 1, 0, 1},
        };

        System.out.println(Arrays.deepToString(T));
        assertEquals("T", architect.recognizeLetter(T));
        assertEquals("HL", architect.recognizeLetter(HL));
        assertEquals("LL", architect.recognizeLetter(LL));
        assertEquals("OOOO", architect.recognizeLetter(OOOO));
        assertEquals("COPA", architect.recognizeLetter(COPA));
    }
}
