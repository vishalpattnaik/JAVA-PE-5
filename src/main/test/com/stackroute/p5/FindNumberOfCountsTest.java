package com.stackroute.p5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class FindNumberOfCountsTest {

    FindNumberOfCounts ob = null;

    @Before
    public void setUp() throws Exception {

        ob = new FindNumberOfCounts();

    }

    @After
    public void tearDown() throws Exception {

        ob = null;

    }

    @Test
    public void findNumberOfCountsReturnMap() {

        String res = ob.findCount("one one -one___two,,three,one @three*one?two");

        assertEquals("{one=5, two=2, three=2}", res);

    }

    @Test
    public void findNullReturnErrorMessage() {

        String res = ob.findCount(null);
        assertEquals("Invalid input", res);

    }

}