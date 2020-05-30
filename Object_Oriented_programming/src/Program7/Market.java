package Program7;

import java.util.ArrayList;
import java.util.Scanner;
public class Market {
    ArrayList<String> buffer = new ArrayList<>();
    int capacity;
    Market(int c){
        capacity = c;
    }
    synchronized void get()
    {
        if(buffer.size()==0)
        {
            try{
                wait();
            }
            catch(Exception e){ System.out.println("No Fruits Are Available"); }
        }
        String fruit = buffer.remove(0);
        System.out.println("Fruit Bought by Customer is: "+fruit);
        notify();
    }

    synchronized void put()
    {
        Scanner sc = new Scanner(System.in);
        if(buffer.size()==capacity)
        {
            try{
                wait();
            }
            catch(Exception e){ System.out.println("Market has reached its capacity"); }
        }
        System.out.println("Enter the fruit to be added: ");
        String fruit = sc.next();
        buffer.add(fruit);
        System.out.println("Fruit Added by Farmer is: "+fruit);
        notify();
    }
}
