package Program3;

public class Circle {
    double radius;
    String color;
    Circle(double r, String c)
    {
        radius = r;
        color = c;
    }
    Circle(double r)
    {
        radius = r;
    }
    public double getRadius()
    {
        return radius;
    }
    public double getArea()
    {
        return Math.PI*radius*radius;
    }
    public String toString()
    {
        String st = "Radius of Circle = "+this.getRadius();
        return (st+"\nArea of Circle = "+this.getArea()+"\nColor of Circle = "+this.color);
    }
}
