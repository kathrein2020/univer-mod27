import Utils.JsonUtil;
import WR.xlsRead;
import WR.xlsWrite;
import Student.Student;
import University.University;
import Compr.StCompr;
import Compr.UniCompr;
import Enum.StudComprList;
import Enum.UniComprList;
import Utils.StatUtil;
import Utils.ComprUtil;
import Statistics.Statistic;


import java.io.IOException;
import java.util.List;


public class Boot {

    public static void main(String[] args) throws IOException {

        List<University> universities =
                xlsRead.readXlsUniversities("src/main/resources/universityInfo.xlsx");
//        for(University university : universities) {
//            System.out.println(university);
//        }

        UniCompr univerComparator =
                ComprUtil.getUniversityComparator(UniComprList.PROFILE);
        universities.sort(univerComparator);
        //сериализация и вывод
        String univerJson = JsonUtil.uniListToJson(universities);
        System.out.println(univerJson);

        //обратно десериалиизация
        List<University> universitiesFromJson = JsonUtil.jsonToUniList(univerJson);

        // сверяем элементы на количество элементов
        System.out.println(universities.size() == universitiesFromJson.size());

        // из файла все унивеситеты переводим на json
        universities.forEach(university -> {
            String universityJson = JsonUtil.uniToJson(university);
            // печатаем переведеные в json университеты из файла
            System.out.println(universityJson);

            //обратно десериализуем полученный universityJson ипечатем на экран для провекри
            University universityFromJson = JsonUtil.jsonToUni(universityJson);
            System.out.println(universityFromJson);
        });


        List<Student> students =
                xlsRead.readXlsStudents("src/main/resources/universityInfo.xlsx");

//        for(Student student : students) {
//            System.out.println(student);
//        }

        StCompr studentComparator =
                ComprUtil.getStudentComparator(StudComprList.AVG_EXAM_SCORE);
        students.sort(studentComparator);

        //сериализация и вывод
        String studentJson = JsonUtil.studListToJson(students);
        System.out.println(studentJson);

        //обратно десериалиизация
        List<Student> studentsFromJson = JsonUtil.jsonToStudList(studentJson);

        // сверяем элементы на количество элементов
        System.out.println(students.size() == studentsFromJson.size());

        // из файла всех cтудентов переводим на json
        students.forEach(student -> {
            String studentsJson = JsonUtil.studToJson(student);
            // печатаем переведеные в json университеты из файла
            System.out.println(studentsJson);

            //обратно десериализуем полученный universityJson и печатем на экран для провекри
            Student studentFromJson = JsonUtil.jsonToStud(studentsJson);
            System.out.println(studentFromJson);
        });


        List<Statistic> statList = StatUtil.createStat(students, universities);
        xlsWrite.writeXlsStatistics(statList, "src/main/resources/statistics.xlsx");

    }
}