

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PayDayTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PayDayTest
{
    /**
     * Default constructor for test class PayDayTest
     */
    public PayDayTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    @Test
    public void subStrTest() {
        PayDay payday1 = new PayDay("Wes", 21.5, 10.0, 0.05);
        String expected = "el";
        String result = payday1.subStr();
        assertEquals(expected, result);
    }
    @Test
    public void getGrossPayTest() {
        PayDay payday1 = new PayDay("Wes", 21.5, 10.0, 0.05);
        
        double expected = 215.00;
        double result = payday1.getGrossPay();
        assertEquals(expected, result, 2);
        
    }
    @Test
    public void getAmountDeductedTest() {
        PayDay payday1 = new PayDay("Wes", 21.5, 10.0, 0.05);
        double gross = payday1.getGrossPay();
        
        double expected = 10.75;
        double result = payday1.getAmountDeducted(gross);
        assertEquals(expected, result, 2);
        
    }
    @Test
    public void getNetPayTest() {
        PayDay payday1 = new PayDay("Wes", 21.5, 10.0, 0.05);
        double gross = payday1.getGrossPay();
        double amountDeducted = payday1.getAmountDeducted(gross);
        
        double expected = 204.25;
        double result = payday1.getNetPay(gross, amountDeducted);
        assertEquals(expected, result, 2);
        
    }
    @Test
    public void getPayStubTest() {
        PayDay payday1 = new PayDay("Wes", 21.5, 10.0, 0.05);
        
        String expected = "Wes 215.00 10.75 204.25";
        String result = payday1.getPayStub();
        assertEquals(expected, result);
    }
}
