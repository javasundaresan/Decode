package week7;
interface Distinction
    {
          public  boolean hasDistinction();
    }


public class UGStudent extends Student implements Comparable<UGStudent>,Distinction{

     public String branch;

     UGStudent(String nm,int rn,String br)
     {
         super(nm,rn);
         branch=br;
     }

     public String toString()
     {
        return super.toString() + " Branch" + branch;
     }

    @Override
    public int compareTo(UGStudent o) {
        if(this.getCgpa() > o.getCgpa())
        return 1;
        else
        return -1;
    }

    public boolean checkMaxCredits()
    {
         int s=0;
        for(int i=0; i<super.noOfCourse; i++)
        {
          s+=this.courseEnrolled[i].getCredit();
        }
        return s<=24;
    }

    public boolean hasDistinction()
    {
         return (this.cgpa>=8.5);
    }
}