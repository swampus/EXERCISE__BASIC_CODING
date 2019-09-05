package test.com.company;

import com.company.Trainee;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class TraineeTest {

    private Trainee trainee = new Trainee();

    @Test
    public void testSayHello() {
        assertEquals("Hello", trainee.sayHello());
    }

    @Test
    public void getMaxNumber() {
        assertEquals(3, trainee.getMaxNumber(2, 3));
        assertEquals(2, trainee.getMaxNumber(-2, 2));
        assertEquals(75, trainee.getMaxNumber(25, 75));
        assertEquals(-1, trainee.getMaxNumber(-1, -3));
    }

    @Test
    public void isBiggerThen20() {
        assertEquals(true, trainee.isBiggerThen20(75));
        assertEquals(false, trainee.isBiggerThen20(1));
    }

    @Test
    public void createCustomObject() {
        assertNotNull(trainee.createCustomObject());
    }

    @Test
    public void sumOfTwoNumber() {
        assertEquals(5, trainee.getMaxNumber(2, 3));
        assertEquals(0, trainee.getMaxNumber(-2, 2));
        assertEquals(100, trainee.getMaxNumber(25, 75));
        assertEquals(-4, trainee.getMaxNumber(-1, -3));
    }

}
