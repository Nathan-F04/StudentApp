package ie.atu;

public class Student {
    String name;
    String email;
    String course;

    //Getters
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getCourse() {
        return course;
    }
    //Setters
    public void setCourse(String course) {
        this.course = course;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setName(String name) {
        this.name = name;
    }
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
