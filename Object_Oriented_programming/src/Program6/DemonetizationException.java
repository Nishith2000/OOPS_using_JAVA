package Program6;

public class DemonetizationException extends Exception {
    double a;
    DemonetizationException(double a)
    {
        this.a = a;
    }
    public String toString()
    {
        return "The deposit of Rs "+a+" in old currency has crossed Rs 5000";
    }
}
