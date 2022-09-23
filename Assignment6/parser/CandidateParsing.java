package corejava.collection.assignment02.Assignment6.parser;
import corejava.collection.assignment02.Assignment6.mapping.CandidateMap;
import corejava.collection.assignment02.Assignment6.model.Candidate;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.io.BufferedReader;

import static corejava.collection.assignment02.Assignment6.mapping.CandidateMap.map;

public class CandidateParsing {

    public List<Candidate> parseArray(String[] inputData) {
        List<Candidate> list = new ArrayList<Candidate>();
        for (String data : inputData) {
            Candidate candidate = map(data);
            list.add(candidate);
        }
        return list;
    }

    public List<Candidate> parseCSvFile(String filePath) throws RuntimeException, IOException {
        List<Candidate> list = new ArrayList<Candidate>();
        File file = new File(filePath);
        BufferedReader br =null;
        try  {
            br = new BufferedReader(new FileReader(file));
            String stf;

            while ((stf = br.readLine()) != null) {
                Candidate customer = CandidateMap.map(stf);
                if (customer != null) {
                    list.add(customer);
                    //System.out.println(stf);
                }
            }
       } catch (Exception ioe) {
            throw new RuntimeException(ioe);
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


