package Program7;

public class Farmer extends Thread{
    Market m;
    Farmer(Market m)
    {
        this.m = m;
    }
    public void run()
    {
        for(int i=0;i<10;i++)
            m.put();
    }
}
