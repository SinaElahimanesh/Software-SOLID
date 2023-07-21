import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void computeAreaTest1() {
        // Test 1
        Rectangle rectangle1 = new Rectangle(0, 0);
        assertEquals(-1, rectangle1.computeArea(), "Compute Area");
    }

    @Test
    void computeAreaTest2() {
        // Test 2
        Rectangle rectangle2 = new Rectangle(1, 10);
        assertEquals(10, rectangle2.computeArea(), "Compute Area");
    }

    @Test
    void computeAreaTest3() {
        // Test 3
        Rectangle rectangle3 = new Rectangle(3, 20);
        assertEquals(60, rectangle3.computeArea(), "Compute Area");
    }

    @Test
    void computeAreaTest4() {
        // Test 4
        Rectangle rectangle4 = new Rectangle(5, 5);
        assertEquals(25, rectangle4.computeArea(), "Compute Area");
    }

    @Test
    void computeAreaTest5() {
        // Test 5
        Rectangle rectangle5 = new Rectangle(-1, -3);
        assertEquals(-1, rectangle5.computeArea(), "Compute Area");
    }

    @Test
    void computeAreaTest6() {
        // Test 6
        Rectangle rectangle6 = new Rectangle(-1, 0);
        assertEquals(-1, rectangle6.computeArea(), "Compute Area");
    }

    @Test
    void computeAreaTest7() {
        // Test 7
        Rectangle rectangle7 = new Rectangle(-5, -3);
        assertEquals(-1, rectangle7.computeArea(), "Compute Area");
    }

    @Test
    void computeAreaTest8() {
        // Test 8
        Square square1 = new Square(-5);
        assertEquals(-1, square1.computeArea(), "Compute Area");
    }

    @Test
    void computeAreaTest9() {
        // Test 9
        Square square2 = new Square(4);
        assertEquals(16, square2.computeArea(), "Compute Area");
    }

    @Test
    void computeAreaTest10() {
        // Test 10
        Square square3 = new Square(0);
        assertEquals(-1, square3.computeArea(), "Compute Area");
    }
}
