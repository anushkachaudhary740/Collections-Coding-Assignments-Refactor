package corejava.collection.assignment02.Assignment4.main;
import corejava.collection.assignment02.Assignment4.parser.StudentParser;
import corejava.collection.assignment02.Assignment4.solution.GetAvgMark;
import corejava.collection.assignment02.Assignment4.model.Student;
import java.io.*;

import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        try {
            StudentParser inputParser = new StudentParser();

            String filePath = "/home/anushkac/Downloads/Java Traning/src/corejava/collection/assignment02/Assignment4/inputfile/fileinput.csv";
            List<Student> studentList = inputParser.parseCSvFile(filePath);
            GetAvgMark om = new GetAvgMark(studentList);

            Integer fileMinIdInList = om.fileFindMinimumIdInList();

            Float fileAverage = om.fileFindAverage(fileMinIdInList);
            om.filePrintOutput(fileAverage);

        }catch (Exception e){
            throw new InvalidPropertiesFormatException(e);
        }
    }

}