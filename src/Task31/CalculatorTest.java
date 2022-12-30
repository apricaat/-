package Task31;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CalculatorTest {
    @Test
    public void add() {
        Calculator calc = new Calculator();
        int result = calc.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void sub() {
        Calculator calc = new Calculator();
        int result = calc.sub(10, 10);
        assertEquals(0, result);
    }

    @Test
    public void mul() {
        Calculator calc = new Calculator();
        int result = calc.mul(-5, -3);
        assertEquals(15, result);
    }

    @Test
    public void div() {
        Calculator calc = new Calculator();
        int result = calc.div(2, 3);
        assertEquals(0, result);
    }
}
