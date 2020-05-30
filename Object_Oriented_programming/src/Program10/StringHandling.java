package Program10;

import java.util.Scanner;
public class StringHandling {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence: ");
        String input = sc.nextLine();
        String arr[] = input.split("\\s+");
        System.out.println("The Penultimate word in the sentence is: ");
        System.out.println(arr[arr.length-2]);
    }
}
