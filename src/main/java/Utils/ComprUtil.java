package Utils;
import Compr.*;
import Enum.StudComprList;
import Enum.UniComprList;


public class ComprUtil {

    private ComprUtil(){}

    public static StCompr getStudentComparator(StudComprList studentComparatorType) {

        switch (studentComparatorType) {

            case UNIVERSITY_ID:
                return new StUniIdCompr();
            case FULL_NAME:
                return new StFullNameCompr();
            case COURSE:
                return new StCourseCompr();
            case AVG_EXAM_SCORE:
                return new StExamCompr();
            default:
                return new StFullNameCompr();
        }
    }

    public static UniCompr getUniversityComparator(UniComprList universityComparatorType) {

        switch (universityComparatorType) {

            case ID:
                return new UniIdCompr();
            case FULL_NAME:
                 return new UniFullNameCompr();
            case SHORT_NAME:
                return new UniShortNameCompr();
            case PROFILE:
                return new UniProfileCompr();
            case YEAR:
                return new UniYearCompr();
            default:
                return new UniFullNameCompr();
        }
    }
}