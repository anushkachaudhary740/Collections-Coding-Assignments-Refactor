package corejava.collection.assignment02.Assignment9.main;
import corejava.collection.assignment02.Assignment9.solution.Anagram;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("enlists");
        list.add("google");
        list.add("inlets");
        list.add("banana");
        String word="listen";
        Anagram ana=new Anagram();
        List<String> ans = ana.listAnagrams(list, word);
        System.out.print(ans);
    }
}
