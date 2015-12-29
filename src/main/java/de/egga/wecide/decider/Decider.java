package de.egga.wecide.decider;

import de.egga.wecide.decision.DecisionStatus;
import de.egga.wecide.votes.Vote;

import java.util.List;

public interface Decider {

    DecisionStatus evaluateVotes(List<Vote> votes);
}
