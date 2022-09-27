package corejava.collection.assignment02.Assignment7.solution;

import java.util.List;

public class Sublist{
    public void isSublist(List list1, List list2) {
        int n1 = list1.size();
        int n2 = list2.size();
        if (n1 < n2 && list2.containsAll(list1) == true) {
            System.out.println("list1 is a sublist of list2");
        } else if (n1 > n2 && list1.containsAll(list2) == true) {
            System.out.println("list1 is a superlist of list2");
        } else if (n1 == n2 && list2.containsAll(list1) == true && list1.containsAll(list2) == true) {
            System.out.println("list1 is Equal to list2");
        } else {
            System.out.println("none");
        }
    }
}
