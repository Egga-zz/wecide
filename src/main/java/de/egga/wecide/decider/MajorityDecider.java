package de.egga.wecide.decider;

import de.egga.wecide.decision.Decision;
import de.egga.wecide.decision.NegativeDecision;
import de.egga.wecide.decision.PositiveDecision;
import de.egga.wecide.votes.Vote;

import java.util.List;

public class MajorityDecider implements Decider {

    @Override
    public Decision evaluateVotes(List<Vote> votes) {

        long votesInFavor = votes.stream().filter(v -> v.isInFavor()).count();
        float halfOfTheVotes = (float) votes.size() / 2;

        if (votesInFavor > halfOfTheVotes) {
            return new PositiveDecision();
        } else {
            return new NegativeDecision();
        }
    }
}
