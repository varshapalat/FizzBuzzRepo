package com.pathashala;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void shouldReturnFizzIfNumberIsThree(){
        FizzBuzz fb = new FizzBuzz(3);
        String result = FizzBuzz.multiple();
        assertEquals("fizz",result);
    }
}
