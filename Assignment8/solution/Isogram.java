package corejava.collection.assignment02.Assignment8.solution;

import java.util.Arrays;

public class Isogram {
   public static boolean isIsogram(String str)
    {

        str = str.toLowerCase();
        int len = str.length();

        char arr[] = str.toCharArray();

        Arrays.sort(arr);
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] == arr[i + 1])
                return false;
        }
        return true;
    }
}
