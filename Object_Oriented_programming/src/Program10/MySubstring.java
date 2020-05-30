package Program10;

import java.util.Scanner;
public class MySubstring {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence: ");
        String input = sc.nextLine();
        String arr[] = input.split("[ ,.#$%&;]");
        System.out.println("Sub-String after splitting: ");
        for(String a: arr)
            System.out.println(a);
    }
}
