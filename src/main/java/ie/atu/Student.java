package ie.atu;

public class Student {
    String name;
    String email;
    String course;

    //Constructor
    public Student(String name,String email,String course) {
        this.name = name;
        this.email=email;
        this.course=course;
    }
    //Default constructor
    public Student() {
        this.name = " ";
        this.email=" ";
        this.course=" ";
    }
}
