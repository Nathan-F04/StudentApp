package ie.atu;

public class Main {
    public static void main(String[] args) {

        //Create new Student Objects
        Student student1=new Student();
        Student student2=new Student();
        Student student3=new Student();

        // Get user input for student 2

        //Student 1 setting info
        student1.setName(student1.getName());
        student1.setEmail(student1.getEmail());
        student1.setCourse(student1.getCourse());


        student2.setEmail(student1.getEmail());
        student2.setCourse(student1.getCourse());

        // Call the display info method
        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
    }
}