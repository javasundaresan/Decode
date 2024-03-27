import java.util.ArrayList;
public class Arraylist {
  private String name;
  private int rollNo;
  private double cgpa;
  private int noOfCourse;
  private ArrayList <Course> courseEnrolled=new ArrayList<Course> ();
  public Arraylist()
  {
    name=null;
    rollNo=0;
    cgpa=0.0;
    noOfCourse=0;
  }
  public Arraylist(String nm,int rn)
  {
    name=nm;
    rollNo=rn;
    cgpa=0.0;
    noOfCourse=0;
  }
  public void setName(String s)
  {
    name=s;
  }
  public String getName()
  {
    return name;
  }
  public void setRoll(int s)
  {
    rollNo=s;
  }
  public int getRoll()
  {
    return rollNo;
  }
  public int getNoOfCourse()
  {
    return  noOfCourse;
  }
  public void addCourse(Course c1)
  {
    noOfCourse++;
    courseEnrolled.add(c1);
  }
  public void dropCourse(Course c1)
  {
    if(courseEnrolled.contains(c1)) {
      courseEnrolled.remove(c1);
      noOfCourse--;
    }
    else
    {
      System.out.println("Course not found");
    }
  }
  public double calculateCgpa()
  {
    double s=0.0,cs=0.0;
    for(int i=0; i<noOfCourse; i++)
    {
      s+=courseEnrolled.get(i).getGrade() *courseEnrolled.get(i).getCredit();
      cs+=courseEnrolled.get(i).getCredit();
    }
    cgpa=s/cs;
    return cgpa;
  }
  public String toString()
  {
    return String.format("%s %s %s %d", "Name:",name  ," Roll:" ,rollNo);
  }

}