public class Sc {
  private int rollno;
  private double cgpa;
  private String name;
  private static int numberOfCoursesEnrolled;
  //Default constructor
  public Sc()
  {
    this.rollno=0;
    this.cgpa=0.0;
    this.name="";
  }
  public Sc(int rn,double cgpa,String name)
  {
    this.rollno=rn;
    this.cgpa=cgpa;
    this.name=name;
  }
  public String getname()
  {
    return name;
  }
  public void setname(String n)
  {
    this.name=n;
  }
  public int getrollno() {
    return rollno;
  }

  public void setrollno(int roll_no) {
      this.rollno = roll_no;
  }

  public double getcgpa() {
      return cgpa;
  }

  public void setcgpa(double cgpa) {
      this.cgpa = cgpa;
  }
  public static int getnoofcourse()
  {
    return numberOfCoursesEnrolled;
  }
  public static void enrollcourse(int n)
  {
    numberOfCoursesEnrolled+=n;
  }
  public String toString() {
    return "Student Details: \n" +
        "Roll No: " + rollno + "\n" +
        "Name: " + name + "\n" +
        "CGPA: " + cgpa + "\n" +
        "Number of Courses Enrolled: " + numberOfCoursesEnrolled + "\n";
  }
  public void calculateCGPA(double[] grades){
    double gradePoints=0;
    for(double grade:grades){
      gradePoints+=grade;
    }
    this.cgpa=gradePoints/grades.length;
  }
  public static void main(String[] args) {
    Sc studen1=new Sc(1,0.0,"Mohamed");
    System.out.println("Before Enrollment");
    System.out.println(studen1.toString());
    double[] grades={3.5,4.0,3.7,3.8};
    studen1.calculateCGPA(grades);
    sc.enrollcourse(4);
    System.out.println("After enroll");
    System.out.println(studen1.toString());
    System.out.println("Total number of Course enrolled : "+Sc.getnoofcourse());
  }
}
