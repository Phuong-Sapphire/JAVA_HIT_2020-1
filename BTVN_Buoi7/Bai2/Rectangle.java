
package Bai2;

/**
 *
 * @author admini
 */
public class Rectangle implements IShape{
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override 
    public double getArea()
    {
        return width*length;
    }
    @Override 
    public double getPeriment()
    {
        return (width+length)*2;
    }
}
