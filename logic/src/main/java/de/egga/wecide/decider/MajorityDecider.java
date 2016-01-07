package de.egga.wecide.decider;

import de.egga.wecide.votes.Vote;
import de.egga.wecide.votes.VoteStatus;

import java.util.List;

import static de.egga.wecide.votes.VoteStatus.*;


public class MajorityDecider implements Decider {

    @Override
    public VoteStatus evaluateVotes(List<Vote> votes) {

        long numberOfProVotes = votes.stream().filter(v -> v.isPro()).count();
        float halfOfTheVotes = (float) votes.size() / 2;

        if (numberOfProVotes > halfOfTheVotes) {
            return PRO;
        } else {
            return CON;
        }
    }
}
