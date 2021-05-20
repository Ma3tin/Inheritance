import java.util.Scanner;

public class Rectangle extends Shapes {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    protected double calculateContent() {
        return sideA*sideB;
    }

    @Override
    protected double calculatePerimeter() {
        return (2 * sideA) + (2 * sideB);
    }

    public double getSideA() {
        return sideA;
    }
    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }
    public void setSideB(double sideB) {
        this.sideB = sideB;
    }
}
