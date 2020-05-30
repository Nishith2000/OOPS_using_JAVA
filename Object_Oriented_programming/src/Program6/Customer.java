package Program6;

import java.util.Scanner;
public class Customer {
    Account a;
    String name;
    int acc_no;
    Customer(String n, int acc, Account a)
    {
        name = n;
        acc_no = acc;
        this.a = a;
        System.out.println("Account for Customer: \t"+name+"\nand Account No. : \t"+acc_no+"\nwith Minimum deposit : Rs 500 has been Created");
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Account a = new Account();
        Customer c1 = new Customer("Nishith",101123, a);
        double amount;
        String c;
        while(true) {
            System.out.println("Enter your choice");
            System.out.println("1) DEPOSIT ");
            System.out.println("2) WITHDRAW ");
            System.out.println("3) VIEW BALANCE");
            System.out.println("4) EXIT");
            int ch = sc.nextInt();
            switch (ch)
            {
                case 1:
                    try{
                        System.out.println("Enter the Amount to be Deposited ");
                        amount = sc.nextInt();
                        System.out.println("Enter the Currency Type ");
                        c = sc.next();
                        c1.a.deposit(amount, c);
                    }
                    catch (DemonetizationException d)
                    {
                        System.out.println(d);
                    }
                    break;
                case 2:
                    System.out.println("Enter the Amount to be Withdrawn ");
                    amount = sc.nextInt();
                    c1.a.withdraw(amount);
                    break;
                case 3:
                    System.out.println("The Current Balance is: "+c1.a.currBalance());
                    break;
                case 4:
                    System.exit(0);
                    break;
                default: System.out.println("Enter A Valid option");
            }
        }
    }
}
