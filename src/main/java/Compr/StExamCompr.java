package Compr;
import Student.Student;

public class StExamCompr implements StCompr {
    @Override
    public int compare(Student o1, Student o2) {
        return Float.compare(o2.getAvgExamScore(), o1.getAvgExamScore());
    }

}
