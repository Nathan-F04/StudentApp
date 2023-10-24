package ie.atu;

import java.util.Scanner;
public class Student {
    private String name;
    private String email;
    private String course;

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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter course:");
        this.course=scanner.nextLine();
    }
    public void setEmail(String email) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter email:");
        this.email=scanner.nextLine();
    }
    public void setName(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name:");
        this.name=scanner.nextLine();
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
    public void displayDetails(){
        System.out.print("Name: " + getName() + " Email: " + getEmail() + " Course: " + getCourse());
    }
}
