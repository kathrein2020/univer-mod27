package Utils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import Student.Student;
import University.University;
import java.util.List;

public class JsonUtil {

    private JsonUtil(){}

    public static String studToJson(Student student){
        return new GsonBuilder().setPrettyPrinting().create().toJson(student);
    }

    public static String uniToJson(University universitet){
        return new GsonBuilder().setPrettyPrinting().create().toJson(universitet);
    }


    public static Student jsonToStud(String json) {
        return new Gson().fromJson(json, Student.class);
    }

    public static University jsonToUni(String json){
        return new Gson().fromJson(json, University.class);
    }



    public static String studListToJson(List<Student> students){
        return new GsonBuilder().setPrettyPrinting().create().toJson(students);
    }

    public static String uniListToJson(List<University> univers){
        return new GsonBuilder().setPrettyPrinting().create().toJson(univers);
    }

    public static List jsonToStudList(String json){
        return new Gson().fromJson(json, new TypeToken<List<Student>>() {}.getType());
    }

    public static List jsonToUniList(String json){
        return new Gson().fromJson(json, new TypeToken<List<University>>() {}.getType());
    }


}
