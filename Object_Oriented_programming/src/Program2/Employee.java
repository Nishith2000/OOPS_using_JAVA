package Program2;

public class Employee {
        String emp_id, name;
        Address adr;
        Employee(String e, String n, Address a)
        {
            emp_id = e;
            name = n;
            adr = new Address(a.st_no,a.city,a.state,a.country);
        }
        void displayE()
        {
            System.out.println("Employee ID : "+emp_id);
            System.out.println("Name : "+name);
            adr.display();
        }
}
