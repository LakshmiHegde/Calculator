import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class Calculator_Test {
    private static final double delta = 1e-15;
    Calculator_Devops calc=new Calculator_Devops();
    @Test
    public void squareroot_true(){
        assertEquals("Square root function check for, True positive result ",7.0,calc.squareroot(49),delta);
        assertEquals("Square root function check for, True negative result ",Double.NaN,calc.squareroot(-49),delta);
    }
    @Test
    public void squareroot_false(){
        assertNotEquals("Square root function check for, False positive result ",8.0,calc.squareroot(49),delta);
        assertNotEquals("Square root function check for, False negative result ",7,calc.squareroot(-49),delta);

    }

    @Test
    public void factorial_true(){
        assertEquals("Factorial function check for, True positive result ",5040,calc.factorial(7),delta);
        assertEquals("Factorial function check for, True negative result ",Double.NaN,calc.factorial(-4),delta);

    }
    @Test
    public void factorial_false(){
        assertNotEquals("Factorial function check for, False positive result ",8,calc.factorial(3),delta);
        assertNotEquals("Factorial function check for, False negative result ",120,calc.factorial(-5),delta);

    }

    @Test
    public void power_true(){
        assertEquals("Power function check for, True positive result ",16,calc.power(4,2),delta);
        assertEquals("Power function check for, True negative result ",1,calc.power(3,0),delta);

    }
    @Test
    public void power_false(){
        assertNotEquals("Power function check for, False positive result ",2,calc.power(2,8),delta);
        assertNotEquals("Power function check for, False negative result ",1,calc.power(0,1),delta);

    }


    @Test
    public void logarithm_true(){
        assertEquals("Logarithm function check for, True positive result ",1.3862943611198906,calc.logarithm(4),delta);
        assertEquals("Logarithm function check for, True negative result ",Double.NaN,calc.logarithm(-4),delta);

    }
    @Test
    public void logarithm_false(){
        assertNotEquals("Logarithm function check for, False positive result ",Double.NaN,calc.logarithm(3),delta);
        assertNotEquals("Logarithm function check for, False negative result ",1.3862943611198906,calc.logarithm(-4),delta);

    }
}
