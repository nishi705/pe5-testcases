package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;

public class RepeatStringTest {
    RepeatString repeatString;

    @Before
    public void setUp(){
        repeatString =new  RepeatString();

    }

    @After
    public void tearDown(){
        repeatString=null;
    }
    public void givenRepeatedStringShouldBeReturnInMapString()
    {
        String[] value={"a":true,"b" :false ,"c" :true,"d" : false};
        String[] value1={"a","b","c","d","a","c","c"};
        assertEqquals(v)
    }
}