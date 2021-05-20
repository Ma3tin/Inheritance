import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void calculateContent() {
        Square square = new Square(6);
        double total = square.calculateContent();
        assertEquals(36, total);
        square = new Square(10);
        total = square.calculateContent();
        assertEquals(100, total);
    }

    @Test
    void calculatePerimeter() {
        Square square = new Square(6);
        double total = square.calculatePerimeter();
        assertEquals(24, total);
        square = new Square(10);
        total = square.calculatePerimeter();
        assertEquals(40, total);
    }
}