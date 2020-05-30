package Program9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyArrayList {
    public static ArrayList<String> clone_list(ArrayList<String> list)
    {
        return  new ArrayList<>(list);
    }

    public static void sort_list(ArrayList<String> list)
    {
        Collections.sort(list);
    }

    public static ArrayList<String> reverse_list(ArrayList<String> list)
    {
        ArrayList<String> listnew = new ArrayList<>();
        for(int i=list.size()-1;i>=0;i--)
            listnew.add(list.get(i));
        return listnew;
    }

    public static List<String> get_subList(List<String> list, int start, int end)
    {
        List<String> c = list.subList(start,end);
        return c;
    }

    public static String[] toArrayFromList(ArrayList<String> list)
    {
        String arr[] = new String[list.size()];
        list.toArray(arr);
        return arr;
    }

    public static void addEle(ArrayList<String> list, String color)
    {
        list.add(color);
    }

    public static void main(String args[])
    {
        ArrayList<String> main_list = new ArrayList<String>();
        addEle(main_list,"Red");
        addEle(main_list,"Yellow");
        addEle(main_list,"Orange");
        addEle(main_list,"Green");
        addEle(main_list,"Blue");
        addEle(main_list,"Purple");
        addEle(main_list,"White");
        addEle(main_list,"Magenta");
        System.out.println("The Main List is: "+main_list);
        ArrayList<String> duplist =  clone_list(main_list);
        System.out.println("The Cloned List is: "+duplist);
        sort_list(main_list);
        System.out.println("The Main List after sorting is: "+ main_list);
        System.out.println("The Main List after sorting and reversing is: "+ reverse_list(main_list));
        String[] arr =  toArrayFromList(main_list);
        System.out.println("The main list after being converted to an array: "+ Arrays.toString(arr));
        List<String> c = get_subList(main_list, 0, 3);
        System.out.println("The sublist of the main list containing 3 elements is: "+c);
    }
}
