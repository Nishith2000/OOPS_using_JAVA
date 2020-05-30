package Program7;

public class Customer extends Thread{
    Market m;
    Customer(Market m)
    {
        this.m = m;
    }
    public void run()
    {
        for(int i=0;i<10;i++)
            m.get();
    }
}
