package corejava.collection.assignment02.Assignment3.solution;
import corejava.collection.assignment02.Assignment3.model.Library;

import java.util.*;

public class WithLibrary {
    private List<Library> libraryArrayList;

    public  WithLibrary(List<Library> libraryArrayList ) {

        this.libraryArrayList=libraryArrayList;
    }

    public void calculateAnswer(){
        HashMap<String,Integer> highest = new HashMap<String,Integer>();
        Iterator<Library> it = libraryArrayList.iterator();
        while(it.hasNext())
        {
            Library lib = it.next();
            if(highest.containsKey(lib.getLibraryName()))
            {
                highest.replace(lib.getLibraryName(),Math.max(highest.get(lib.getLibraryName()), lib.getVersion()));
            }
            else
            {
                highest.put(lib.getLibraryName(), lib.getVersion());
            }
        }
        Set<String> st = new HashSet<String>();
        Iterator<Library>it1=libraryArrayList.iterator();
        while(it1.hasNext())
        {
            Library lib = it1.next();
            if(lib.getVersion()<highest.get(lib.getLibraryName()))
            {
                st.add(lib.getProductName());
            }
        }
        for(String s:st)
        {
            System.out.println(s);
        }
    }
}
