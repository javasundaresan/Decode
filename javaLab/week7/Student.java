package week7;
public abstract class Student extends Person{



  public String name;

  public int rollNo;

  public double cgpa;

  protected int noOfCourse;

  public Course[] courseEnrolled;



  public  Student()

  {

          name=null;

          rollNo=0;

          cgpa=0;

          noOfCourse=0;

          courseEnrolled=new Course[5];

  }

  public  Student(String nm,int rn)

  {

          name=nm;

          rollNo=rn;

          noOfCourse=0;

          cgpa=0;

          courseEnrolled=new Course[5];

  }



  public void setName(String s)

  {

          name=s;

  }



  public String getName()

  {

          return name;

  }



  public void setRollNo(int s)

  {

          rollNo=s;

  }



  public int getRollNo()

  {

          return rollNo;

  }

  public int getNoOfCourse()

  {

          return noOfCourse;

  }

  /*public void setCgpa(double s)
   *
   *      {
   *
   *                       cgpa=s;
   *
   *                              }*/



  public double getCgpa()

  {

          return cgpa;

  }





  public void addCourse(Course c1)

  {

          courseEnrolled[ noOfCourse++]=c1;

  }



  public void dropCourse(Course c1)

  {    int i;

          for( i=0; i<noOfCourse; i++)

          {

                  if(courseEnrolled[i].getName().equals(c1.getName()))

                  {

                          courseEnrolled[i].setName(null);

                          courseEnrolled[i].setInstructor(null);

                          courseEnrolled[i].setHour(0);

                          courseEnrolled[i].setCredit(0);

                          courseEnrolled[i].setGrade(0);

                          break;

                  }

          }

          if(i==noOfCourse)

          {

                  System.out.println("No course found");

          }

  }

  public double calculateCgpa()

  {

          double s=0.0;



          for(int i=0; i<noOfCourse; i++)

          {

                  s=s+ courseEnrolled[i].getGrade()*courseEnrolled[i].getCredit();

          }

          double cs=0.0;



          for(int i=0; i<noOfCourse; i++)

          {

                  cs=cs+ courseEnrolled[i].getCredit();

          }

          cgpa=s/cs;



          return cgpa;

  }

  public String toString()

  {

          return "Name of the student: " + name + "\nRoll no: " + rollNo + "\nCgpa: " + cgpa + "\nNo of course"+ noOfCourse;

  }



  public abstract boolean checkMaxCredits();



}