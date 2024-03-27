package week6;
import java.util.Comparator;
public class UGStudentComparator implements Comparator<UGStudent> {

    @Override
    public int compare(UGStudent o1, UGStudent o2) {
        if(o1.cgpa > o2.cgpa)
            return 1;
        else if(o1.cgpa < o2.cgpa)
            return -1;
        else
            return 0;
    }

}