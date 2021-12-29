package Compr;
import Student.Student;
import org.apache.commons.lang3.StringUtils;

public class StUniIdCompr implements StCompr {
    @Override
    public int compare(Student o1, Student o2) {
        return StringUtils.compare(o1.getUniversityId(), o2.getUniversityId());

    }
}