package week6;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public abstract class Student extends Person implements DistinguishedStudent{
    protected int rollNo;
    protected double cgpa;
    protected int noOfCourses;
    protected String university;
    protected List<Course> courses;


    public Student() {
        super("", "", 0, "");
        rollNo = 0;
        cgpa = 0.0;
        courses = new ArrayList<>();
        noOfCourses = 0;
        university = "";
    }

    public Student(String fname, String lname, int age, String emailID, int rollNo, double cgpa, List<Course> crses) {
        super(fname, lname, age, emailID);
        this.rollNo = rollNo;
        this.cgpa = cgpa;
        if (crses == null)
            courses = new ArrayList<>();
        else
            courses = crses;
    }



    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public double getCgpa() {
        return cgpa;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        courses.add(course);
        this.noOfCourses = courses.size();
        if(! checkMaxCredits()){
            System.out.println("Sorry, max credits has  been surpassed!!");
            dropCourse(course);
        }
    }

    public void dropCourse(Course course) {
        courses.remove(course);
        this.noOfCourses = courses.size();
    }

    // Calculate CGPA function
    public double calculateCGPA() {
        if (courses.isEmpty()) {
            return 0; // If no courses, return 0 CGPA
        }
        Scanner scanner = new Scanner(System.in);
        double totalCredits = 0, totalGradePoints = 0;
        for (Course course : courses) {
            System.out.print("Enter the Grade Scored in "+course.getCourseName()+" :");
            int grade = scanner.nextInt();
            totalGradePoints += course.getCredits() * grade;
            totalCredits += course.getCredits();
        }

        scanner.close();
        return totalGradePoints / totalCredits;
    }

    @Override
    public boolean validateEmail(){
            String validEmail = firstName.substring(0,5)+lastName.substring(0,4)+"@"+university+".edu";
            return validEmail.equals(emailID);
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+
                "Roll No: " + rollNo + "\n" +
                "CGPA: " + cgpa + "\n" +

                "Number of Courses Enrolled: " + noOfCourses + "\n" +
                "University: "+university;
    }

    public abstract boolean checkMaxCredits();

    @Override
    public boolean calculateDistinction(){
        return cgpa>=8.5;
    }
}