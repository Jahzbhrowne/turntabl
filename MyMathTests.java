package io.turntabl;

import org.junit.Assert;
import org.junit.Test;

public class MyMathTests {
    @Test
    public void divide() throws Exception {
        // arrange- class instantiations or variable declarations
        MyMath mm = new MyMath();
        int num = 20;
        int deno = 2;
        int expected = 10;

        // act - methods and operations
        int res = mm.divide(num, deno);

        // assert - assertions to verify results
        Assert.assertEquals(expected, res);

    }
    public void multiply
}
