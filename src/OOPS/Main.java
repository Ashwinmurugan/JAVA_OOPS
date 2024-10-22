package OOPS;

public class Main {
    public static void main() {

        System.out.println("--- Single Inheritance STUDENT call --- ");
        Student s1 = new Student();
        s1.Display();
        System.out.println();


        System.out.println("--- Multi Inheritance  --- ");

        ug ugStudent = new ug();
        System.out.println("UG Student Details:");
        ugStudent.Display();
        ugStudent.Display_ug();

        System.out.println("--- Hierarchical Inheritance  --- ");

        Studs stu_1 = new Studs();
        System.out.println("Student Details:");
        stu_1.Display();

        Faculty faculty = new Faculty();
        System.out.println("\nFaculty Details:");
        faculty.Display();

        System.out.println();

        System.out.println("---- Multiple Inheritance Interface---- ");
      //Multiple_Inheritance m1=new Multiple_Inheritance();  bez interface is abstract
        Cat c=new Cat();
        c.sound();
        c.greet();
    }
}

