package week7;
public class Course {
  private String courseName;
  private String courseInstructor;
  private int noOfHours;
  private int noOfCredits;
  private int grade;

  public  Course()
  {
    courseName=null;
    courseInstructor=null;
    noOfHours=0;
    noOfCredits=0;
    grade=0;
  }
  public  Course(String cn,String ci,int rn,int cg,int gr)
  {
    courseName=cn;
    courseInstructor=ci;
    noOfHours=rn;
    noOfCredits=cg;
    grade=gr;
  }

  public void setName(String s)
  {
    courseName=s;
  }
  public String getName()
  {
    return courseName;
  }

  public void setInstructor(String s)
  {
    courseInstructor=s;
  }

  public String  getInstructor()
  {
    return courseInstructor;
  }
  public void setHour(int s)
  {
    noOfHours=s;

  }

  public int getHour()
  {
    return noOfHours;
  }
  public void setCredit(int s)
  {
    noOfCredits=s;
  }

  public int getCredit()
  {
    return noOfCredits;
  }
  public String toString()
  {

    return "Course Name:" + courseName + "  Instructor" + courseInstructor + "  Contact Hour:" + noOfHours + "  Credits:" + noOfCredits + " grade:" + grade;
  }

  public int getGrade()
  {
    return grade;
  }
  public void setGrade(int s)
  {
    grade=s;
  }
}