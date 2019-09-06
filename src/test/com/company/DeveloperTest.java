package test.com.company;

import com.company.Developer;
import com.company.classes.ClassWithField;
import com.company.classes.ObjectForConfiguration;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeveloperTest {

    Developer developer = new Developer();

    @Test
    public void checkNumberIsNatural() throws Exception {
        assertTrue(developer.checkNumberIsNatural("2"));
        assertTrue(developer.checkNumberIsNatural("21"));
        assertFalse(developer.checkNumberIsNatural("2.3"));
        assertFalse(developer.checkNumberIsNatural("2.3232"));
        assertFalse(developer.checkNumberIsNatural("0"));
    }

    @Test
    public void getSumOfNumbersInsideArray() {
        assertEquals(11, developer.getSumOfNumbersInsideArray(new int[]{2, 1, 3, 5}));
        assertEquals(40, developer.getSumOfNumbersInsideArray(new int[]{20, 10, 5, 5}));
        assertEquals(0, developer.getSumOfNumbersInsideArray(new int[]{0}));
        assertEquals(1, developer.getSumOfNumbersInsideArray(new int[]{1}));
    }

    @Test
    public void createObject() throws Exception {
        ObjectForConfiguration object = developer.createObject();
        assertEquals(11, object.getFirstField());
        assertEquals(22, object.getFirstField());
        assertEquals(33, object.getFirstField());
    }

    @Test
    public void createObjectCallMethodAndReturn() {
        ObjectForConfiguration object = new ObjectForConfiguration();
        developer.createObjectCallMethodAndReturn(object);
        assertEquals(22, object.getSecretField());
    }

    @Test
    public void getClassWithBiggerValue() {
        ClassWithField classWithField1 = new ClassWithField(1);
        ClassWithField classWithField2 = new ClassWithField(2);
        ClassWithField classWithFieldResult = developer.getClassWithBiggerValue(classWithField1, classWithField2);
        assertEquals(Integer.valueOf(2), classWithFieldResult.getValueInClass());
    }
}