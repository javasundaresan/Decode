package week6;
import java.util.List;
public class PGStudent extends Student{

    private int project;

    public PGStudent(){
    }
    public PGStudent(String fname, String lname, int age, String emailID, int rollNo, double cgpa, List<Course> crses, int project) {
        super(fname, lname, age, emailID,rollNo,cgpa,crses);
        this.project = project;
    }

    @Override
    public String toString(){
        return "PG STudent\n"+
                super.toString()+"\n"+
                "No. of Projects: "+project;
    }

    @Override
    public boolean checkMaxCredits() {
        int sum = 12*project;
        for (Course course: courses){
            sum += course.getCredits();
        }
        return sum<=30;
    }

}