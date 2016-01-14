package de.egga.wecide.decider;

import de.egga.wecide.votes.Vote;
import de.egga.wecide.votes.VoteStatus;

import java.util.List;

public interface Decider {

    VoteStatus evaluateVotes(List<Vote> votes);
}
