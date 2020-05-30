package Program7;

public class Main7 {
    public  static void main(String args[])
    {
        Market m = new Market(5);
        Farmer f = new Farmer(m);
        Customer c = new Customer(m);
        c.start();
        f.start();
    }
}
