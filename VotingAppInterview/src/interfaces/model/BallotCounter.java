package interfaces.model;

import concrete.model.Candidate;

import java.util.List;

public interface BallotCounter{

    Candidate getWinner(List<Candidate> candidates, List<IBallot> ballots);

    int getVotesForCandidate(List<IBallot> ballots)
}
