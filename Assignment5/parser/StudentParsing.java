package corejava.collection.assignment02.Assignment5.parser;
import corejava.collection.assignment02.Assignment5.mapping.Datamap;
import corejava.collection.assignment02.Assignment5.model.Student;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.io.BufferedReader;
public class StudentParsing {

    public List<Student> parseArray(String[] inputData) {
        List<Student> list = new ArrayList<Student>();
        for (String data : inputData) {
            Student student = Datamap.map(data);
            list.add(student);
        }
        return list;
    }

    public List<Student> parseCSvFile(String filePath) {
        List<Student> list = new ArrayList<Student>();
        File file = new File(filePath);
        BufferedReader br =null;
        try  {

             br=new BufferedReader(new FileReader(file));
            String stf;

            while ((stf = br.readLine()) != null) {
                Student student = Datamap.map(stf);
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

