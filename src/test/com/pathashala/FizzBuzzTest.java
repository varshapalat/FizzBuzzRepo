package com.pathashala;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void shouldReturnFizzIfNumberIsThree(){
        FizzBuzz fb = new FizzBuzz(3);
        String result = FizzBuzz.multiple();
        assertEquals("fizz",result);
    }
    @Test
    public void shouldReturnBuzzIfNumberIsFive(){
        FizzBuzz fb = new FizzBuzz(5);
        String result = FizzBuzz.multiple();
        assertEquals("buzz",result);
    }
    @Test
    public void shouldReturnFizzBuzzIfNumberIsFifteen(){
        FizzBuzz fb = new FizzBuzz(15);
        String result = FizzBuzz.multiple();
        assertEquals("fizzbuzz",result);
    }
    @Test
    public void shouldReturnBlahIfNumberIsNotAMultipleOfThreeOrFive(){
        FizzBuzz fb = new FizzBuzz(4);
        String result = FizzBuzz.multiple();
        assertEquals("blah",result);
    }

}