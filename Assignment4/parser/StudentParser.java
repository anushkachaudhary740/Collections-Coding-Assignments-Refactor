package corejava.collection.assignment02.Assignment4.parser;
import corejava.collection.assignment02.Assignment4.mapping.studentMap;
import corejava.collection.assignment02.Assignment4.model.Student;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.io.BufferedReader;
public class StudentParser {

    public List<Student> parseArray(String[] inputData) {
        List<Student> list = new ArrayList<Student>();
        for (String data : inputData) {
            Student student = studentMap.map(data);
            list.add(student);
        }
        return list;
    }

    public List<Student> parseCSvFile(String filePath) {

        List<Student> list = new ArrayList<Student>();
        File file = new File(filePath);
        BufferedReader br=null;
        try  {
            br=new BufferedReader(new FileReader(file));
            String stf;

            while ((stf = br.readLine()) != null) {
                Student student = studentMap.map(stf);
                if (student != null) {
                    list.add(student);
                    //System.out.println(stf);
                }
            }
        } catch (IOException ioe) {
            throw new RuntimeException(ioe);
        } catch (Exception exe) {
            throw new RuntimeException(exe);
       } finally {
           try {
               br.close();
           } catch (IOException e) {
              throw new RuntimeException(e);
           }
       }
        return list;
    }
}

