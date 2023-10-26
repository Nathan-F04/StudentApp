package ie.atu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        //Create new Student Objects
        Student student1=new Student();
        //Student 1 setting info

        System.out.print("Enter Name:");
        student1.setName(scanner.nextLine());
        System.out.print("Enter Email:");
        student1.setEmail(scanner.nextLine());
        System.out.print("Enter Course:");
        student1.setCourse(scanner.nextLine());
        //adding sample strings to paramaterised constructors


        String studentname,studentemail,studentcourse;
        System.out.print("Enter Name:");
        studentname=scanner.nextLine();
        Student student2=new Student(studentname);
        System.out.print("Enter Email:");
        student2.setEmail(scanner.nextLine());
        System.out.print("Enter Course:");
        student2.setCourse(scanner.nextLine());

        String studentname2;
        System.out.print("Enter Name:");
        studentname2=scanner.nextLine();
        System.out.print("Enter Email:");
        studentemail=scanner.nextLine();
        System.out.print("Enter Course:");
        studentcourse=scanner.nextLine();
        Student student3=new Student(studentname2,studentemail,studentcourse);
        scanner.close();
        // Call the display info method
        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
    }
}