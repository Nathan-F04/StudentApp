package ie.atu;

import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args) {
        //Creating scanner
        Scanner scanner =new Scanner(System.in);

        //Create Object student1
        Student student1=new Student();

        //Student 1 setting info
        System.out.print("Enter Name:");
        student1.setName(scanner.nextLine());
        System.out.print("Enter Email:");
        student1.setEmail(scanner.nextLine());
        System.out.print("Enter Course:");
        student1.setCourse(scanner.nextLine());

        //Creating Strings for storing input for object student2 and student 3
        String studentname,studentname2,studentemail,studentcourse;

        //Getting info for student2
        System.out.print("Enter Name:");
        studentname=scanner.nextLine();

        //Creating object student2
        Student student2=new Student(studentname);
        System.out.print("Enter Email:");
        student2.setEmail(scanner.nextLine());
        System.out.print("Enter Course:");
        student2.setCourse(scanner.nextLine());

        //Getting info for student 3
        System.out.print("Enter Name:");
        studentname2=scanner.nextLine();
        System.out.print("Enter Email:");
        studentemail=scanner.nextLine();
        System.out.print("Enter Course:");
        studentcourse=scanner.nextLine();

        //Creating object student 3
        Student student3=new Student(studentname2,studentemail,studentcourse);

        //Closing scanner
        scanner.close();
        // Call the display info method
        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
    }
}