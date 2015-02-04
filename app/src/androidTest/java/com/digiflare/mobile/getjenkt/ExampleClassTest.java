package com.digiflare.mobile.getjenkt;

import junit.framework.TestCase;

import org.junit.Test;

/**
 * Created by jwong on 24/01/15.
 */
public class ExampleClassTest extends TestCase {
    @Test
    public void testThatSucceeds() {
        // all OK
        assert true;
    }

    @Test
    public void testThatFails() {
        // all NOK
        assert false;
    }

    @Test
    public void testDoesShitAddUp() {
        int ANSWER = 50;
        int RESULT = ExampleClass.add(2, 3);
        assertEquals(ANSWER, RESULT);
    }
}
