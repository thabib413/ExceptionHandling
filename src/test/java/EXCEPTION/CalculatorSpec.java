package EXCEPTION;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by taiseerhabib on 5/20/16.
 */
public class CalculatorSpec {
    @Test
    public void testPart1() throws DivisionByZeroException {
        Calculator testCalculator = new Calculator();
        int expectedVal = 2;
        double actualVal = testCalculator.calculatorDivide(2,1);
        assertEquals(expectedVal, actualVal, 0.1);
    }

    @Test
    public void testPart3() throws DivisionByZeroException {
        Calculator testCalculator = new Calculator();
        int expectedVal = 2;
        double actualVal = testCalculator.calculatorDivide(2,0);
        assertEquals(expectedVal, actualVal,0.1);
    }

    @Test
    public void testPart4() throws ComplexNumberException {
        Calculator testCalculator = new Calculator();
        double expectedVal = 2;
        double actualVal = testCalculator.squareRoot(-4);
        assertEquals(expectedVal, actualVal,0.1);
    }

    @Test (expected = ComplexNumberException.class)
    public void TestPart5() throws ComplexNumberException {
        Calculator testCalculator = new Calculator();
        testCalculator.squareRoot(-4);
    }


}
