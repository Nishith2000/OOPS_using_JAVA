package Program8;

import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Operation isODD = (a)-> a%2 != 0;
        Operation isPrime = (a) -> {
            int count = 0;
            for(int i=2;i<a;i++)
                if(a%i==0)count++;
            if(count>0) return false;
            else return true;
        };
        Operation isPalindrome = (a)->{
          ArrayList<Integer> list = new ArrayList<>();
          while(a != 0)
          {
              list.add(a%10);
              a /= 10;
          }
          int j = list.size()-1;
          for(int i=0;i<list.size()/2;i++,j--)
              if(list.get(i) != list.get(j))
                  return false;
          return true;
        };
        while (true) {
            System.out.println(" Enter your choice \n 1)Check if Number is ODD or EVEN \n 2)Check if Number is Prime or Not \n 3)Check if NUmber is a Palindrome or not");
            System.out.println(" 4)Exit");
            int ch = sc.nextInt();
            int num=5;
            if(ch<4)
            {
                System.out.println("Enter the Number: ");
                num = sc.nextInt();
            }
            switch (ch)
            {
                case 1:
                    if(isODD.perform(num))
                        System.out.println("Number is ODD");
                    else System.out.println("Number is Even");
                    break;
                case 2:
                    if(isPrime.perform(num))
                        System.out.println("Number is Prime");
                    else System.out.println("Number is Composite");
                    break;
                case 3:
                    if(isPalindrome.perform(num))
                        System.out.println("Number is a Palindrome");
                    else System.out.println("Number is not a Palindrome");
                    break;
                case 4:
                    System.exit(1);
                default: System.out.println("Enter the correct option");
            }
        }
    }
}
