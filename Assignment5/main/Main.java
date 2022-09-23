package corejava.collection.assignment02.Assignment5.main;
import corejava.collection.assignment02.Assignment5.model.Student;
import corejava.collection.assignment02.Assignment5.parser.StudentParsing;
import corejava.collection.assignment02.Assignment5.solution.findDepartmentAndId;
import java.util.*;
public class Main {
    public static void main(String[] args) {
try {
//        String [] input = {"22, Rajan Anand, Engineering,1600000",
//                "23, Swati Patil, Testing,800000",
//                "27, Vijay Chawda, Engineering,800000",
//                "29, Basant Mahapatra, Engineering,600000",
//                "32, Ajay Patel, Testing,350000",
//                "34, Swaraj Birla, Testing,350000"};
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
