package Program2;

public class Address {
    int st_no;
    String state,city,country;
    Address()
    {
        st_no = 0;
        state = null;
        city = null;
        country = null;
    }
    Address(int st, String ci, String s ,String co)
    {
        st_no = st;
        state = s;
        city = ci;
        country = co;
    }
    void display()
    {
        System.out.println("Street No. : "+st_no);
        System.out.println("State : "+state);
        System.out.println("City : "+city);
        System.out.println("Country : "+country);
    }
}
