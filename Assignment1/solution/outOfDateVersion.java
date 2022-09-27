package corejava.collection.assignment02.Assignment1.solution;
import corejava.collection.assignment02.Assignment1.model.Software;

import java.util.*;
public class outOfDateVersion {
    private List<Software> softwareList;

    public outOfDateVersion(List<Software> studentArrayList ) {

        this.softwareList=studentArrayList;
    }

    public HashMap<String,String> findOldVersion() {
        Set<String>st = new HashSet<String>();
        HashMap<String, String> highest = new HashMap<String, String>();
        for (Software sft : softwareList) {
            if (highest.containsKey(sft.getOperatingSystem())) {
                //highest.replace(sft.getOperatingSystem(), Math.max(sft.getVersion(), highest.get(sft.getOperatingSystem())));
                Double.toString(Math.max(Double.parseDouble(sft.getVersion()), Double.parseDouble(highest.get(sft.getOperatingSystem()))));

            } else {
                highest.put(sft.getOperatingSystem(), sft.getVersion());
            }
        }
        return highest;
    }
public void operatingSystemFinding(HashMap highest){
    HashMap<String,Integer>count = new HashMap<String,Integer>();
    Iterator<Software> it1 = softwareList.iterator();
    while(it1.hasNext())
    {
        Software sft = it1.next();
        if(sft.getVersion().equals(highest.get(sft.getOperatingSystem())))
        {
            if(count.containsKey(sft.getOperatingSystem()))
            {
                count.replace(sft.getOperatingSystem(), count.get(sft.getOperatingSystem())+1);
            }
            else
            {
                count.put(sft.getOperatingSystem(), 1);
            }
        }
    }
    for(Map.Entry<String,Integer> entry:count.entrySet())
    {
        if(entry.getValue()>1)
        {
            System.out.println(entry.getKey());
        }
    }

}

}

