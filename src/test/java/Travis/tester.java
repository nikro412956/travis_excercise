package Travis;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class tester {
    private test t;

    public void setUp(){
        t = new test();
    }

    public void testt(){
        assertEquals(4, t.getI());
    }
}
