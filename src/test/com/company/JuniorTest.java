package test.com.company;

import com.company.Junior;
import com.company.classes.OurTestObjectWithTwoSetFields;

import static org.junit.Assert.*;

public class JuniorTest {

    private Junior junior = new Junior();

    //Given two natural numbers (first and last), get the sum from First to Last
    //3 and 8 = 3,4,5,6,7,8 = 3+4+5+6+7=8 == ?
    public void getAllNaturalNumbersSumFromAtoB() {
        assertEquals(3, junior.getAllNaturalNumbersSumFromAtoB(1, 2));
        assertEquals(6, junior.getAllNaturalNumbersSumFromAtoB(1, 3));
        assertEquals(5, junior.getAllNaturalNumbersSumFromAtoB(2, 3));
        assertEquals(15, junior.getAllNaturalNumbersSumFromAtoB(4, 6));
        assertEquals(7, junior.getAllNaturalNumbersSumFromAtoB(7, 7));
        assertEquals(0, junior.getAllNaturalNumbersSumFromAtoB(8, 7));
    }

    //True if string is not null and not empty else false
    public void isStringNullOrEmpty() {
        assertTrue(junior.isStringNullOrEmpty(""));
        assertFalse(junior.isStringNullOrEmpty("k"));
    }

    //Check that array element with index 3 equals to provided value (second param)
    public void isArrayElementWithIndex3EqualsToProvidedString() {
        assertTrue(junior.isArrayElementWithIndex3EqualsToProvidedString(new String[]{"1", "2", "NEW"}, "NEW"));
        assertTrue(junior.isArrayElementWithIndex3EqualsToProvidedString(new String[]{"1", "2", "NEW", "4"}, "NEW"));
        assertFalse(junior.isArrayElementWithIndex3EqualsToProvidedString(new String[]{"1", "2", "N"}, "NEW"));
    }

    //Given String. Check do it contains first char sequence, and second sequence at same moment
    //GOOGLE what methods have Object String in java
    public void doesStringContainsFirstCharSequenceAndTheSecond() {
        assertTrue(junior.doesStringContainsFirstCharSequenceAndTheSecond("abcd", "bc", "cd"));
        assertFalse(junior.doesStringContainsFirstCharSequenceAndTheSecond("abcd", "bc", "h"));
    }

    //make an istance of OurTestObjectWithTwoSetFields and set Custom Object field to first field and second
    public void createOurTestObjectWithTwoSetFields() {
        OurTestObjectWithTwoSetFields object = junior.createOurTestObjectWithTwoSetFields();
        assertNotNull(object.getCustomObjectOne());
        assertNotNull(object.getCustomObjectTwo());
    }

}
