import java.util.Scanner;

public class Triangle extends Shapes{
    private double sideA;
    private double sideB;
    private double sideC;
    private double triangleHeight;

    public Triangle(double sideA, double sideB, double sideC, double triangleHeight) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.triangleHeight = triangleHeight;
    }


    @Override
    protected double calculateContent() {
        return (sideA * triangleHeight) / 2;
    }

    @Override
    protected double calculatePerimeter() {
        return sideA + sideB + sideC;
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

    public double getSideC() {
        return sideC;
    }
    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double getTriangleHeight() {
        return triangleHeight;
    }
    public void setTriangleHeight(double triangleHeight) {
        this.triangleHeight = triangleHeight;
    }
}
