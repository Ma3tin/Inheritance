import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void calculateContent() {
        Rectangle rectangle = new Rectangle(3,5);
        double total = rectangle.calculateContent();
        assertEquals(15, total);
        rectangle = new Rectangle(10,3);
        total = rectangle.calculateContent();
        assertEquals(30, total);
    }

    @Test
    void calculatePerimeter() {
        Rectangle rectangle = new Rectangle(3,5);
        double total = rectangle.calculatePerimeter();
        assertEquals(16, total);
        rectangle = new Rectangle(4,5);
        total = rectangle.calculatePerimeter();
        assertEquals(18, total);
    }
}