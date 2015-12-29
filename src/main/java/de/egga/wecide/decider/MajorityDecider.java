package de.egga.wecide.decider;

import de.egga.wecide.decision.DecisionStatus;
import de.egga.wecide.votes.Vote;

import java.util.List;

public class MajorityDecider implements Decider {

    @Override
    public DecisionStatus evaluateVotes(List<Vote> votes) {

        long numberOfProVotes = votes.stream().filter(v -> v.isPro()).count();
        float halfOfTheVotes = (float) votes.size() / 2;

        if (numberOfProVotes > halfOfTheVotes) {
            return DecisionStatus.PRO;
        } else {
            return DecisionStatus.CON;
        }
    }
}
