package week6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {
        // Create UG students
        List<UGStudent> ugStudents = new ArrayList<>();
        List<PGStudent> pgStudents = new ArrayList<>();

        // Create courses
        Course c1 = new Course("Math", "Instructor1", 3, 4, "Type1", "A");
        Course c2 = new Course("Physics", "Instructor2", 4, 4, "Type2", "B");
        Course c3 = new Course("Chemistry", "Instructor3", 3, 4, "Type3", "C");

        // Add UG students
        ugStudents.add(new UGStudent("John", "Doe", 20, "john.doe@example.com", 101, 8.0, null, "Computer Science"));
        ugStudents.add(new UGStudent("Alice", "Smith", 21, "alice.smith@example.com", 102, 8.5, null, "Electrical Engineering"));
        ugStudents.add(new UGStudent("Bob", "Johnson", 22, "bob.johnson@example.com", 103, 7.5, null, "Mechanical Engineering"));

        // Sort UG students based on GPA
        Collections.sort(ugStudents, new UGStudentComparator());

        // Add courses for UG students
        for (UGStudent student : ugStudents) {
            student.addCourse(c1);
            student.addCourse(c2);
            student.addCourse(c3);
        }

        // Display UG students after adding courses
        for (UGStudent student : ugStudents) {
            System.out.println(student);
            if (student.calculateDistinction()) {
                System.out.println("This UG student is distinguished.");
            }
        }

        // Add PG students
        pgStudents.add(new PGStudent("Emma", "Brown", 25, "emma.brown@example.com", 201, 9.0, null, 2));
        pgStudents.add(new PGStudent("Michael", "Wilson", 26, "michael.wilson@example.com", 202, 8.8, null, 1));
        pgStudents.add(new PGStudent("Sophia", "Taylor", 27, "sophia.taylor@example.com", 203, 8.7, null, 2));

        // Add courses for PG students
        for (PGStudent student : pgStudents) {
            student.addCourse(c1);
            student.addCourse(c2);
            student.addCourse(c3);
        }

        // Display PG students after adding courses
        for (PGStudent student : pgStudents) {
            System.out.println(student);
            if (student.calculateDistinction()) {
                System.out.println("This PG student is distinguished.");
            }
        }
    }
}