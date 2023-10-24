package ie.atu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        //Create new Student Objects
        Student student1=new Student();
        //Student 1 setting info

        System.out.print("Enter name:");
        student1.setName(scanner.nextLine());

        System.out.print("Enter email:");
        student1.setEmail(scanner.nextLine());

        System.out.print("Enter course:");
        student1.setCourse(scanner.nextLine());
        //adding sample strings to paramaterised constructors

        Student student3=new Student("nameSample2","emailSample","courseSample");

        System.out.print("Enter name:");
        scanner.nextLine();
        Student student2=new Student("nameSample");
        System.out.print("Enter email:");
        student2.setEmail(scanner.nextLine());
        System.out.print("Enter course:");
        student2.setCourse(scanner.nextLine());

        // Call the display info method
        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
    }
}