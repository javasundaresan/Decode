package week7;
import java.util.Arrays;
import java.util.Scanner;


public class TestUG {

    public static void main(String[] args)
    {

        Scanner inp=new Scanner(System.in);

        UGStudent[] ugs=new UGStudent[5];


          for(int i=0; i<5; i++)
         {
            System.out.println("Enter Name,Roll No and Branch");
            ugs[i]=new UGStudent(inp.next(),inp.nextInt(),inp.next());
            System.out.println("Enter 3 Grades");
            Course c1=new Course("OOAD","Sree Sharmila",18,6,inp.nextInt());
            Course c2=new Course("CA","Shiloah",7,7,inp.nextInt());
            Course c3=new Course("DFCO","Angelin Gladston",4,3,inp.nextInt());
            ugs[i].addCourse(c1);
            ugs[i].addCourse(c2);
            ugs[i].addCourse(c3);
            ugs[i].calculateCgpa();
         }

         Arrays.sort(ugs);

         for(int i=0; i<5; i++)
         {
             System.out.println(ugs[i].toString());
         }

       UGStudent ug=new UGStudent("Varsha", 2021103063, "CSE");
       System.out.println("Enter 3 grades:");
       Course c1=new Course("Programming Paradigms","MSP",4,4,inp.nextInt());
       Course c2=new Course("Software Engineering","TVG",4,3,inp.nextInt());
       Course c3=new Course("PS","Sali",6,5,inp.nextInt());
       ug.addCourse(c1);
       ug.addCourse(c2);
       ug.addCourse(c3);
       System.out.println(ug.calculateCgpa());
        System.out.print("Ugs " + ug.checkMaxCredits() + "Distinction :" + ug.hasDistinction());

    }
}