import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathTest {
    @Test
    void addOneAndOneTest() {
        Math math = new Math();
        int expected = 2;
        int actual = math.add(1,1);
        assertEquals(expected, actual);
    }
    @Test
    void addTwoAndOneTest(){
        Math math = new Math();
        int expected = 3;
        int actual = math.add(2,1);
        assertEquals(expected, actual);
    }
    @Test
    void subtractThreeMinusOneTest(){
        Math math = new Math();
        int expected = 2;
        int actual = math.subtract(3,1);
        assertEquals(expected, actual);
    }
    @Test
    void devideNineWithFourTest(){
        Math math = new Math();
        double expected = 2.25;
        double actual = math.devide(9.00,4.00);
        assertEquals(expected, actual);
    }
    @Test
    void devideFiveWithTenTest(){
        Math math = new Math();
        double expected = 0.5;
        double actual = math.devide(5.00,10.00);
        assertEquals(expected, actual);
    }
}
