package Program5;

public class Main5 {
    public static void main(String args[])
    {
        Animal a1 = new Lion();
        a1.eat();
        a1 = new Snake();
        a1.eat();
        TiredAnimal t1 = new Crocodile();
        t1.eat();
        t1.sleep();
    }
}
