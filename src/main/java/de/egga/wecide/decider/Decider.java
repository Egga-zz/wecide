package de.egga.wecide.decider;

import de.egga.wecide.decision.Decision;
import de.egga.wecide.votes.Vote;

import java.util.List;

public interface Decider {

    Decision evaluateVotes(List<Vote> votes);
}
