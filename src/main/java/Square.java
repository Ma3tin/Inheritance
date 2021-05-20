import java.util.Scanner;

public class Square extends Shapes{
    private double sideA;

    public Square(double sideA) {
        this.sideA = sideA;
    }

    @Override
    protected double calculateContent() {
        return sideA * sideA;
    }

    @Override
    protected double calculatePerimeter() {
        return sideA * 4;
    }

    public double getSideA() {
        return sideA;
    }
    public void setSideA(double sideA) {
        this.sideA = sideA;
    }
}
