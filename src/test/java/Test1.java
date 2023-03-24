import org.example.Calculator;

import static org.junit.Assert.*;
import org.junit.Test;
public class Test1
{
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void powerTruePositive()
    {
        assertEquals("Finding power of two numbers for True Positive", 343, calculator.power(7, 3), DELTA);
        assertEquals("Finding power of two numbers for True Positive", 7776, calculator.power(6, 5), DELTA);
    }

    @Test
    public void powerFalsePositive()
    {
        assertNotEquals("Finding power of two numbers for False Positive", 120, calculator.power(5, 7), DELTA);
        assertNotEquals("Finding power of two numbers for False Positive", 80, calculator.power(4, 11), DELTA);
    }

    @Test
    public void factorialTruePositive()
    {
        assertEquals("Finding factorial for True Positive", 120, calculator.factorial(5), DELTA);
        assertEquals("Finding factorial for True Positive", 1, calculator.factorial(0), DELTA);
    }

    @Test
    public void factorialFalsePositive()
    {
        assertNotEquals("Finding factorial for False Positive", 140, calculator.factorial(3), DELTA);
        assertNotEquals("Finding factorial for False Positive", 203, calculator.factorial(4), DELTA);

    }


    @Test
    public void naturalLogTruePositive()
    {
        assertEquals("Finding natural log for True Positive", 4.978497702968366, calculator.naturalLog(145.256), DELTA);
        assertEquals("Finding natural log for True Positive", 1.6094379124341003, calculator.naturalLog(5), DELTA);
    }

    @Test
    public void naturalLogFalsePositive()
    {
        assertNotEquals("Finding natural log for False Positive", 140, calculator.naturalLog(3), DELTA);
        assertNotEquals("Finding natural log for False Positive", 203, calculator.naturalLog(4), DELTA);

    }

    @Test
    public void squarerootTruePositive()
    {
        assertEquals("Finding squareroot for True Positive", 5, calculator.squareroot(25), DELTA);
        assertEquals("Finding squareroot for True Positive", 9, calculator.squareroot(81), DELTA);
    }

    @Test
    public void squarerootFalsePositive()
    {
        assertNotEquals("Finding squareroot for False Positive", 111, calculator.squareroot(121), DELTA);
        assertNotEquals("Finding squareroot for False Positive", 32, calculator.squareroot(8), DELTA);

    }




}