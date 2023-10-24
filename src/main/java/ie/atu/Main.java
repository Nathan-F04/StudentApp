package ie.atu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Create new Student Objects
        Student student1=new Student();

        // Get user input for student 2

        //Student 1 setting info
        Scanner scanner =new Scanner(System.in);

        System.out.print("Enter name:");
        student1.setName(scanner.nextLine());

        System.out.print("Enter email:");
        student1.setEmail(scanner.nextLine());

        System.out.print("Enter course:");
        student1.setCourse(scanner.nextLine());
        //Method to get user input

        student1.setName(student1.getName());
        student1.setEmail(student1.getEmail());
        student1.setCourse(student1.getCourse());
        //adding sample strings to paramaterised constructors
        Student student2=new Student("nameSample");
        Student student3=new Student("nameSample2","emailSample","courseSample");

        student2.setEmail(student1.getEmail());
        student2.setCourse(student1.getCourse());

        // Call the display info method
        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
    }
}