package corejava.collection.assignment02.Assignment7.main;
import corejava.collection.assignment02.Assignment7.solution.Sublist;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);

        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        Sublist op = new Sublist();
        op.isSublist(list1, list2);
    }
}
