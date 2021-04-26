import Task5.Calculator;
import Task5.DivisionException;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void positiveAdditionDoubleTest() {
        Calculator calc = new Calculator();
        Assert.assertEquals("Error!", 4.0, calc.addition(2.0, 2.0), 0.0);
    }

    @Test
    public void negativeAdditionDoubleTest() {
        Calculator calc = new Calculator();
        Assert.assertNotEquals("Error!", 5.0, calc.addition(2.0, 2.0));
    }

    @Test
    public void positiveAdditionIntTest() {
        Calculator calc = new Calculator();
        Assert.assertEquals("Error!", 4, calc.addition(2, 2));
    }

    @Test
    public void negativeAdditionIntTest() {
        Calculator calc = new Calculator();
        Assert.assertNotEquals("Error!", 5, calc.addition(2, 2));
    }

    @Test
    public void positiveDivisionDoubleTest() throws DivisionException {
        Calculator calc = new Calculator();
        Assert.assertEquals("Error!", 2.0, calc.division(4.0, 2.0), 0);
    }

    @Test
    public void negativeDivisionDoubleTest() {
        Calculator calc = new Calculator();
        Assert.assertNotEquals("Error!", 3.0, calc.addition(4.0, 2.0));
    }

    @Test
    public void positiveDivisionIntTest() throws DivisionException {
        Calculator calc = new Calculator();
        Assert.assertEquals("Error!", 2, calc.division(4, 2), 0);
    }

    @Test
    public void negativeDivisionIntTest() {
        Calculator calc = new Calculator();
        Assert.assertNotEquals("Error!", 3, calc.addition(4, 2));
    }
}
