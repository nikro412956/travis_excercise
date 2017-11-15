package Travis2;

import Travis.test;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class tostieijzer {
    private tostie t;

    @Before
    public void setUp(){
        t = new tostie();
    }

    @Test
    public void testt(){
        assertEquals(9, t.getI());
    }
}
