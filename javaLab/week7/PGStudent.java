package week7;

public class PGStudent  extends Student implements Distinction{

  public int project;
  PGStudent(String nm,int rn,int n)
  {
          super(nm,rn);
          project=n;
  }

  public String toString()
  {
          return super.toString() + " Branch" + project;
  }

  public boolean checkMaxCredits()
  {int s=0;
          for(int i=0; i<super.noOfCourse; i++)
          {
                  s+=this.courseEnrolled[i].getCredit();
          }
          s+=project*12;
          return s<=30;
  }

  public boolean hasDistinction() {
          return (this.cgpa>=8.5);
  }
}