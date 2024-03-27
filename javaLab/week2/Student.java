public class Student {
  private int roll_no;
  private double cgpa;
  private String name;
  private static int numberOfCoursesEnrolled;

  // Default constructor
  public Student() {
      this.roll_no = 0;
      this.cgpa = 0.0;
      this.name = "";
  }

  // Constructor with arguments
  public Student(int roll_no, double cgpa, String name) {
      this.roll_no = roll_no;
      this.cgpa = cgpa;
      this.name = name;
  }

  // Getters and Setters
  public int getRoll_no() {
      return roll_no;
  }

  public void setRoll_no(int roll_no) {
      this.roll_no = roll_no;
  }

  public double getCgpa() {
      return cgpa;
  }

  public void setCgpa(double cgpa) {
      this.cgpa = cgpa;
  }

  public String getName() {
      return name;
  }

  public void setName(String name) {
      this.name = name;
  }

  // Static method to get the number of courses enrolled
  public static int getNumberOfCoursesEnrolled() {
      return numberOfCoursesEnrolled;
  }

  // Static method to enroll in courses
  public static void enrollCourses(int numberOfCourses) {
      numberOfCoursesEnrolled += numberOfCourses;
  }

  // Method to calculate CGPA based on grades obtained
  public void calculateCGPA(double[] grades) {
      double totalGradePoints = 0;
      for (double grade : grades) {
          totalGradePoints += grade;
      }
      this.cgpa = totalGradePoints / grades.length;
  }

  public String toString() {
      return "Student Details: \n" +
              "Roll No: " + roll_no + "\n" +
              "Name: " + name + "\n" +
              "CGPA: " + cgpa + "\n" +
              "Number of Courses Enrolled: " + numberOfCoursesEnrolled + "\n";
  }

  public static void main(String[] args) {
      // Creating objects of Student and testing methods
      Student student1 = new Student(1, 0.0, "John Doe");
      Student student2 = new Student(2, 0.0, "Jane Smith");

      System.out.println("Before enrolling courses:");
      System.out.println(student1.toString());
      System.out.println(student2.toString());

      double[] grades = {3.5, 4.0, 3.7, 3.8}; // Example grades for courses
      student1.calculateCGPA(grades);
      student2.calculateCGPA(grades);

      Student.enrollCourses(4); // Enrolling in 4 courses

      System.out.println("After enrolling courses and calculating CGPA:");
      System.out.println(student1.toString());
      System.out.println(student2.toString());

      System.out.println("Total number of courses enrolled by all students: " + Student.getNumberOfCoursesEnrolled());
  }
}