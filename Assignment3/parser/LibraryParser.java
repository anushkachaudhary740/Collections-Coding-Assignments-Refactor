package corejava.collection.assignment02.Assignment3.parser;
import corejava.collection.assignment02.Assignment3.mapping.LibraryMapping;
import corejava.collection.assignment02.Assignment3.model.Library;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LibraryParser {
    public List<Library> parseArray(String[] inputData) {
        List<Library> list = new ArrayList<Library>();
        for (String data : inputData) {
            Library library = LibraryMapping.map(data);
            list.add(library);
        }
        return list;
    }

    public List<Library> parseCSvFile(String filePath) {
        List<Library> list = new ArrayList<Library>();
        File file = new File(filePath);
        BufferedReader br=null;
        try  {

            br = new BufferedReader(new FileReader(file));
            String stf;

            while ((stf = br.readLine()) != null) {
               Library library = LibraryMapping.map(stf);
                if (library != null) {
                    list.add(library);
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
