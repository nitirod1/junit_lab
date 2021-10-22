import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.security.DrbgParameters.Reseed;

import javax.naming.spi.DirStateFactory.Result;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Tag;

public class HelloWorldTest {  
    private static Calculator cal ;
    @Before
    public void setUp(){
        cal = new Calculator();
    }
    @Test
    public void TestAdd(){
        int Size_test = 3;
        BigDecimal real[]= new double[Size_test];
        BigDecimal exp[] = {0,-100.12,0.34};
        cal.x = 1;cal.y=-1;
        real[0]=cal.add();
        cal.x = 1;cal.y=-1;
        real[1]
        real[2]
        assertEquals(expected, actual);
    }
}
