package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChangeArrayElementTest {
    ChangeArrayElement changeArrayElement;

    @Before
    public void setUp(){
        changeArrayElement = new ChangeArrayElement();

    }

    @After
    public void tearDown()  {
        changeArrayElement=null;
    }
    @Test
    public void givenArrayShouldChangedAndReturnChangedArray()
    {
        String[] value={"Kiwi", "Grape", "Melon", "Berry"};

        String[] value1={"Apple", "Grape", "Mango", "Berry"};

        assertArrayEquals(value,changeArrayElement.chaArray(value1));
    }
}