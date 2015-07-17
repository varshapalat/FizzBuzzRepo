package com.pathashala;

public class FizzBuzz {
    private static int value;

    public FizzBuzz(int i) {
        value=i;
    }

    public static String multiple() {
        if(value%15 == 0)
        {
            return "fizzbuzz";
        }
        else if(value%3 == 0) {
            return "fizz";
        }
        else if(value%5 == 0)
        {
            return "buzz";
        }
        return "blah";
    }
}
