package corejava.collection.assignment02.Assignment6.model;

public class Candidate {
    private Integer candidateId;
    private String candidateName;
    private String place;
    private Integer candidateVotes;

    public Candidate(Integer candidateId, String candidateName, String place, Integer candidateVotes) {
        this.candidateId = candidateId;
        this.candidateName = candidateName;
        this.place = place;
        this.candidateVotes = candidateVotes;
    }

    public Integer getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(Integer candidateId) {
        this.candidateId = candidateId;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Integer getCandidateVotes() {
        return candidateVotes;
    }

    public void setCandidateVotes(Integer candidateVotes) {
        this.candidateVotes = candidateVotes;
    }


    @Override
    public String toString() {
        return java.text.MessageFormat.format("candidateId: {0}\t candidateName: {1}\t Place: {2}\t candidateVotes: {3}\n", candidateId,candidateName,place,candidateVotes);

    }
}