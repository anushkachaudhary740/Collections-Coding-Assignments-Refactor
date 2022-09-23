package corejava.collection.assignment02.Assignment3.main;
import corejava.collection.assignment02.Assignment3.model.Library;
import corejava.collection.assignment02.Assignment3.parser.LibraryParser;
import corejava.collection.assignment02.Assignment3.solution.WithLibrary;

import java.util.List;

public class Main {
    public static void main(String[] arg) {
        try {
            LibraryParser inputParser = new LibraryParser();
            String filePath = "/home/anushkac/Downloads/Java Traning/src/corejava/collection/assignment02/Assignment3/inputfile/fileinput.csv";
            List<Library> libraryArrayList = inputParser.parseCSvFile(filePath);
            WithLibrary lb = new WithLibrary(libraryArrayList);
            lb.calculateAnswer();
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
