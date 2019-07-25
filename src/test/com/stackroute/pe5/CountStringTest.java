package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountStringTest {
    CountString countString;

    @Before
    public void setUp() {
        countString = new CountString();
    }

    @After
    public void tearDown() {
        countString = null;
    }
        @Test

        public void givenArrayShouldBeCounteAndReturnCount()
        {

            String[] value = {"one:5", "two:2", "three :2"};
            String[] value1 = {"one one -one___two,,three,one @three*one?two"};
            assertArrayEquals(value, countString.coutString(value1));


        }
    }
}