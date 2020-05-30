package Program5;

public class Crocodile implements TiredAnimal {
                                                   // Since TiredAnimal extends Animal Crocodile
    public void eat()                              // class must implement both eat() and sleep()
    {
        System.out.println("Crocodiles eat Goats");
    }
    public void sleep()
    {
        System.out.println("Crocodiles on an average sleep for 17 hours a day");
    }
}
