package de.egga.wecide.decider;

import de.egga.wecide.decision.DecisionStatus;
import de.egga.wecide.votes.Vote;

import java.util.List;

public class MajorityDecider implements Decider {

    @Override
    public DecisionStatus evaluateVotes(List<Vote> votes) {

        long votesInFavor = votes.stream().filter(v -> v.isInFavor()).count();
        float halfOfTheVotes = (float) votes.size() / 2;

        if (votesInFavor > halfOfTheVotes) {
            return DecisionStatus.PRO;
        } else {
            return DecisionStatus.CON;
        }
    }
}
