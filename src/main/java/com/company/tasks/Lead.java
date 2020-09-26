package com.company.tasks;

import com.company.classes.DNAClass;

public class Lead {
    /**
     * There are elements in array that is provided in param,
     * need to replace all elements in that array that are equals to valueToReplace with value: valueForReplace
     * Given: { "1","2","3"}, "2", "new value instead of 2"
     * Result: { "1, "new value instead of 2", "3"}
     */
    public String[] replaceInArrayEachGivenElementWith(String[] arrayForModification, String valueToReplace, String valueForReplace) {
        return null;
    }

    /**
     * Number is given. need to find most close natural number that gives in POW(2) ( sqrt of it) natural number
     * GIVEN: 2 RESULT: 1
     * GIVEN: 3 RESULT: 1
     * GIVEN: 4 RESULT: 2
     * GIVEN: 5 RESULT: 2
     * GIVEN: 6 RESULT: 2
     */
    public int findClosedNaturalRoundDownToSQRTof(int sqrt) {
        return 0;
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
    public int[][] createTwoDimensionalArrayAndFillItWithNumberProvided(int number) {
        return null;
    }


    //given number. Return array that have first N fibbonachi numbers
    // https://en.wikipedia.org/wiki/Fibonacci_number
    public int[] getNFirstFibonacciNumbersInArray(int n) {
        return null;
    }


    /**
     * Return class by provided string or if key (provided string) are unknown then return Adenosine instance
     * A = Adenosine
     * C = Cytosine
     * G = Guanine
     * M = Methyladenine
     */
    public DNAClass switchBecauseNoHashMap(String key) {
        return null;
    }


}
