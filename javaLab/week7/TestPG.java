package week7;
import java.util.*;
public class TestPG {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);

    PGStudent ugs=new PGStudent("VARSHA", 2021103060, 1);
    Course c1=new Course("Java Programming","Sudha",6,7,inp.nextInt());
    Course c2=new Course("Data Structures and Algorithms","ESP",7,7,inp.nextInt());
    Course c3=new Course("Operating Systems","GS Mahalakshmi",7,4,inp.nextInt());
    ugs.addCourse(c1);
    ugs.addCourse(c2);

    ugs.addCourse(c3);
    System.out.println(ugs.calculateCgpa());
     System.out.print("For Student:  " + ugs.checkMaxCredits() + "Distinction :" + ugs.hasDistinction());
    }
}
