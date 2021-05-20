import java.util.Scanner;

public class Circle extends Shapes{
    private double circleRadius;
    private double circleDiameter;

    public Circle(double circleDiameter) {
        this.circleRadius = circleDiameter / 2;
        this.circleDiameter = circleDiameter;
    }

    @Override
    protected double calculatePerimeter() {
        return (2 * 3.14159265359) * circleRadius;
    }

    @Override
    protected double calculateContent() {
        return 3.14159265359 * (circleRadius * circleRadius);
    }



    public double getCircleRadius() {
        return circleRadius;
    }
    public void setCircleRadius(double circleRadius) {
        this.circleRadius = circleRadius;
    }

    public double getCircleDiameter() {
        return circleDiameter;
    }
    public void setCircleDiameter(double circleDiameter) {
        this.circleDiameter = circleDiameter;
    }
}
