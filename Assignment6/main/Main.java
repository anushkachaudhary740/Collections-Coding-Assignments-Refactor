package corejava.collection.assignment02.Assignment6.main;
import corejava.collection.assignment02.Assignment6.parser.CandidateParsing;
import corejava.collection.assignment02.Assignment6.solution.HighestVotes;
import corejava.collection.assignment02.Assignment6.model.Candidate;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
     try {
        CandidateParsing inputParser = new CandidateParsing();
        // For using CSV file
        String filePath = "/home/anushkac/Downloads/Java Traning/src/corejava/collection/assignment02/Assignment6/inputfile/fileinput.csv";
        List<Candidate> candidateList= inputParser.parseCSvFile(filePath);

        HighestVotes om = new HighestVotes(candidateList);
        Set name = om.findPlaceName();
        om.findPlaceAndId(name);
    }catch(Exception e){
       throw new RuntimeException(e);
   }

    }
}
