package de.egga.wecide.votes;

import static de.egga.wecide.votes.VoteStatus.AGAINST;

public class Vote {

    private final VoteStatus status;

    public Vote(VoteStatus status) {
        this.status = status;
    }

    public boolean isAgainst() {
        if (status == AGAINST) {
            return true;
        }
        return false;
    }
}
