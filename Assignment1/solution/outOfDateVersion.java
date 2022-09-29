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
        HashMap<String,String>highest = new HashMap<String,String>();
        for (Software sft: softwareList)
        {
            if(highest.containsKey(sft.getOperatingSystem()))
            {
                String prev = highest.get(sft.getOperatingSystem());
                String curr = sft.getVersion();
                StringTokenizer tokens = new StringTokenizer(prev,".");
                StringTokenizer tokens1 = new StringTokenizer(curr,".");
                while(tokens.hasMoreTokens()&&tokens1.hasMoreTokens())
                {
                    int p = Integer.parseInt(tokens.nextToken());
                    int c = Integer.parseInt(tokens1.nextToken());
                    if(p!=c)
                    {
                        highest.replace(sft.getOperatingSystem(),p>c?highest.get(sft.getOperatingSystem()):sft.getVersion());
                    }
                }


            }
            else
            {
                highest.put(sft.getOperatingSystem(), sft.getVersion());
            }
            //System.out.println(highest.get(sft.getOperatingSystem()));
        }
        return highest;
    }
public void operatingSystemFinding(HashMap<String,String>highest){
    HashMap<String,Integer>count = new HashMap<String,Integer>();
    Iterator<Software> it1 = softwareList.iterator();
    while(it1.hasNext())
    {
        Software sft = it1.next();
        if(!sft.getVersion().equals(highest.get(sft.getOperatingSystem())))
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


