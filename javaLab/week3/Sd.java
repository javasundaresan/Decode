public class Sd {
  private String name;
  private int rollno;
  private double cgpa;
  private int noOfCourse;
  private Course[] noofcourseEnrolled;
  public Sd(){
    name="";
    rollno=0;
    cgpa=0.0;
    noOfCourse=0;
    noofcourseEnrolled=new Course[5];
  } 
  public Sd(String nm,int rn){
    this.name=nm;
    this.rollno=rn;
    this.cgpa=0.0;
    this.noOfCourse=0;
    noofcourseEnrolled=new Course[5];
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
    rollno=s;
  }
  public int getRoll()
  {
    return rollno;
  }
  public int getNoOfCourse(){
    return noOfCourse;
  }
  public void addCourse(Course c1){
    noofcourseEnrolled[noOfCourse++]=c1;
  }
  public void dropCourse(Course c1)
  {
    int i=0;
    for(i=0;i<noOfCourse;i++)
    {
      if(noofcourseEnrolled[i]!=null && noofcourseEnrolled[i].getname().equals(c1.getName()))
      {
        noofcourseEnrolled[i]=null;
        break;
      }
    }
    if(i==noOfCourse)
    {
      System.out.println("Course not found");
    }
  }
  public double calculateCgpa(){
    double s=0.0,cs=0.0;
    for(int i=0;i<noOfCourse;i++)
    {
      if(noofcourseEnrolled[i]!=null)
      {
        s+=noofcourseEnrolled[i].getGrade()*noofcourseEnrolled[i].getCredit();
        cs+=noofcourseEnrolled[i].getCredit();
      }
    }
    this.cgpa=s/cs;
    return cgpa;
  }
  public String toString()
  {
    return String.format("%s %s %s %d", "Name:",name  ," Roll:" ,rollno);
  }
}
