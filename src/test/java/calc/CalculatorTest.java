package calc;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorTest {
    Calculator calc;
    @BeforeClass
    public void beforeAllTests() {
        calc = new Calculator();
    }
    @Test
    public void checkSumm() {
        int expectedValue = 145;
        Assert.assertEquals(calc.summ(78, 67), expectedValue);
    }
    @Test
    public void checkDivide() {
        int expectedValue = 5;
        Assert.assertEquals(calc.divide(45, 9), expectedValue);
    }
    @Test(expectedExceptions = { ArithmeticException.class })
    public void checkDivideZero() {
        int expectedValue = 0;
        Assert.assertEquals(calc.divide(78, 0), expectedValue);
    }
    @Test
    public void checkMulti() {
        int expectedValue = 145;
        Assert.assertEquals(calc.multi(5, 29), expectedValue);
    }
    @Test
    public void checkMinus() {
        int expectedValue = -34;
        Assert.assertEquals(calc.minus(78, 112), expectedValue);
    }
}
