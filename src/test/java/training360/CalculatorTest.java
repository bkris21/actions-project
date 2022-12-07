package training360;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAdd(){
        Calculator c = new Calculator();
        assertEquals(6, c.add(2,4));
    }

    @Test
    void testAdd2(){
        Calculator c = new Calculator();

        assertEquals(5,c.add(2,3));

    }

}