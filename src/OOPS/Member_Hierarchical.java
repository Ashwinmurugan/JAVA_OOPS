package OOPS;

// Parent class: Member_Hierarchical
public class Member_Hierarchical {
    String Name;
    float RegNo;

    Member_Hierarchical() {
        this.Name = "Member Name";
        this.RegNo = 12345;
    }

    void Display() {
        System.out.println("Member Name: " + Name);
        System.out.println("Member RegNo: " + RegNo);
    }
}

// Subclass 1: Student
class Studs extends Member_Hierarchical {
    String Course;

    Studs() {
        super();  // Calls the constructor of Member_Hierarchical
        this.Course = "Computer Science";
    }

    void Display() {
        super.Display();  // Display member details
        System.out.println("Student Course: " + Course);
    }
}

// Subclass 2: Faculty
class Faculty extends Member_Hierarchical {
    String Department;

    Faculty() {
        super();  // Calls the constructor of Member_Hierarchical
        this.Department = "Information Technology";
    }

    void Display() {
        super.Display();  // Display member details
        System.out.println("Faculty Department: " + Department);
    }
}
