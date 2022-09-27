package corejava.collection.assignment02.Assignment8.main;
import corejava.collection.assignment02.Assignment8.solution.Isogram;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("lumberjacks");
        list.add("background");
        list.add("downstream");
        list.add("six-year-old");
        list.add("Anushka");
        Isogram iso=new Isogram();
        for (String i : list) {
            System.out.println(iso.isIsogram(i));
        }
    }
}
