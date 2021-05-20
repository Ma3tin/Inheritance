import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void calculateContent() {
        Triangle triangle = new Triangle(5,8,9, 8);
        double total = triangle.calculateContent();
        assertEquals((5 * 8) / 2, total);
        triangle = new Triangle(7.5, 6.3, 9.4, 6.3);
        total = triangle.calculateContent();
        assertEquals((7.5 * 6.3) /2,5, total);
    }

    @Test
    void calculatePerimeter() {
        Triangle triangle = new Triangle(5,8,9, 8);
        double total = triangle.calculatePerimeter();
        assertEquals(22, total);
        triangle = new Triangle(7.5, 6.3, 9.4, 6.3);
        total = triangle.calculatePerimeter();
        assertEquals((7.5+6.3+9.4), total);
    }
}