package Program1;

import java.util.Scanner;
public class Main1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double r,i;
        System.out.println("Enter Real and Imaginary part of first Complex No.");
        r = sc.nextDouble();
        i = sc.nextDouble();
        Complex c1 = new Complex(r,i);
        System.out.println("Enter Real and Imaginary part of second Complex No.");
        r = sc.nextDouble();
        i = sc.nextDouble();
        Complex c2 = new Complex(r,i);
        System.out.println("Addition of the 2 Complex No.s is: ");
        Complex c3 = c1.add(c2);
        c3.display();
        System.out.println("Subtraction of the 2 Complex No.s is: ");
        Complex c4 = c1.subtract(c2);
        c4.display();
    }
}
