package corejava.collection.assignment02.Assignment1.solution;
import corejava.collection.assignment02.Assignment1.model.Software;

import java.util.*;
public class outOfDateVersion {
    private List<Software> softwareList;

    public outOfDateVersion(List<Software> studentArrayList ) {

        this.softwareList=studentArrayList;
    }

    public void findOldVersion() {
        Set<String>st = new HashSet<>();
        HashMap<String,Double>highest = new HashMap<String,Double>();
        Iterator<Software> it = softwareList.iterator();
        while(it.hasNext())
        {
            Software sft = it.next();
            if(highest.containsKey(sft.getOperatingSystem()))
            {
                highest.replace(sft.getOperatingSystem(),Math.max(sft.getVersion(), highest.get(sft.getOperatingSystem())));
            }
            else
            {
                highest.put(sft.getOperatingSystem(), sft.getVersion());
            }
        }

        HashMap<String,Integer>count = new HashMap<String,Integer>();
        Iterator<Software> it1 = softwareList.iterator();
        while(it1.hasNext())
        {
            Software sft = it1.next();
            if(sft.getVersion() < highest.get(sft.getOperatingSystem()))
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

