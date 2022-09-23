package corejava.collection.assignment02.Assignment6.solution;
import corejava.collection.assignment02.Assignment6.model.Candidate;

import java.util.*;

public class HighestVotes {
    private final List<Candidate> candidateArrayList;

    public  HighestVotes(List<Candidate> candidateArrayList ) {

        this.candidateArrayList=candidateArrayList;
    }

    public Set findPlaceName() {
        Set<String> places = new HashSet<>();
        Iterator<Candidate> it1 = candidateArrayList.iterator();
        while (it1.hasNext()) {
            Candidate cd = it1.next();
            places.add(cd.getPlace());
        }

        return places;
    }
    public void findPlaceAndId(Set places){
        for (Object place : places) {
            List<Integer> votes = new ArrayList<>();
            Iterator<Candidate> it = candidateArrayList.iterator();
            while (it.hasNext()) {
                Candidate values = it.next();
                String getPlace = values.getPlace();

                if (place.equals(getPlace)) {
                    votes.add(values.getCandidateVotes());
                }
            }
            Integer maxVotes = Collections.max(votes);

            Iterator<Candidate> it2 = candidateArrayList.iterator();
            while (it2.hasNext()) {
                Candidate values = it2.next();
                Integer getVotes = values.getCandidateVotes();

                if (maxVotes == getVotes) {
                    System.out.println(values.getPlace() + ":" +values.getCandidateId());
                }
            }
        }


}


}
