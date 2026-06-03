package com.calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class AppTest {
    @Test 
    public void testAdd() {
        assertEquals(5, App.add(2, 3));
    }
    @Test 
    public void testAddNegative() {
        assertEquals(-1, App.add(-2, 1));
    }
    @Test
    public void testAddZero() {
        assertEquals(0, App.add(0, 0));
    }
    @Test 
    public void testing(){
        assertEquals(5,App.add(2,3));
    }
}
