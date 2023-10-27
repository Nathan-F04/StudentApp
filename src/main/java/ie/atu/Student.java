package ie.atu;

public class Student {

    //Creating private strings to store info for students names, emails, and courses
    private String name;
    private String email;
    private String course;

    //Getters below
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getCourse() {
        return course;
    }

    //Setters below
    public void setCourse(String course) {
        this.course = course;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    //Constructor 3 parameters
    public Student(String name,String email,String course) {
        this.name = name;
        this.email=email;
        this.course=course;
    }

    //Constructor name
    public Student(String name) {
        this.name = name;

    }

    //Default constructor
    public Student() {
        this.name = " ";
        this.email=" ";
        this.course=" ";
    }
    //Displaying details method
    public void displayDetails(){
        System.out.print("\nName: " + getName() + " Email: " + getEmail() + " Course: " + getCourse());
    }
}
