package de.egga.wecide.decider;

import de.egga.wecide.decision.DecisionStatus;
import de.egga.wecide.votes.Vote;

import java.util.List;

public class ConsentDecider implements Decider {

    public DecisionStatus evaluateVotes(List<Vote> votes) {
        for (Vote vote : votes) {
            if (vote.isAgainst()) {
                return DecisionStatus.CON;
            }
        }

        return DecisionStatus.PRO;
    }
}
