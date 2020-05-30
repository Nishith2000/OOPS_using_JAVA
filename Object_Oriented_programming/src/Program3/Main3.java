package Program3;

public class Main3 {
    public static void main(String args[]) {
        Circle c = new Circle(5.4, "red");
        Cylinder c1 = new Cylinder(3.46, 4.56, "blue");
        Cylinder c2 = new Cylinder(3.46, 4.35, "orange");
        Cylinder c3 = new Cylinder(3.46, 4.56, "blue");
        System.out.println("\nCircle 1\n"+c);
        System.out.println("\nCylinder 1\n"+c1);
        System.out.println("\nCylinder 2\n"+c2);
        System.out.println("\nCylinder 3\n"+c3);
        System.out.println("\nCylinder 1 and 2 are similar: "+c1.equals(c2));
        System.out.println("Cylinder 1 and 3 are similar: "+c1.equals(c3));
    }
}
