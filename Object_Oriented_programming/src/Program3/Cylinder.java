package Program3;

public class Cylinder extends Circle {
    double height;
    Cylinder(double h, double r)
    {
        super(r);
        height = h;
    }
    Cylinder(double h, double r, String c)
    {
        super(r,c);
        height = h;
    }
    public double getHeight()
    {
        return height;
    }
    public double getArea()
    {
        return Math.PI*radius*height + 2*Math.PI*radius*radius;
    }
    public double getVolume()
    {
        return Math.PI*radius*radius*height;
    }
    public boolean equals(Cylinder c)
    {
        if(this.getArea()==c.getArea() && this.color.equalsIgnoreCase(c.color) && this.getVolume()==c.getVolume())
            return true;
        return false;
    }
    public String toString()
    {
        String st = "Radius of Cylinder = "+this.getRadius()+"\nHeight of Cylinder = "+this.getHeight();
        return (st+"\nArea of Cylinder = "+this.getArea()+"\nColor of Cylinder = "+this.color+"\nVolume of Cylinder = "+this.getVolume());
    }
}
