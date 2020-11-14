
package Bai2;

/**
 *
 * @author admini
 */
public class Circle implements IShape{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea()
    {
        return Math.PI*radius*radius;
    }
    @Override
    public double getPeriment()
    {
        return Math.PI*2*radius;
    }
}
