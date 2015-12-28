package de.egga.wecide.decider;

import de.egga.wecide.decision.Decision;
import de.egga.wecide.decision.NegativeDecision;
import de.egga.wecide.decision.PositiveDecision;
import de.egga.wecide.votes.Vote;

import java.util.List;

public class ConsentDecider implements Decider {

    public Decision evaluateVotes(List<Vote> votes) {
        for (Vote vote : votes) {
            if (vote.isAgainst()) {
                return new NegativeDecision();
            }
        }

        return new PositiveDecision();
    }
}
