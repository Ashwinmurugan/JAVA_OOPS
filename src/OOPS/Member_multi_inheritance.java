package OOPS;
//Multilevel Inheritance

public class Member_multi_inheritance {
    String Name;
    float RegNo;
    int Marks;

    Member_multi_inheritance() {
        this.Name = "constructor Name";
        this.Marks = 7;
        this.RegNo = 107;
    }

    void Display() {
        System.out.println("member Name:  " + Name);
        System.out.println("member RegNo:  " + RegNo);
        System.out.println("member Marks:  " + Marks);
    }
}

class Stud extends Member_multi_inheritance {
    String Course;
    String Certificate;
    String Address;
    long phone;

    Stud() {
        this.Course = "constructor IT";
        this.Certificate = "JAVA";
        this.Address = "COIMBATORE";
        this.phone = 422852;
    }

    void Display() {
        super.Display();
        System.out.println("Student Course:  " + Course);
        System.out.println("Student Course:  " + Certificate);
        System.out.println("Student Address:  " + Address);
        System.out.println("Student Phone:  " + phone);
    }
}

class ug extends Stud {
    int year;
    String specialization;
    boolean minor;

    ug() {
        this.year = 2024;
        this.specialization = "UI";
        this.minor = false;
    }
    void Display_ug(){
        System.out.println(year);
        System.out.println(specialization);
        System.out.println(minor);
    }
}
