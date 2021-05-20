import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void calculatePerimeter() {
        Circle circle = new Circle(10);
        double total = circle.calculateContent();
        assertEquals(25 * 3.14159265359, total);
        circle = new Circle(20);
        total = circle.calculateContent();
        assertEquals(100 * 3.14159265359, total);
    }

    @Test
    void calculateContent() {
        Circle circle = new Circle(10);
        double total = circle.calculatePerimeter();
        assertEquals(2 * 3.14159265359 * 5, total);
        circle = new Circle(20);
        total = circle.calculatePerimeter();
        assertEquals(2 * 3.14159265359 * 10, total);
    }
}