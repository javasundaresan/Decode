package week6;
import java.util.List;
public class UGStudent extends Student{
    private String branch;

    public UGStudent(){
    }
    public UGStudent(String fname, String lname, int age, String emailID, int rollNo, double cgpa, List<Course> crses, String branch) {
        super(fname, lname, age, emailID,rollNo,cgpa,crses);
        this.branch = branch;
    }

    @Override
    public String toString(){
        return "UG STudent\n"+
                super.toString()+"\n"+
                "Branch: "+branch;
    }

    @Override
    public boolean checkMaxCredits(){
        int sum=0;
        for (Course course: courses){
            sum += course.getCredits();
        }
        return sum<=24;
    }
}