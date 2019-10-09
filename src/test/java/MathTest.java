import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathTest {
    @Test
    void simpleAddMethod() {
        Math math = new Math();
        int expected = 2;
        int actual = math.add(1,1);
        assertEquals(actual, expected);
    }
    @Test
    void simpleAddMethod1() {
        Math math = new Math();
        int expected = 3;
        int actual = math.add(1,1);
        assertEquals(actual, expected);
    }
}
