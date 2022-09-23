package corejava.collection.assignment02.Assignment5.main;
import corejava.collection.assignment02.Assignment5.model.Student;
import corejava.collection.assignment02.Assignment5.parser.StudentParsing;
import corejava.collection.assignment02.Assignment5.solution.findDepartmentAndId;
import java.util.*;
public class Main {
    public static void main(String[] args) {
try {

    StudentParsing inputParser = new StudentParsing();
    String filePath = "/home/anushkac/Downloads/Java Traning/src/corejava/collection/assignment02/Assignment5/inputfile/fileinput.csv";
    List<Student> studentList = inputParser.parseCSvFile(filePath);

    findDepartmentAndId op = new findDepartmentAndId(studentList);
    op.findDepartmentName();
    Set department = op.findDepartmentName();
    op.calculateAnswer(department);
}catch(Exception e){
    throw new RuntimeException(e);
}

    }

}
