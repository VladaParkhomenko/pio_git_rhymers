package edu.kis.vh.nursery;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DefaultCountingOutRhymerTest {

    private DefaultCountingOutRhymer rhymer;

    @Before
    public void setUp() {
        rhymer = new DefaultCountingOutRhymer();
    }

    @Test
    public void testCountIn() {
        rhymer.countIn(5);
        assertEquals(5, rhymer.peekaboo());  
    }

    @Test
    public void testCountOut() {
        rhymer.countIn(10);
        int result = rhymer.countOut();
        assertEquals(10, result);  
    }

    @Test
    public void testCallCheckWhenEmpty() {
        assertTrue(rhymer.callCheck());  
    }

    @Test
    public void testCallCheckWhenNotEmpty() {
        rhymer.countIn(5);
        assertFalse(rhymer.callCheck());  
    }

    @Test
    public void testIsStackFullWhenNotFull() {
        for (int i = 0; i < 11; i++) {
            rhymer.countIn(i);
        }
        assertFalse(rhymer.isStackFull());  
    }

    @Test
    public void testIsStackFullWhenFull() {
        for (int i = 0; i < 12; i++) { 
            rhymer.countIn(i);
        }
        assertTrue(rhymer.isStackFull());  
    }
}