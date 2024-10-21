package OOPS;

// SINGLE INHERITANCE

public class Member {
    String Name;
    float RegNo;
    int Marks;

    Member()
    {
        this.Name="constructor Name";
        this.Marks=7;
        this.RegNo=107;

    }
    void Display()
    {
        System.out.println("member Name:  "+Name);
        System.out.println("member RegNo:  "+RegNo);
        System.out.println("member Marks:  "+Marks);
    }
}
class Student extends Member{
    String Course;
    String Certificate;
    String Address;
    long phone;

    Student()
    {
        this.Course="constructor IT";
        this.Certificate="JAVA";
        this.Address="COIMBATORE";
        this.phone=422852;

    }
    void Display()
    {
        super.Display();
        System.out.println("Student Course:  "+Course);
        System.out.println("Student Course:  "+Certificate);
        System.out.println("Student Address:  "+Address);
        System.out.println("Student Phone:  "+phone);

    }

}

