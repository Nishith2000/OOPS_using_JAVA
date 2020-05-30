package Program10;

import java.util.Scanner;
public class StringHandling2 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence: ");
        String input = sc.nextLine();
        input = input.toLowerCase();
        String s1 = input.replace("python", "temp");
        String s2 = s1.replace("java","python");
        input = s2.replace("temp","java");
        System.out.println("String after replacement is:  "+input);
    }
}
