package com.stackroute.p5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class UpdateArrayElementTest {

    UpdateArrayElement ob = null;

    @Before
    public void setUp() throws Exception {

        ob = new UpdateArrayElement();

    }

    @After
    public void tearDown() throws Exception {

        ob = null;

    }

    @Test
    public void checkUpdatedArrayReturnResult() {

        ArrayList<String> arrli = new ArrayList<String>(4);
        arrli.add("Apple");
        arrli.add("Grape");
        arrli.add("Melon");
        arrli.add("Berry");
        ArrayList<String> res = ob.updateArray(arrli, "Apple", "Kiwi");
        ArrayList<String> resultList = new ArrayList<String>(4);
        resultList.add("Kiwi");
        resultList.add("Grape");
        resultList.add("Melon");
        resultList.add("Berry");
        assertEquals(resultList, res);

    }
}