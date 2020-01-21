package concrete.model;

import interfaces.model.IBallot;

import java.util.List;

public class Election<T extends IBallot> {
    private String electionName;
    private int electionId;
    protected List<T> ballots;

    public Election(String electionName, int electionId){
        this.electionName = electionName;
        this.electionId = electionId;
    }

    public void addBallot(T ballot){
        ballots.add(ballot);
    }
}
