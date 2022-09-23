package corejava.collection.assignment02.Assignment1.parser;
import corejava.collection.assignment02.Assignment1.mapping.mapSoftware;
import corejava.collection.assignment02.Assignment1.model.Software;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.io.BufferedReader;
public class SoftwareParser {

    public List<Software> parseArray(String[] inputData) {
        List<Software> list = new ArrayList<Software>();
        for (String data : inputData) {
            Software customer = mapSoftware.map(data);
            list.add(customer);
        }
        return list;
    }

    public List<Software> parseCSvFile(String filePath) {
        List<Software> list = new ArrayList<Software>();
        File file = new File(filePath);
        BufferedReader br =null;
        try  {
            br = new BufferedReader(new FileReader(file));
            String stf;

            while ((stf = br.readLine()) != null) {
                Software customer = mapSoftware.map(stf);
                if (customer != null) {
                    list.add(customer);
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


