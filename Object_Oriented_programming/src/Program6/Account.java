package Program6;

public class Account {
    double balance = 500;      //Minimum Balance

    public void deposit(double amount, String c) throws DemonetizationException
    {
        if(c.equalsIgnoreCase("old") && amount>5000)
            throw new DemonetizationException(amount);
        else
            balance += amount;
        System.out.println("The Amount Rs "+amount+" has been successfully deposited");
    }

    public double currBalance()
    {
        return balance;
    }

    public void withdraw(double amount)
    {
        if(amount > balance-500)
            System.out.println("Not Possible to withdraw money as amount exceeds balance");
        else
        { balance -= amount;
          System.out.println("The Amount Rs "+amount+" has been successfully withdrawn");
        }
    }
}
