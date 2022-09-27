package corejava.collection.assignment02.Assignment9.solution;

import java.util.ArrayList;
import java.util.List;

public class Anagram {
    public static boolean anagram1(String str1,String str2)
    {
        if(str1.length()!= str2.length())
            return false;
        String str= str1.toUpperCase();
        String strt = str2.toUpperCase();

        int freq[] = new int[256];
        for(int i=0;i<str.length();i++)
        {
            freq[str.charAt(i)]++;
            freq[strt.charAt(i)]--;
        }
        for(int i=0;i<256;i++)
        {
            if(freq[i]!=0)
                return false;
        }
        return true;


    }

    public static List<String> listAnagrams(List<String> list, String w)
    {
        List<String> subList = new ArrayList<>();
        for(String i : list)
        {
            if(anagram1(i, w)==true)
            {
                subList.add(i);
            }
        }

        return subList;
    }
}
