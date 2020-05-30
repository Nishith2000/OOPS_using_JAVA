package Program2;

public class Student {
    String usn, name;
    Address adr;
    Student(String u, String n, Address a)
    {
        usn = u;
        name = n;
        adr = new Address(a.st_no,a.city,a.state,a.country);
    }
    void displayS()
    {
        System.out.println("USN : "+usn);
        System.out.println("Name : "+name);
        adr.display();
    }
}
