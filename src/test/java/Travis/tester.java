package Travis;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class tester {
    private test t;

    @Before
    public void setUp(){
        t = new test();
    }

    @Test
    public void testt(){
        assertEquals(3, t.getI());
    }
}
