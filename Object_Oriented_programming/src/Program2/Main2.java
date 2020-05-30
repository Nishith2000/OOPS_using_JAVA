package Program2;

import java.util.Scanner;
public class Main2 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        String nm, un;
        Address a = new Address();
        System.out.println("Enter the No. of Students: ");
        n = sc.nextInt();
        Student st[] = new Student[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the Student's Name: ");
            nm = sc.next();
            System.out.println("Enter Student's USN : ");
            un = sc.next();
            System.out.println("Enter Street No. : ");
            a.st_no = sc.nextInt();
            System.out.println("Enter City Name : ");
            a.city = sc.next();
            System.out.println("Enter State Name : ");
            a.state = sc.next();
            System.out.println("Enter Country Name : ");
            a.country = sc.next();
            st[i] = new Student(nm,un,a);
        }
        System.out.println("Enter the No. of College Students: ");
        n = sc.nextInt();
        College co[] = new College[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the Student's USN: ");
            un = sc.next();
            System.out.println("Enter Street No. : ");
            a.st_no = sc.nextInt();
            System.out.println("Enter City Name : ");
            a.city = sc.next();
            System.out.println("Enter State Name : ");
            a.state = sc.next();
            System.out.println("Enter Country Name : ");
            a.country = sc.next();
            co[i] = new College(un,a);
        }
        System.out.println("Enter the No. of Employees: ");
        n = sc.nextInt();
        Employee em[] = new Employee[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the Employee's Name: ");
            nm = sc.next();
            System.out.println("Enter Employee ID : ");
            un = sc.next();
            System.out.println("Enter Street No. : ");
            a.st_no = sc.nextInt();
            System.out.println("Enter City Name : ");
            a.city = sc.next();
            System.out.println("Enter State Name : ");
            a.state = sc.next();
            System.out.println("Enter Country Name : ");
            a.country = sc.next();
            em[i] = new Employee(nm,un,a);
        }
        System.out.println("########################STUDENT DATABASE########################\n");
        for(int i=0;i<st.length;i++)
           st[i].displayS();
        System.out.println("\n\n");
        System.out.println("#######################COLLEGE DATABASE########################\n");
        for(int i=0;i<co.length;i++)
            co[i].displayC();
        System.out.println("\n\n");
        System.out.println("########################EMPLOYEE DATABASE########################\n");
        for(int i=0;i<em.length;i++)
            em[i].displayE();
        System.out.println("\n\n");
    }
}
