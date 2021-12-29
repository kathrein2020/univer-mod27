package Compr;
import Student.Student;
import org.apache.commons.lang3.StringUtils;

public class StFullNameCompr implements StCompr{
    @Override
    public int compare(Student o1, Student o2) {
        return StringUtils.compare(o1.getFullName(), o2.getFullName());
    }
}
