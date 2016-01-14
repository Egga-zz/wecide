package de.egga.wecide.decider;

import de.egga.wecide.votes.Vote;
import de.egga.wecide.votes.VoteStatus;

import java.util.List;

import static de.egga.wecide.votes.VoteStatus.*;


public class ConsentDecider implements Decider {

    public VoteStatus evaluateVotes(List<Vote> votes) {
        for (Vote vote : votes) {
            if (vote.isCon()) {
                return CON;
            }
        }

        return PRO;
    }
}
