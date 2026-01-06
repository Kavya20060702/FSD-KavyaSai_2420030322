
public class Main {
    public static void main(String[] args) {

        Student student = new Student();

        // Setting values using setters
        student.setId(101);
        student.setName("Kavya");
        student.setMarks(88.5);

        // Getting values using getters
        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Marks: " + student.getMarks());
    }
}
