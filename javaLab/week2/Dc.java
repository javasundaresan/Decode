import java.util.*;
public class Dc {
  private String courseName;
  private String courseInstructor;
  private int noOfHours;
  private int noOfCredits;
  private static int noOfEnrollment;
  //constructor
  public Dc()
  {
    courseName="";
    courseInstructor="";
    noOfHours=0;
    noOfCredits=0;
    noOfEnrollment=0;
  }
  public Dc(String cn,String ci,int nh,int nc)
  {
    this.courseName=cn;
    this.courseInstructor=ci;
    this.noOfHours=nh;
    this.noOfCredits=nc;
  }
  public String toString()
  {
    return "Course name : "+courseName+"\n"+
    "course instructor : "+courseInstructor+"\n"+
    "number of hours : "+noOfHours+"\n"+
    "number of credits : "+noOfCredits+"\n"+
    "number of students enroll : "+noOfEnrollment+"\n";
  }
  //Getter and setters
  public String getCourseName()
  {
    return courseName;
  }
  public void setCourseName(String cn)
  {
    this.courseName=cn;
  }
  public String getCourseInstructor()
  {
    return courseInstructor;
  }
  public void setCourseInstructor(String ci)
  {
    this.courseInstructor=ci;
  }
  public int getNoofHours() {
    return noOfHours;
  }

  public void setNoofHours(int noofHours) {
      this.noOfHours = noofHours;
  }

  public int getNoofCredits() {
      return noOfCredits;
  }

  public void setNoofCredits(int noofCredits) {
      this.noOfCredits = noofCredits;
  }
  public static void enroll(int n)
  {
    noOfEnrollment+=n;
  }
  public static void drop(int n)
  {
    noOfEnrollment-=n;
  }
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    Dc Course1=new Dc();
    String cn,ci;
    int nh,nc;
    System.out.println("Enter Course name : ");
    cn=in.nextLine();
    System.out.println("Enter Courrse Instructor name : ");
    ci=in.nextLine();
    System.out.println("Enter no of hours : ");
    nh=in.nextInt();
    System.out.println("Enter no of credits : ");
    nc=in.nextInt();
    System.out.println("Before Enrollment ");
    Course1=new Dc(cn,ci,nh,nc);
    System.out.println(Course1.toString());
    Dc.enroll(20);
    System.out.println("After Enrollmet");
    System.out.println(Course1.toString());
    Dc.drop(5);
    System.out.println("After Drop");
    System.out.println(Course1.toString());
  }
}
