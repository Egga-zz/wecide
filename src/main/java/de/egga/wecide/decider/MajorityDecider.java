package de.egga.wecide.decider;

import de.egga.wecide.decision.Decision;
import de.egga.wecide.decision.PositiveDecision;
import de.egga.wecide.votes.Vote;

import java.util.List;

public class MajorityDecider implements Decider {

    @Override
    public Decision evaluateVotes(List<Vote> votes) {
        return new PositiveDecision();
    }
}
