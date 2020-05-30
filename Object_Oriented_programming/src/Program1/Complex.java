package Program1;

public class Complex {
    double real;
    double imag;
    Complex(double r, double i)
    {
        real = r;
        imag = i;
    }

    public Complex add(Complex c)
    {
        return new Complex(this.real + c.real, this.imag + c.imag);
    }

    public Complex subtract(Complex c)
    {
        return new Complex(this.real - c.real, this.imag - c.imag);
    }

    public void display()
    {
        System.out.println(this.real+"i + ("+this.imag+")");
    }

}
