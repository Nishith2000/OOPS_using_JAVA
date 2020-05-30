package Program2;

public class College {
        String usn;
        Address adr;
        College(String u, Address a)
        {
            usn = u;
            adr = new Address(a.st_no,a.city,a.state,a.country);
        }
        void displayC()
        {
            System.out.println("USN : "+usn);
            adr.display();
        }
    }

